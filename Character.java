package org.example;

abstract class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return getClass().getSimpleName() + ": " + name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    abstract void attack(Character target);

    public boolean isAlive() {
        return health > 0;
    }
}
