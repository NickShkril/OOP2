package ru.skypro;

public class Bicycle extends Vehicle implements BicycleVehicle {

    public Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}