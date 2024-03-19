package ua.hillel.zirukin.homeworks.homework5;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(int id, String brand, String model, int year, String color, double price, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    // Геттери і сеттери

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Методи для виконання зазначених запитів

    public static List<Car> getCarsByBrand(List<Car> cars, String brand) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> getCarsByModelAndAge(List<Car> cars, String model, int age) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && car.calculateAge() > age) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> getCarsByYearAndPrice(List<Car> cars, int year, double minPrice) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > minPrice) {
                result.add(car);
            }
        }
        return result;
    }

    // Допоміжний метод для обчислення віку автомобіля

    private int calculateAge() {
        return java.time.LocalDate.now().getYear() - this.year;
    }

    // Точка входу

    public static void main(String[] args) {
        // Створення масиву об'єктів Car
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Corolla", 2018, "Red", 15000.00, "ABC123"));
        cars.add(new Car(2, "Honda", "Civic", 2015, "Blue", 12000.00, "XYZ789"));
        cars.add(new Car(3, "Toyota", "Camry", 2016, "Black", 18000.00, "DEF456"));

        // Приклад викликів методів
        System.out.println("Список автомобілів заданої марки:");
        List<Car> toyotaCars = Car.getCarsByBrand(cars, "Toyota");
        for (Car car : toyotaCars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear());
        }

        System.out.println("\nСписок автомобілів заданої моделі, що експлуатуються більше 5 років:");
        List<Car> oldCars = Car.getCarsByModelAndAge(cars, "Corolla", 5);
        for (Car car : oldCars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear());
        }

        System.out.println("\nСписок автомобілів заданого року випуску, ціна яких більша за 13000:");
        List<Car> expensiveCars = Car.getCarsByYearAndPrice(cars, 2016, 13000.00);
        for (Car car : expensiveCars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear() + " " + car.getPrice());
        }
    }
}
