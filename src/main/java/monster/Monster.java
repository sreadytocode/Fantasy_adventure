package monster;

import enum_data.ElementTypes;

public class Monster {

    private String name;
    private String description;
    ElementTypes elementTypes;
    private int health;
    private int attackStrength;
    private int defence;
    private int level;

    public Monster(String name, String description, ElementTypes elementTypes, int health, int attackStrength, int defence, int level) {
        this.name = name;
        this.description = description;
        this.elementTypes = elementTypes;
        this.health = health;
        this.attackStrength = attackStrength;
        this.defence = defence;
        this.level = level;
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

    public int getHealth() {
        return health;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public int getDefence() {
        return defence;
    }

    public int getLevel() {
        return level;
    }
}
