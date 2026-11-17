package org.example;


public class Main {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Ivan", 200);
        Employee empl2 = new Employee("Alexey", 220);
        Employee empl3 = new Employee("Mihail", 300);

        HRManager hrm1 = new HRManager("Anton");

        hrm1.applySalaryChange(empl1);
        hrm1.applySalaryChange(empl2);
        hrm1.applySalaryChange(empl3);

        empl1.getStatus();
        empl2.getStatus();
        empl3.getStatus();

        System.out.println(" ");

        Warrior war1 = new Warrior("Artem", 60);
        Warrior war2 = new Warrior("Vasiliy", 60);
        Mage mag1 = new Mage("Ekaterina", 50, 50);
        Mage mag2 = new Mage("Vladimir", 50, 50);

        Arena arena1 = new Arena();

        arena1.addParticipant(war1);
        arena1.addParticipant(war2);
        arena1.addParticipant(mag1);
        arena1.addParticipant(mag2);

        arena1.startBattle();
    }
}