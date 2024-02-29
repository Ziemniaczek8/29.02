package Zad_12;

import java.time.LocalDate;
import java.util.Objects;

public class Manufacturer {

    private String name;
    private LocalDate yearOfFundation;
    private String countryOfOrigin;

    public Manufacturer(String name, LocalDate yearOfFundation, String countryOfOrigin) {
        this.name = name;
        this.yearOfFundation = yearOfFundation;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYearOfFundation() {
        return yearOfFundation;
    }

    public void setYearOfFundation(LocalDate yearOfFundation) {
        this.yearOfFundation = yearOfFundation;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) && Objects.equals(yearOfFundation, that.yearOfFundation) &&
                Objects.equals(countryOfOrigin, that.countryOfOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFundation, countryOfOrigin);
    }
}
