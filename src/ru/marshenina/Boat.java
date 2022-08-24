package ru.marshenina;

public class Boat extends Transport {

    private static String type = "Лодка";
    private int enginePower;

    public Boat(String model, String color, int enginePower) {

        super(model, color);
        this.enginePower = enginePower;
    }

    public void allAboutBoat() {

        System.out.println(type + "\n" + "Модель: " + getModel() + "\nЦвет: " + getColor()
                + "\n" + "Мощность двигателя: " + enginePower + "\n");
    }

}
