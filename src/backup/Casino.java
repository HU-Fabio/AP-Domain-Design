package backup;

import java.util.ArrayList;

public class Casino {
    String name;
    ArrayList<Table> tables;

    public Casino(String name) {
        this.name = name;
    }

    public void addTable(Table table) {
        this.tables.add(table);
    }

    public void removeTable(Table table) {
        this.tables.remove(table);
    }
}
