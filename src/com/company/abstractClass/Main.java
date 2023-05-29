package com.company.abstractClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Класс объект
        Car car = new Car.BuilderCar()
                .setModel("Toyota")
                .setSpeed(100)
                .build();
        System.out.println(car);
    }
}

class Car {
    // аттрибуты класса

    // public
    // default
    // protected
    // private

    private String model;
    private int speed;
    private String country;
    private int price;
    private int place;
    private String region;

    public Car() {
    }

    // builder pattern

    static class BuilderCar {
        Car car;

        public BuilderCar() {
            car = new Car();
        }

        BuilderCar setModel(String model) {
            car.model = model;
            return this;
        }

        BuilderCar setSpeed(int speed) {
            car.speed = speed;
            return this;
        }

        Car build() {
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", place=" + place +
                ", region='" + region + '\'' +
                '}';
    }
}
