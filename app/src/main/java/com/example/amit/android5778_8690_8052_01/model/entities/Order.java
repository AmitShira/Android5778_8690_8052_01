package com.example.amit.android5778_8690_8052_01.model.entities;


import java.security.PrivateKey;
import java.util.Date;

public class Order {
    private String Customer_Number;
    private boolean Order_Status ; // 1 open 0 close
    private int Car_Number;  //is this the same as in car class?
    private Date Rental_Start;
    private Date Rental_End;
    private int Km_Beginning;
    private int Km_End;
    private boolean Fuel_Fill;
    private int Fuel_Liter;
    private int Payment;
    private int Order_Number;

    public String getCustomer_Number() {
        return Customer_Number;
    }

    public void setCustomer_Number(String customer_Number) {
        Customer_Number = customer_Number;
    }

    public boolean isOrder_Status() {
        return Order_Status;
    }

    public void setOrder_Status(boolean order_Status) {
        Order_Status = order_Status;
    }

    public int getCar_Number() {
        return Car_Number;
    }

    public void setCar_Number(int car_Number) {
        Car_Number = car_Number;
    }

    public Date getRental_Start() {
        return Rental_Start;
    }

    public void setRental_Start(Date rental_Start) {
        Rental_Start = rental_Start;
    }

    public Date getRental_End() {
        return Rental_End;
    }

    public void setRental_End(Date rental_End) {
        Rental_End = rental_End;
    }

    public int getKm_Beginning() {
        return Km_Beginning;
    }

    public void setKm_Beginning(int km_Beginning) {
        Km_Beginning = km_Beginning;
    }

    public int getKm_End() {
        return Km_End;
    }

    public void setKm_End(int km_End) {
        Km_End = km_End;
    }

    public boolean isFuel_Fill() {
        return Fuel_Fill;
    }

    public void setFuel_Fill(boolean fuel_Fill) {
        Fuel_Fill = fuel_Fill;
    }

    public int getFuel_Liter() {
        return Fuel_Liter;
    }

    public void setFuel_Liter(int fuel_Liter) {
        Fuel_Liter = fuel_Liter;
    }

    public int getPayment() {
        return Payment;
    }

    public void setPayment(int payment) {
        Payment = payment;
    }

    public int getOrder_Number() {
        return Order_Number;
    }

    public void setOrder_Number(int order_Number) {
        Order_Number = order_Number;
    }
}
