package com.kodilla;

class vehicle1 {
    private String model;
    private String year;
    public vehicle1(String model, String year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return this.model;
    }
    public String getYear() {
        return this.year;
    }
}
class Car extends vehicle1 {
    private double engineCapacity;

    public Car(double engineCapacity, String model, String year) {


        super(model, year);
        this.engineCapacity = engineCapacity;
    }

    public void turnOnEngine() {
    }

    public void turnOffEngine() {
    }

    public double getEngineCapacity() {
        return this.engineCapacity;
    }
}
class Aplication2 {
    public static void main(String[] args) {  // [1]
        Car car = new Car(2.5, "JWT", "2001"); // [2]
        String model = car.getModel();// [3]
        String year = car.getYear();
        double engineCapacity = car.getEngineCapacity();
        System.out.println(model + " " + year + " " + engineCapacity );             // [4]
    }
}