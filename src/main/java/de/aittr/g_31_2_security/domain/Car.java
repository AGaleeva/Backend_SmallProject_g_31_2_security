package de.aittr.g_31_2_security.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "year")
    private int year;

    @Column(name = "price")
    private double price;

    public Car() {
    }

    public Car(int id, String brand, int year, double price) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return id == car.id && year == car.year && Double.compare(price, car.price) == 0 && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, year, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", year=").append(year);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}