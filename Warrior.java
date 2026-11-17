package org.example;

public class Warrior extends Character{

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    void attack(Character target) {
        int damage = 15;
        if (target instanceof Warrior) {
            damage /= 2;
        }
        target.setHealth(target.getHealth() - damage);
        System.out.println(getName() + " наносит по " + target.getName() + " " + damage + " урона");
    }
}
