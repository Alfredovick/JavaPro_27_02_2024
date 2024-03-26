package ua.hillel.zirukin.homeworks.homework7;
import java.util.Objects;


public class Car {
    private String brand;
    private Wheel wheel;

    public Car(String brand, Wheel wheel) {
        this.brand = brand;
        this.wheel = wheel;
    }

    public String getBrand() {
        return brand;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void drive() {
        System.out.println("The car is driving.");
    }

    public void refuel() {
        System.out.println("The car is refueling.");
    }

    public void changeWheel(Wheel newWheel) {
        this.wheel = newWheel;
        System.out.println("The wheel has been changed.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(wheel, car.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, wheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", wheel=" + wheel.getBrand() +
                '}';
    }
}
