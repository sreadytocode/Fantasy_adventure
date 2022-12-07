package player.type.caster;

import enum_data.Race;
import player.Inventory;
import player.Player;

import java.util.ArrayList;

public class Caster extends Player {

    public Caster(String name, Race race, int health, int level, ArrayList<Inventory> item) {
        super(name, race, health, level, item);
    }
}
