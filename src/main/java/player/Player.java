package player;

import enum_data.Race;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    Race race;
    private int health;
    private int level;
    private ArrayList<Inventory> item;

    public Player(String name, Race race, int health, int level, ArrayList<Inventory> item) {
        this.name = name;
        this.race = race;
        this.health = health;
        this.level = level;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<Inventory> getItem() {
        return item;
    }

    public int getItemCount() {
        return item.size();
    }
}
