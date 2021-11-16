package guru.qa;

public class Pokemon {
    public static String commonName = "Покемон";

    private String name;
    private int pokedexNumber;
    private String type;
    Head head;



    public static class Head {
        String color;

        public Head(String color) {
            this.color = color;
        }

        public void sayColor() {
            System.out.println("My head is " + color);
        }

    }

    public Pokemon(String name, int pokedexNumber, String type) {
        this.name = name;
        this.pokedexNumber = pokedexNumber;
        this.type = type;
    }

    public void fight() {
        System.out.println(this.name + " is fighting!");
    }

    public void printType() {
        System.out.println("My type is "+ this.type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public void setPokedexNumber(int pokedexNumber) {
        this.pokedexNumber = pokedexNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
