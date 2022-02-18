package ru.skypro;

public interface Interface {
    String getModelName();

    void setModelName(String modelName);

    int getWheelsCount();

    void setWheelsCount(int wheelsCount);

    void check(Car car, Bicycle bicycle, Truck truck);
}
