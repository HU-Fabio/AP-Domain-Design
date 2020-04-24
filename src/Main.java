import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Dierenpark Amersfoort");
//      Create cricket cage

        Cricket herman = new Cricket(1, "Herman", 10, "Cricket");
        Cricket sjon = new Cricket(2, "Sjon", 8, "Cricket");

        ArrayList<Cricket> crickets = new ArrayList<>();
        crickets.add(herman);
        crickets.add(sjon);

        Cage<Cricket> cricketCage = new Cage<>(1, "Bad jokes cage", crickets);

        zoo.addCage(cricketCage);

//      Create tiger cage
        Tiger alex = new Tiger(1, "Alex", 4, "Tiger");
        Tiger morty = new Tiger(2, "Morty", 4, "Tiger");

        ArrayList<Tiger> tigers = new ArrayList<>();
        tigers.add(alex);
        tigers.add(morty);

        Cage<Tiger> tigerCage = new Cage<>(2, "Tiger cage", tigers);

        zoo.addCage(tigerCage);

//      Create monkey cage
        Monkey mason = new Monkey(1, "Mason", 6, "Monkey");
        Monkey phil = new Monkey(2, "Phil", 7, "Monkey");

        ArrayList<Monkey> monkeys = new ArrayList<>();
        monkeys.add(mason);
        monkeys.add(phil);

        Cage<Monkey> monkeyCage = new Cage<>(3, "Monkey island", monkeys);

        System.out.println(zoo.toString());

        System.out.println(cricketCage);

        System.out.println(monkeyCage);

        System.out.println(tigerCage);

        for(Cricket animal : cricketCage.getAnimals()) {
            animal.speak();
        }

        for (Tiger animal : tigerCage.getAnimals()) {
            animal.speak();
        }

        for(Monkey animal : monkeyCage.getAnimals()) {
            animal.speak();
        }


//        System.out.println(zoo.toString());
    }
}
