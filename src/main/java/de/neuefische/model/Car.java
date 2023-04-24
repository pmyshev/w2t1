package de.neuefische.model;

public class Car {
    private String brand;
    int year;
    double price;
    static boolean hasFourWheels = true;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }
    public void honks() {
        System.out.println("HONK!");
    }

    public void  printBrand() {
        System.out.println(brand);
    }
}
