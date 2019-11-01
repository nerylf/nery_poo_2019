package pacote;
import java.util.ArrayList;

public class User{
    Repositorio<String, User> seguidores;
    Repositorio<String, User> seguidos;
    String id;

    ArrayList<Tweet> tweets;

    public User(String id) {
        this.id = id;
        this.seguidores = new Repositorio<String, User>();
        this.seguidos = new Repositorio<String, User>();
        this.tweets = new ArrayList<Tweet>();
    }

    public Repositorio<String, User> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(Repositorio<String, User> seguidores) {
        this.seguidores = seguidores;
    }

    public Repositorio<String, User> getSeguidos() {
        return seguidos;
    }

    public void setSeguidos(Repositorio<String, User> seguidos) {
        this.seguidos = seguidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        /*
        return "" + this.id + "\n" + "  seguindo " + this.seguidos + "\n" + "  seguidores "
                + this.seguidores + "\n";
        */
        String out = "\n    Seguidores [ ";
        for (User s : seguidores.getAll()){
            out += s.getId() + ", ";
        }
        out += "]\n    Seguidos [ ";
        for (User s : seguidos.getAll()){
            out += s.getId() + ", ";
        }
        return this.id + out + "]\n";
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public String timeLine(){
        String out = " ";
        int x = 0;
        for(Tweet t : this.tweets){
            out += "[ " + x + " = " + t + ", ";
            x ++;
        }
        return this.id + out + "\n";

    }

}