package com.example.amit.android5778_8690_8052_01.model.datasource;
import android.content.ContentValues;
import com.example.amit.android5778_8690_8052_01.model.backend.DB_manager;
import com.example.amit.android5778_8690_8052_01.model.entities.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.amit.android5778_8690_8052_01.model.backend.ModelConst.*;


public class List_DB_Manager implements DB_manager {
   static List<Customer> Customers;
   static List<Branch> Branches;
   static List<Car_Model> Car_Models;
   static List<Order> Orders;// mybe not
   static List<Car> Cars;

    static{
        Customers=new ArrayList<>();
        Branches=new ArrayList<>();
        Car_Models=new ArrayList<>();
        Orders=new ArrayList<>();
        Cars=new ArrayList<>();

    }
    @Override
   public boolean CustomerExist(String _id){
        for (Customer item: Customers) {
            if (item.getId()== _id)
                return true;
        }
        return false;
    }

    @Override
    public String addCustomer(ContentValues Customer) throws Exception {
        Customer customer = ContentValuesToCustomer(Customer);
        boolean existing = CustomerExist (customer.getId()); // Checking if the customer exists already
        if (existing==true)
             throw new Exception("Customer already exist!");
        Customers.add(customer);
        return customer.getId();
    }

    @Override
    public int addModel(ContentValues Car_Model) {
        Car_Model carmodel = ContentValuesToCar_Model(Car_Model);
        Car_Models.add(carmodel);
        return carmodel.getModel_Code();
    }

    @Override
    public int addCar(ContentValues Car) {
        Car car = ContentValuesToCar(Car);
        Cars.add(car);
        return car.getCar_Number();
    }

    @Override
    public int addBranch(ContentValues Branch) {
        Branch branch = ContentValuesToBranch(Branch);
        Branches.add(branch);
        return branch.getBranch_Number();
    }

    @Override
    public List<Branch> getBranchList() {
        return Branches;
    }

    @Override
    public List<Customer> getCustomerList() {
        return Customers;
    }

    @Override
    public List<Car_Model> getCarModelList() {
        return Car_Models;
    }

    @Override
    public List<Car> getCarList() {
        return Cars;
    }
}
