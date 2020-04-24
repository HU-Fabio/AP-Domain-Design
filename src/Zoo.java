import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Cage> cages;

    public Zoo(String name) {
        this.name = name;
        this.cages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Cage> getCages() {
        return cages;
    }

    public void addCage(Cage cage) {
        this.cages.add(cage);
    }

    @Override
    public String toString() {
        return "Welcome to: " + this.name + "\n";
    }
}
