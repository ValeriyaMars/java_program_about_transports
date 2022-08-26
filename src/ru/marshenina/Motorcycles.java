package ru.marshenina;

public class Motorcycles extends Transport {

    private static String type = "Мотоцикл";
    public boolean haveMotoHelmet = false;

    public Motorcycles(String model, int mileage, String color) {
        super(model, mileage, color);
    }

    public void allAboutMoto() {
        System.out.println(type + "\n" + "Модель: " + getModel() + "\nЦвет: " + getColor() + "\nПробег: "
                + getMileage() + "\n" + "Шлем в комплекте: " + haveMotoHelmet + "\n");
    }
}
