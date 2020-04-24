package backup;

import java.util.ArrayList;

public class Table<Type> {
    private int id;
    private ArrayList<Player> players;
    Type type;

    public Table(int id, Type type) {
        this.id = id;
        this.type = type;
        this.players = new ArrayList<Player>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "backup.Table{" +
                "id=" + id +
                ", players=" + players +
                ", type=" + type +
                '}';
    }
}
