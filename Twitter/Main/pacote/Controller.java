package pacote;

public class Controller{
    public static void main(String[] args) {
        Repositorio<String, User> usuarios = new Repositorio<String, User>();

        usuarios.add("Batman", new User("Batman"));
        usuarios.add("Robin", new User("Robin"));

        System.out.println(usuarios.getAll());
    }
}