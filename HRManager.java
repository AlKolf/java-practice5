package org.example;

import  java.util.Random;

public class HRManager {
    private String name;


    HRManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public void applySalaryChange(Employee employee) {
        int num = rollDice();
        String output = "";
        if (num == 3 | num == 6) {
            double salary = employee.getSalary();
            salary = (salary / 100) * 80;
            employee.setSalary(salary);
            output = "зарплата изменена, ";
        }
        System.out.println(name + ", " + employee.getName() + ", " + num + ", " + output + employee.getSalary() + "руб.");
    }
}
