package ru.marshenina;

public class Cars extends Transport {

    private static String type = "Автомобиль";

    public Cars(String model, int mileage, String color) {

        super(model, mileage, color);
    }

    public void allAboutCar() {

        System.out.println(type + "\n" + "Модель: " + getModel() + "\nЦвет: " + getColor() + "\nПробег: " + getMileage() + "\n");
    }
}
