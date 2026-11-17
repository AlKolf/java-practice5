package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Arena {
    private static int totalBattles;
    private ArrayList<Character> listCharacter;

    Arena () {
        this.listCharacter = new ArrayList<>();
    }

    public void addParticipant(Character participant) {
        listCharacter.add(participant);
    }

    public static int getTotalBattles() {
        return totalBattles;
    }

    public void startBattle() {
        while (true) {
            int countIsAlive = 0;
            for (Character character : listCharacter) {
                countIsAlive += character.isAlive() ? 1 : 0;
            }
            if (countIsAlive < 2) {
                System.out.println("У нас есть победитель!");
                for (Character character : listCharacter) {
                    if (character.isAlive()) {
                        System.out.println(character.getName() + " c " + character.getHealth() + " здоровья");
                        break;
                    }
                }
                System.out.println("Всего боёв потребовалось: " + totalBattles);
                break;
            }
            Random rand = new Random();
            for (Character character : listCharacter) {
                Character target = null;
                if (character.isAlive()) {
                    while (true) {
                        target = listCharacter.get(rand.nextInt(listCharacter.size()));
                        if (target == character) {
                            continue;
                        } else if (target.isAlive()) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    character.attack(target);
                }
            }
            totalBattles += 1;
        }
    }
}
