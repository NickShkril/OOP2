package ru.skypro;

public class Bicycle extends ServiceStation {
    public Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}