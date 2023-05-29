package io.codelex.oop.cars;

import java.util.List;

public class CarMain {
    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Mercedes", 1925, "Germany");

        Car car1 = new Car("BMW", "i7", 119300.0, 2022, List.of(manufacturer1), EngineType.V12);
        Car car2 = new Car("Mercedes", " AMG C 63 S", 76695.0, 2020, List.of(manufacturer2), EngineType.V8);

        System.out.println("Car 1:");
        System.out.println("Name: " + car1.getName());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Year of Manufacture: " + car1.getYearOfManufacture());
        System.out.println("Manufacturer: " + car1.getManufacturerList());
        System.out.println("Engine Type: " + car1.getEngineType());

        System.out.println();

        System.out.println("Car 2:");
        System.out.println("Name: " + car2.getName());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Price: " + car2.getPrice());
        System.out.println("Year of Manufacture: " + car2.getYearOfManufacture());
        System.out.println("Manufacturer: " + car2.getManufacturerList());
        System.out.println("Engine Type: " + car2.getEngineType());

        System.out.println();

        CarService carService = new CarService();

        carService.addCar(car1);
        carService.addCar(car2);

        System.out.println("All Cars:");
        carService.getAllCars().forEach(System.out::println);

        System.out.println("\nCars with V12 Engine:");
        carService.getCarsWithV12Engine().forEach(System.out::println);

        System.out.println("\nCars Produced Before 2015:");
        carService.getCarsProducedBeforeYear(1999).forEach(System.out::println);

        System.out.println("\nMost Expensive Car:");
        System.out.println(carService.getMostExpensiveCar());

        System.out.println("\nCheapest Car:");
        System.out.println(carService.getCheapestCar());

        System.out.println("\nCars with at Least 3 Manufacturers:");
        carService.getCarsWithMultipleManufacturers(2).forEach(System.out::println);

        System.out.println("\nCars Sorted by Price (Ascending):");
        carService.getCarsSortedByPrice(true).forEach(System.out::println);

        System.out.println("\nCars Sorted by Price (Descending):");
        carService.getCarsSortedByPrice(false).forEach(System.out::println);

        System.out.println("\nHas Car2: " + carService.hasCar(car2));

        System.out.println("\nCars Manufactured by Manufacturer1:");
        carService.getCarsByManufacturer(manufacturer1).forEach(System.out::println);

        System.out.println("\nCars Manufactured by Manufacturer1 with Establishment Year > 2005:");
        carService.getCarsByManufacturerAndYearComparison(manufacturer1, ">", 2005).forEach(System.out::println);

    }
}
