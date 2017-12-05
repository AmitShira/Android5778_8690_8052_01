package com.example.amit.android5778_8690_8052_01.model.backend;


import android.content.ContentValues;

import com.example.amit.android5778_8690_8052_01.model.entities.Branch;
import com.example.amit.android5778_8690_8052_01.model.entities.Car;
import com.example.amit.android5778_8690_8052_01.model.entities.Car_Model;
import com.example.amit.android5778_8690_8052_01.model.entities.Customer;

import java.util.List;

public interface DB_manager {// check the type of the functions

    void addCustomer(ContentValues Customer);
    void addModel(ContentValues Car_Model);
    void addCar(ContentValues Car);
    List<Branch> getBranchList();
    List<Customer> getCustomerList();
    List<Car_Model> getCarModelList();
    List<Car> getCarList();
    boolean CustomerExist(ContentValues Customer);// if to is correct


}
