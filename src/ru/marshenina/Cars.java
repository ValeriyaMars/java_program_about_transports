package ru.marshenina;

public class Cars {
    private String model;
    private int mileage;
    private String color;

    public Cars(String model, int mileage, String color) {
        this.model = model;
        this.mileage = mileage;
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    void go(int mileage){
       this.mileage = this.mileage + mileage;
    }

    void technicalInspection(){
        boolean okTechnicalInspection = mileage <= 100000;
        boolean nowTechnicalInspection = mileage > 100000 && mileage < 200000;

        if(okTechnicalInspection){
            System.out.println("Все ок c " + model + "!\n");
        } else if(nowTechnicalInspection){
            System.out.println("Пора пройти техосмотр для " + model + "!\n");
        } else{
            System.out.println("Пора продавать " + model + "!\n");
        }
    }

    void allAboutCar(){
        System.out.println("Модель: " + getModel() + "\nЦвет: " + getColor() + "\nПробег: " + getMileage() + "\n");
    }

    void countDistanceBeforeTechnicalInspection(int mileage, int distance){
        int count = 0;
        for(int i = 1; mileage < 100000; i++){
            mileage = mileage + distance;
            count = i;
        }
        System.out.println("Вы проедете " + distance + "км до тех.осмотра " + count + " раз(а).");
    }
}
