package com.Anibaba;

class Car{
    private String carId;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean isAvailable;

    // here i have made constructor to add car by admin
    public Car(String carId, String brand, String model, double pricePerDay){
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }
    public String getCarId(){
        return carId;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void rentCar(){
        isAvailable=false;
    }
    public void returnCar(){
        isAvailable=true;
    }
    public double calculateRent(int rentDays){
        return pricePerDay*rentDays;
    }
}

class Customer{
    private String cId;
    private  String cName;

    public Customer(String cId, String cName){
        this.cId = cId;
        this.cName = cName;
    }

    public String getcId() {
        return cId;
    }

    public String getcName() {
        return cName;
    }
}

class Rental{
    private Car car;
    private Customer customer;
    private int days;

    public  Rental(Car car, Customer customer,int days){
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
}

class  CarRentalSystem{

}
public class Main {

    public static void main(String[] args) {

    }
}
