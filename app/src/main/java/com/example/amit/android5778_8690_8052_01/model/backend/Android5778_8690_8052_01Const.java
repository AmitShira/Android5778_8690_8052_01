package com.example.amit.android5778_8690_8052_01.model.backend;

import android.content.ContentValues;

import com.example.amit.android5778_8690_8052_01.model.entities.Address;
import com.example.amit.android5778_8690_8052_01.model.entities.Branch;
import com.example.amit.android5778_8690_8052_01.model.entities.Car;
import com.example.amit.android5778_8690_8052_01.model.entities.Car_Model;
import com.example.amit.android5778_8690_8052_01.model.entities.Customer;
//import created while converting class;



public class Android5778_8690_8052_01Const {


    public static class AddressConst {
        public static final String CITY = "city";
        public static final String STREET = "street";
        public static final String HOUSE_NUMBER = "house_number";

    }

    public static class BranchConst {
        //public static final Address BRANCH_ADDRESS = "branch address";
        public static final String NUMBER_OF_PARKING_LOTS = "number of parking lots";
        public static final String BRANCH_NUMBER = "branch number";
    }

    public static class CarConst {
        public static final String BRANCH_NUMBER = "branch_number";
        public static final String CODEMODEL = "codemodel";
        public static final String KILOMETERAGE = "kilometerage";
        public static final String CAR_NUMBER = "car_number";
    }

    public static class Car_ModelConst {
        public static final String MODEL_CODE = "model_code";
        public static final String COMPANY_NAME = "company_name";
        public static final String MODEL_NAME = "model_name";
        public static final String ENGINE_CAPACITY = "engine_capacity";
        public static final String GEARBOX = "gearbox";
        public static final String SEAT_NUMBER = "seat_number";
        public static final String CAR_CATEGORY = "car_category";
        public static final String MANUFACTURE_YEAR = "manufacture_year";
    }

    public static class CustomerConst {
        public static final String FAMILY_NAME = "family_name";
        public static final String FIRST_NAME = "first_name";
        public static final String ID = "_id";
        public static final String PHONE_NUMBER = "phone_number";
        public static final String EMAIL_ADDRESS = "email_address";
        public static final String CREDIT_CARD_NUMBER = "credit_card_number";
    }

    public class OrderConst {
        public static final String CUSTOMER_NUMBER = "customer_number";
        public static final String ORDER_STATUS = "order_status"; // 1 open 0 close
        public static final String CAR_NUMBER = "car_number";  //is this the same as in car class?
        public static final String RENTAL_START = "rental_start";
        public static final String RENTAL_END = "rental_end";
        public static final String KM_BEGINNING = "km_beginning";
        public static final String KM_END = "km_end";
        public static final String FUEL_FILL = "fuel_fill";
        public static final String FUEL_LITER = "fuel_liter";
        public static final String PAYMENT = "payment";
        public static final String ORDER_NUMBER = "order_number";
    }

    public static ContentValues AddressToContentValues(Address address) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Android5778_8690_8052_01Const.AddressConst.CITY, address.getCity());
        contentValues.put(Android5778_8690_8052_01Const.AddressConst.STREET, address.getStreet());
        contentValues.put(Android5778_8690_8052_01Const.AddressConst.HOUSE_NUMBER, address.getHouse_Number());
        return contentValues;
    }

    public static Address ContentValuesToAddress(ContentValues contentValues) {
        Address address = new Address();
        address.setCity(contentValues.getAsString(Android5778_8690_8052_01Const.AddressConst.CITY));
        address.setStreet(contentValues.getAsString(Android5778_8690_8052_01Const.AddressConst.STREET));
        address.setHouse_Number(contentValues.getAsInteger(Android5778_8690_8052_01Const.AddressConst.HOUSE_NUMBER));
        return address;
    }


    public static ContentValues BranchToContentValues(Branch branch) {
        ContentValues contentValues = new ContentValues();
        //  contentValues.put(Android5778_8690_8052_01Const.BranchConst.BRANCH_NUMBER, branch.getBranch_Address());//HOW TO DO THIS??
        contentValues.put(Android5778_8690_8052_01Const.BranchConst.NUMBER_OF_PARKING_LOTS, branch.getNumber_Of_Parking_Lots());
        contentValues.put(Android5778_8690_8052_01Const.BranchConst.BRANCH_NUMBER, branch.getBranch_Number());
        return contentValues;
    }

    public static Branch ContentValuesToBranch(ContentValues contentValues) {
        Branch branch = new Branch();
        branch.setBranch_Number(contentValues.getAsInteger(Android5778_8690_8052_01Const.BranchConst.BRANCH_NUMBER));
        branch.setNumber_Of_Parking_Lots(contentValues.getAsInteger(Android5778_8690_8052_01Const.BranchConst.NUMBER_OF_PARKING_LOTS));
        return branch;
    }

    public static ContentValues CarToContentValues(Car car) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CarConst.BRANCH_NUMBER, car.getBranch_Number());
        contentValues.put(CarConst.CAR_NUMBER, car.getCar_Number());
        contentValues.put(CarConst.CODEMODEL, car.getCodeModel());
        contentValues.put(CarConst.KILOMETERAGE, car.getKilometerage());
        return contentValues;
    }

    public static Car ContentValuesToCar(ContentValues contentValues) {
        Car car = new Car();
        car.setBranch_Number(contentValues.getAsInteger(CarConst.BRANCH_NUMBER));
        car.setCar_Number(contentValues.getAsInteger(CarConst.CAR_NUMBER));
        car.setCodeModel(contentValues.getAsInteger(CarConst.CODEMODEL));
        car.setKilometerage(contentValues.getAsInteger(CarConst.KILOMETERAGE));
        return car;
    }

    public static ContentValues Car_ModelToContentValues(Car_Model car_model) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Car_ModelConst.MODEL_CODE, car_model.getModel_Code());
        contentValues.put(Android5778_8690_8052_01Const.Car_ModelConst.COMPANY_NAME, car_model.getCompany_Name());
        contentValues.put(Android5778_8690_8052_01Const.Car_ModelConst.MODEL_NAME, car_model.getModel_Name());
        contentValues.put(Android5778_8690_8052_01Const.Car_ModelConst.ENGINE_CAPACITY, car_model.getEngine_Capacity());
        // contentValues.put(Android5778_8690_8052_01Const.Car_ModelConst.GEARBOX, car_model.getGearBox());             THIS ENUM, WHAT TO DO
        contentValues.put(Android5778_8690_8052_01Const.Car_ModelConst.SEAT_NUMBER, car_model.getSeat_Number());
        // contentValues.put(Android5778_8690_8052_01Const.Car_ModelConst. CAR_CATEGORY, car_model.getCar_category());  ENUM!!
        contentValues.put(Android5778_8690_8052_01Const.Car_ModelConst.MANUFACTURE_YEAR, car_model.getManufacture_Year());
        return contentValues;
    }

    public static Car_Model ContentValuesToCar_Model(ContentValues contentValues) {
        Car_Model car_model = new Car_Model();
        car_model.setModel_Code(contentValues.getAsInteger(Android5778_8690_8052_01Const.Car_ModelConst.MODEL_CODE));
        car_model.setCompany_Name(contentValues.getAsString(Android5778_8690_8052_01Const.Car_ModelConst.COMPANY_NAME));
        car_model.setModel_Name(contentValues.getAsString(Android5778_8690_8052_01Const.Car_ModelConst.MODEL_NAME));
        car_model.setEngine_Capacity(contentValues.getAsInteger(Android5778_8690_8052_01Const.Car_ModelConst.ENGINE_CAPACITY));
        car_model.setSeat_Number(contentValues.getAsInteger(Android5778_8690_8052_01Const.Car_ModelConst.SEAT_NUMBER));
        car_model.setManufacture_Year(contentValues.getAsInteger(Android5778_8690_8052_01Const.Car_ModelConst.MANUFACTURE_YEAR));
        //GEARBOX, CAR_CATEGORY ***** enums

        return car_model;
    }

    public static ContentValues CustomerToContentValues(Customer customer) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Android5778_8690_8052_01Const.CustomerConst.FAMILY_NAME, customer.getFamily_Name());
        contentValues.put(Android5778_8690_8052_01Const.CustomerConst.FIRST_NAME, customer.getFirst_Name());
        contentValues.put(Android5778_8690_8052_01Const.CustomerConst.ID, customer.getId());
        contentValues.put(Android5778_8690_8052_01Const.CustomerConst.PHONE_NUMBER, customer.getPhone_Number());
        contentValues.put(Android5778_8690_8052_01Const.CustomerConst.EMAIL_ADDRESS, customer.getEmail_Address());
        contentValues.put(Android5778_8690_8052_01Const.CustomerConst.CREDIT_CARD_NUMBER, customer.getCredit_Card_Number());
        return contentValues;
    }

    public static Customer ContentValuesToCustomer(ContentValues contentValues) {
        Customer customer = new Customer();
        customer.setFamily_Name(contentValues.getAsString(Android5778_8690_8052_01Const.CustomerConst.FAMILY_NAME));
        customer.setFirst_Name(contentValues.getAsString(Android5778_8690_8052_01Const.CustomerConst.FIRST_NAME));
        customer.setId(contentValues.getAsString(Android5778_8690_8052_01Const.CustomerConst.ID));
        customer.setPhone_Number(contentValues.getAsString(Android5778_8690_8052_01Const.CustomerConst.PHONE_NUMBER));
        customer.setEmail_Address(contentValues.getAsString(Android5778_8690_8052_01Const.CustomerConst.EMAIL_ADDRESS));
        customer.setCredit_Card_Number(contentValues.getAsString(Android5778_8690_8052_01Const.CustomerConst.CREDIT_CARD_NUMBER));
        return customer;
    }


}

