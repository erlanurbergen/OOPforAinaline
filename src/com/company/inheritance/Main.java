package com.company.inheritance;

public class Main {
    public static void main(String[] args) {
        // Наследование расширение родительского класса

        Device device = new Device("Dev1");
        Mobile mobile = new Mobile("Samsung", 200000, 11.9);
//        device.showDetails();
//        mobile.showDetails();

        Device devices[] = {device, mobile};
        for (Device device1 : devices) {
            if (device1 instanceof Mobile)
                device1.showDetails();
        }

    }
}

// parent class
class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    void showDetails() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Mobile extends Device {
    private int price;
    private double sizeDisplay;

    public Mobile(String name, int price, double sizeDisplay) {
        super(name);
        this.price = price;
        this.sizeDisplay = sizeDisplay;
    }

    @Override
    // полиморфизмом
    void showDetails() {
        super.showDetails();
        System.out.println(price + " " + sizeDisplay);
    }
}


