package player.type.caster;

import enum_data.ElementTypes;

public class Spell {


    private String name;
    private String description;
    ElementTypes elementTypes;
    private int damage;

    public Spell(String name, String description, ElementTypes elementTypes, int damage) {
        this.name = name;
        this.description = description;
        this.elementTypes = elementTypes;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDamage() {
        return damage;
    }

    public ElementTypes getElementType() {
        return elementTypes;
    }
}
