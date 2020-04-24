import java.util.ArrayList;

public class Cage<Type> {
    private int id;
    private String name;
    private ArrayList<Type> animals;

    public Cage(int id, String name, ArrayList<Type> animals) {
        if (animals.size() < 2) {
            System.out.println("You need to add atleast 2 animals to the cage");
            System.exit(1);
        } else {
            this.id = id;
            this.name = name;
            this.animals = animals;
        }

    }

    public void addAnimals(Type animal) {
        this.animals.add(animal);
    }

    public ArrayList<Type> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("In de ").append(this.name).append(" zitten de volgende dieren: \n");
        for (Type animal : animals) {
            returnString.append(animal.toString()).append("\n");
        }

        return returnString.toString();
    }
}
