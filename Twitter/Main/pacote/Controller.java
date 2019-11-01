package pacote;

public class Controller{
    public static void main(String[] args) {
        
        try{
        /*
        Repositorio<String, User> usuarios = new Repositorio<String, User>();

        usuarios.add("Batman", new User("Batman"));
        usuarios.add("Robin", new User("Robin"));

        System.out.println(usuarios.getAll());
        */
        
        Twitter twitter = new Twitter();

        twitter.usuarios.add("Opa", new User("Opa da Silva"));
        twitter.usuarios.add("Alo", new User("Alo Oliveira"));
        twitter.usuarios.add("123123", new User("123123"));
        twitter.usuarios.add("890890", new User("890890"));
        
        twitter.seguir("Opa", "Alo");
        twitter.seguir("123123", "Alo");
        twitter.seguir("890890", "Alo");
        twitter.seguir("Alo", "Opa");

        twitter.twittar("Alo", "Vc eh uma vergonha pra porfisson!");
        twitter.twittar("Opa", "123123123123123");
        twitter.twittar("123123", "Vc eh uma vergonha pra porfisson!");
        twitter.twittar("Alo", "123123123123123");
        twitter.twittar("Alo", "Vc eh uma vergonha pra porfisson!");

        System.out.println(twitter.usuarios.get("Alo").timeLine());
        
        twitter.like("Opa", "Alo", 0);
        twitter.like("Opa", "Alo", 1);
        twitter.like("Opa", "Alo", 2);

        System.out.println(twitter.usuarios.get("Alo").timeLine());


        //System.out.println(twitter.usuarios.getAll());

        
        
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        
        
    }
}