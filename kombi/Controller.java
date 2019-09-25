import java.util.ArrayList;
import java.util.Scanner;

class Cadeira{
    private boolean pref;
    private boolean ocupada;

    Cadeira (boolean pref){
        this.pref = pref;
        this.ocupada = false;
    }

    public boolean isPref() {
        return pref;
    }

    public void setPref(boolean pref) {
        this.pref = pref;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        String string = "";

        if (this.pref)
            string += "@";
        else
            string += "=";

        if (this.ocupada)
            string += "X";
        
        return string;
        
        
    }
    
}


class Pass{
    String id;
    int age;

    public Pass(String id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + ":" + age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Kombi{
    int cap;
    int pref;
    ArrayList<Cadeira> cadList;
    ArrayList<Pass> passList;


    public Kombi (int cap, int pref){
        this.cap = cap;
        if (pref > cap){
            System.out.println("pref setado para " + cap);
            this.pref = pref;
        }else   
            this.pref = pref;

        cadList = new ArrayList<Cadeira>();
        passList = new ArrayList<Pass>();


        for (int i = 0; i < cap; i++){
            if (i < pref)
                cadList.add(new Cadeira(true));
            else
                cadList.add(new Cadeira(false));
        }

        for (int i = 0; i < cap; i++){
            passList.add(null);
        }
    }

    void passIn(Pass pass){
        for (int i = 0; i < passList.size(); i ++){
            /*
            if (passList.get(i) == null)
                System.out.println("null");
            else{
                System.out.println(passList.get(i).getId() + " " + pass.getId());
                if (passList.get(i).getId() == pass.getId())
                    System.out.println("ENTROU");
            }
            */
            
            if (passList.get(i) != null && passList.get(i).getId().equals(pass.getId())){
                
                System.out.println("fail: " + pass.getId() + " ja esta na kombi do balacubaco!");
                return;
            }
        }        

        boolean p = true;
        boolean n = true;
        if (pass.getAge() > 60){
            p = prefIn(pass);
            if (!p){
                n = normalIn(pass);
            }
        }
        else{
            n = normalIn(pass);
            //System.out.println(n);
            if (!n){
                //System.out.println("Entrou");
                p = prefIn(pass);
            }
        }
        if (!p && !n)
            System.out.println("fail: topic lotada");

        /*
        else {
            System.out.println("Passageiro embarcando!!");
            passList.set(index, pass);
            cadList.get(index).setOcupada(true);
        }
        */
    }

    private boolean prefIn(Pass pass){
        

        for (int i = 0; i < pref; i++){
            if (passList.get(i) != null)
                continue;
            else{
                //System.out.println("OPa");
                System.out.println(pass.getId() + " sentou na preferencial!");
                passList.set(i, pass);
                cadList.get(i).setOcupada(true);
                return true;
            }
        }

        return false;
    }

    private boolean normalIn(Pass pass){
        

        for (int i = pref; i < cap; i++){
            if (passList.get(i) != null){
                //System.out.println(i);
                continue;
            }else{
                //System.out.println("OPa");
                System.out.println(pass.getId() + " sentou na normal!");
                passList.set(i, pass);
                cadList.get(i).setOcupada(true);
                return true;
            }
        }

        return false;


    }
    void saiDai(String id){
        for (int i = 0; i < passList.size(); i ++){
            if (passList.get(i) != null && passList.get(i).getId().equals(id)){
                System.out.println(id + " saindo!");
                passList.set(i, null);
            }
            else
                continue;       

            return;
        }
        System.out.println("fail: " + id + " nao esta na kombi do balacubaco!");

    }

    

    @Override
    public String toString() {
        String out = "Kombi do balacubaco [";

        for (int i = 0; i < this.cap; i ++){
            if (cadList.get(i).isPref())
                out += " @";
            else
                out += " =";

            if (passList.get(i) != null)
                out += passList.get(i).getId() + ":" + passList.get(i).getAge();
            
            if (i < this.cap - 1)
                out += " |";
            
        }

        out += " ]";

        return out;
    }

    

}

public class Controller {
    public static void main(String[] args) {
        Kombi kombi = null;
        Scanner scanner = new Scanner(System.in);
        
        String line;
        String[] ui;
        /*

        kombi = new Kombi(5, 2);
        
        kombi.passIn(new Pass ("Opa", 20));
        kombi.passIn(new Pass ("Opa", 20));

        kombi.passIn(new Pass ("Opinha", 100));

        System.out.println(kombi);
        */

        
        while (true){
            System.out.println("-------------------------------------------------------");
            System.out.println("show; init cap pref; entra id age; sai id; explodirKombi; exit");
            System.out.println("-------------------------------------------------------");

            line = scanner.nextLine();
            ui = line.split(" ");

            if (ui[0].equals("exit"))
                break;

            if (ui[0].equals("init")){
                if (kombi != null){
                    System.out.println("fail: kombi ja criada");
                    continue;
                }
                System.out.println("Criando Kombi do balacubaco!");
                kombi = new Kombi (Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }
            else if (kombi == null){
                System.out.println("fail: nunhuma kombi do balacubaco encontrada!");
                continue;
            }


            if (ui[0].equals("show")){
                System.out.println("*********************************************");                
                System.out.println(kombi);        
                System.out.println("*********************************************"); 
            }

            if (ui[0].equals("entra")){
                kombi.passIn(new Pass(ui[1], Integer.parseInt(ui[2])));
            }
            if (ui[0].equals("sai")){
                kombi.saiDai(ui[1]);
            }
            if (ui[0].equals("explodirKombi")){
                System.out.println("Adeus mundo cruel!");
                kombi = null;
            }
            
            
        }
        
    }
}
