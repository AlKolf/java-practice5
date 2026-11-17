package org.example;

import java.util.Random;

public class Mage extends Character {
    private int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    void attack(Character target) {
        if (mana < 10) {
            System.out.println("У " + getName() + " недостаточно маны!");
            mana += 5;
        } else {
            Random rand = new Random();
            int damage = 10 + rand.nextInt(16);
            mana -= 10;
            target.setHealth(target.getHealth() - damage);
            System.out.println(getName() + " наносит по " + target.getName() + " " + damage + " урона");
        }
    }
}
