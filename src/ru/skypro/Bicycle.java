package ru.skypro;

public class Bicycle extends Vehicle implements GroundVehicle {

    public Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        {
            System.out.println("Проверяем двигатель");
        }
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}