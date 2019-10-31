package pacote;

public class User{
    Repositorio<String, User> seguidores;
    Repositorio<String, User> seguidos;
    String id;

    public User(String id) {
        this.id = id;
    }

    public void seguir(String id){
        if (seguidos.get(id) != null){
            System.out.println(this.id + " ja segue " + id + ", seu safado");
            return;
        }
    }


}