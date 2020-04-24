public class Monkey implements Animal {
    private int id;
    private String name;
    private int age;
    private String type;

    public Monkey(int id, String name, int age, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void speak() {
        System.out.println(this.name + " says: Monkey noises \n");
    }

    @Override
    public String toString() {
        return "Naam: " + this.name + " Leeftijd: " + this.age;
    }
}
