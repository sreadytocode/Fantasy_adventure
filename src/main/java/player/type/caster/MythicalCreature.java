package player.type.caster;

import enum_data.ElementTypes;

public class MythicalCreature {

    private String name;
    private String description;
    ElementTypes elementTypes;
    private int damage;
    private int defence;

    public MythicalCreature(String name, String description, ElementTypes elementTypes, int damage, int defence) {
        this.name = name;
        this.description = description;
        this.elementTypes = elementTypes;
        this.damage = damage;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ElementTypes getElementType() {
        return elementTypes;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefence() {
        return defence;
    }
}
