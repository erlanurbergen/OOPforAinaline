package com.company.interfaces;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String text = "I love Java"; // набор символов

    }
}
class Entity {
    private String name;

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                '}';
    }
}


interface FixTaxes {
    void checkTax(Entity entity);
}

interface Something {

}

class IP extends Entity {
    private int employees;

    public IP(String name, int employees) {
        super(name);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "IP{" +
                "employees=" + employees +
                '}';
    }
}

class TOO extends Entity {
    private int employees;

    public TOO(String name, int employees) {
        super(name);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "TOO{" +
                "employees=" + employees +
                '}';
    }
}

class Akimat implements FixTaxes, Something {
    private String name;
    Map<Entity, Double> entityDoubleMap = new HashMap<>();


    public Akimat(String name) {
        this.name = name;
    }

    @Override
    public void checkTax(Entity entity) {
        if (entity instanceof IP) {
            entityDoubleMap.put(entity, ((IP) entity).getEmployees() * 0.003);
        } else if (entity instanceof TOO)
            entityDoubleMap.put(entity, ((TOO) entity).getEmployees() * 0.006);
    }

    void printMap() {
        entityDoubleMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
    }
}

