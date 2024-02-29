package Zad_12;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String brand;
    private int price;
    private LocalDate yearOfProduction;
    private List<Manufacturer> manufacturers;
    private Engine engine;

    public Car(String name,
               String brand,
               int price,
               LocalDate yearOfProduction,
               List<Manufacturer> manufacturers,
               Engine engine) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.manufacturers = manufacturers;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(LocalDate yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name) && Objects.equals(brand, car.brand)
                && Objects.equals(yearOfProduction, car.yearOfProduction)
                && Objects.equals(manufacturers, car.manufacturers) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, price, yearOfProduction, manufacturers, engine);
    }
}
