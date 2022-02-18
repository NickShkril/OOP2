package ru.skypro;

public class Truck extends ServiceStation {


    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
