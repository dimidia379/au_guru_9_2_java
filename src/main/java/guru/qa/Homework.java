package guru.qa;

public class Homework {
    public static void main(String[] args) {

        Pokemon bulbasaur = new Pokemon("Bulbasaur", 1, "grass");
        Pokemon charmander = new Pokemon("Charmander", 4, "fire");

        charmander.printType();
        charmander.setType("grass");
        charmander.printType();

        charmander.fight();
        bulbasaur.fight();

        System.out.println(Pokemon.commonName);

        charmander.head = new Pokemon.Head("green");
        charmander.head.sayColor();

        bulbasaur.head = new Pokemon.Head("blue");
        bulbasaur.head.sayColor();
    }
}
