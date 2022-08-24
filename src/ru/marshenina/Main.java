package ru.marshenina;

public class Main {
    public static void main(String[] args) {
        Cars car = new Cars("Volvo", 50000, "White");
        car.go(50000);
        car.allAboutCar();
        car.technicalInspection();
        car.go(50000);
        car.allAboutCar();
        car.technicalInspection();

        Cars car2 = new Cars("Lada", 100000, "Black");
        car2.allAboutCar();
        car2.technicalInspection();
        car2.go(100000);
        car2.allAboutCar();
        car2.setColor("Green");
        car2.technicalInspection();
        car2.allAboutCar();

        Cars car3 = new Cars("Hyundai", 0, "Blue");
        car3.countDistanceBeforeTechnicalInspection(1000, 2000);

        Motorcycles moto = new Motorcycles("BMW", 150000, "Green");
        moto.allAboutMoto();
        moto.haveMotoHelmet = true;
        moto.allAboutMoto();

        Boats boat = new Boats("Вихрь", "Silver", 40);
        boat.allAboutBoat();
    }

}
