package ru.skypro;

public class Car extends Vehicle implements CarVehicle {

    public Car(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    }

