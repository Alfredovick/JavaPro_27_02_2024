package ua.hillel.zirukin.homeworks.homework7;

public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("Michelin");
        Car car = new Car("Toyota", wheel);


        car.drive();
        car.refuel();
        car.changeWheel(new Wheel("Goodyear"));
        System.out.println("Car brand: " + car.getBrand());
    }
}
