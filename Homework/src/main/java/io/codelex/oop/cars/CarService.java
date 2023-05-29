package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private final List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getAllCars() {
        return carList;
    }

    public List<Car> getCarsWithV12Engine() {
        return carList.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBeforeYear(int year) {
        return carList.stream()
                .filter(car -> car.getYearOfManufacture() < year)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return carList.stream()
                .max(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public Car getCheapestCar() {
        return carList.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public List<Car> getCarsWithMultipleManufacturers(int minManufacturers) {
        return carList.stream()
                .filter(car -> car.getManufacturerList().size() >= minManufacturers)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsSortedByPrice(boolean ascending) {
        return carList.stream()
                .sorted(ascending ? Comparator.comparing(Car::getPrice) : Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public boolean hasCar(Car car) {
        return carList.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return carList.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByManufacturerAndYearComparison(Manufacturer manufacturer, String comparison, int year) {
        return switch (comparison) {
            case "<" -> carList.stream()
                    .filter(car -> car.getManufacturerList().contains(manufacturer))
                    .filter(car -> car.getManufacturerList().stream()
                            .anyMatch(man -> man.getYearOfEstablishment() < year))
                    .collect(Collectors.toList());
            case ">" -> carList.stream()
                    .filter(car -> car.getManufacturerList().contains(manufacturer))
                    .filter(car -> car.getManufacturerList().stream()
                            .anyMatch(man -> man.getYearOfEstablishment() > year))
                    .collect(Collectors.toList());
            case "<=" -> carList.stream()
                    .filter(car -> car.getManufacturerList().contains(manufacturer))
                    .filter(car -> car.getManufacturerList().stream()
                            .anyMatch(man -> man.getYearOfEstablishment() <= year))
                    .collect(Collectors.toList());
            case ">=" -> carList.stream()
                    .filter(car -> car.getManufacturerList().contains(manufacturer))
                    .filter(car -> car.getManufacturerList().stream()
                            .anyMatch(man -> man.getYearOfEstablishment() >= year))
                    .collect(Collectors.toList());
            case "=" -> carList.stream()
                    .filter(car -> car.getManufacturerList().contains(manufacturer))
                    .filter(car -> car.getManufacturerList().stream()
                            .anyMatch(man -> man.getYearOfEstablishment() == year))
                    .collect(Collectors.toList());
            case "!=" -> carList.stream()
                    .filter(car -> car.getManufacturerList().contains(manufacturer))
                    .filter(car -> car.getManufacturerList().stream()
                            .anyMatch(man -> man.getYearOfEstablishment() != year))
                    .collect(Collectors.toList());
            default -> new ArrayList<>();
        };
    }
}

