package com.example.amit.android5778_8690_8052_01.model.backend;

import android.content.ContentValues;

import com.example.amit.android5778_8690_8052_01.model.entities.Address;
import com.example.amit.android5778_8690_8052_01.model.entities.Branch;
import com.example.amit.android5778_8690_8052_01.model.entities.Car;
import com.example.amit.android5778_8690_8052_01.model.entities.Car_Model;
import com.example.amit.android5778_8690_8052_01.model.entities.Customer;
import com.example.amit.android5778_8690_8052_01.model.entities.Order;
//import created while converting class;



public class ModelConst {


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
        contentValues.put(ModelConst.AddressConst.CITY, address.getCity());
        contentValues.put(ModelConst.AddressConst.STREET, address.getStreet());
        contentValues.put(ModelConst.AddressConst.HOUSE_NUMBER, address.getHouse_Number());
        return contentValues;
    }

    public static Address ContentValuesToAddress(ContentValues contentValues) {
        Address address = new Address();
        address.setCity(contentValues.getAsString(ModelConst.AddressConst.CITY));
        address.setStreet(contentValues.getAsString(ModelConst.AddressConst.STREET));
        address.setHouse_Number(contentValues.getAsInteger(ModelConst.AddressConst.HOUSE_NUMBER));
        return address;
    }


    public static ContentValues BranchToContentValues(Branch branch) {
        ContentValues contentValues = new ContentValues();
         contentValues.put(ModelConst.BranchConst.BRANCH_NUMBER, branch.getBranch_Address().toString());
        contentValues.put(ModelConst.BranchConst.NUMBER_OF_PARKING_LOTS, branch.getNumber_Of_Parking_Lots());
        contentValues.put(ModelConst.BranchConst.BRANCH_NUMBER, branch.getBranch_Number());
        return contentValues;
    }

    public static Branch ContentValuesToBranch(ContentValues contentValues) {
        Branch branch = new Branch();
        branch.setBranch_Number(contentValues.getAsInteger(ModelConst.BranchConst.BRANCH_NUMBER));
        branch.setNumber_Of_Parking_Lots(contentValues.getAsInteger(ModelConst.BranchConst.NUMBER_OF_PARKING_LOTS));
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
        contentValues.put(ModelConst.Car_ModelConst.COMPANY_NAME, car_model.getCompany_Name());
        contentValues.put(ModelConst.Car_ModelConst.MODEL_NAME, car_model.getModel_Name());
        contentValues.put(ModelConst.Car_ModelConst.ENGINE_CAPACITY, car_model.getEngine_Capacity());
        contentValues.put(ModelConst.Car_ModelConst.GEARBOX, String.valueOf(car_model.getGearBox()));
        contentValues.put(ModelConst.Car_ModelConst.SEAT_NUMBER, car_model.getSeat_Number());
        contentValues.put(ModelConst.Car_ModelConst. CAR_CATEGORY,String.valueOf( car_model.getCar_category()));
        contentValues.put(ModelConst.Car_ModelConst.MANUFACTURE_YEAR, car_model.getManufacture_Year());
        return contentValues;
    }

    public static Car_Model ContentValuesToCar_Model(ContentValues contentValues) {
        Car_Model car_model = new Car_Model();
        car_model.setModel_Code(contentValues.getAsInteger(ModelConst.Car_ModelConst.MODEL_CODE));
        car_model.setCompany_Name(contentValues.getAsString(ModelConst.Car_ModelConst.COMPANY_NAME));
        car_model.setModel_Name(contentValues.getAsString(ModelConst.Car_ModelConst.MODEL_NAME));
        car_model.setEngine_Capacity(contentValues.getAsInteger(ModelConst.Car_ModelConst.ENGINE_CAPACITY));
        car_model.setSeat_Number(contentValues.getAsInteger(ModelConst.Car_ModelConst.SEAT_NUMBER));
        car_model.setManufacture_Year(contentValues.getAsInteger(ModelConst.Car_ModelConst.MANUFACTURE_YEAR));
        //GEARBOX, CAR_CATEGORY ***** enums

        return car_model;
    }

    public static ContentValues CustomerToContentValues(Customer customer) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ModelConst.CustomerConst.FAMILY_NAME, customer.getFamily_Name());
        contentValues.put(ModelConst.CustomerConst.FIRST_NAME, customer.getFirst_Name());
        contentValues.put(ModelConst.CustomerConst.ID, customer.getId());
        contentValues.put(ModelConst.CustomerConst.PHONE_NUMBER, customer.getPhone_Number());
        contentValues.put(ModelConst.CustomerConst.EMAIL_ADDRESS, customer.getEmail_Address());
        contentValues.put(ModelConst.CustomerConst.CREDIT_CARD_NUMBER, customer.getCredit_Card_Number());
        return contentValues;
    }

    public static Customer ContentValuesToCustomer(ContentValues contentValues) {
        Customer customer = new Customer();
        customer.setFamily_Name(contentValues.getAsString(ModelConst.CustomerConst.FAMILY_NAME));
        customer.setFirst_Name(contentValues.getAsString(ModelConst.CustomerConst.FIRST_NAME));
        customer.setId(contentValues.getAsString(ModelConst.CustomerConst.ID));
        customer.setPhone_Number(contentValues.getAsString(ModelConst.CustomerConst.PHONE_NUMBER));
        customer.setEmail_Address(contentValues.getAsString(ModelConst.CustomerConst.EMAIL_ADDRESS));
        customer.setCredit_Card_Number(contentValues.getAsString(ModelConst.CustomerConst.CREDIT_CARD_NUMBER));
        return customer;
    }

    public static ContentValues OrderToContentValues(Order order) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ModelConst.OrderConst.CUSTOMER_NUMBER, order.getCustomer_Number());
        contentValues.put(ModelConst.OrderConst.ORDER_STATUS, String.valueOf(order));
        contentValues.put(ModelConst.OrderConst.CAR_NUMBER, order.getCar_Number());
        contentValues.put(ModelConst.OrderConst.RENTAL_START , String.valueOf(order.getRental_Start()));
        contentValues.put(ModelConst.OrderConst.RENTAL_END, String.valueOf(order.getRental_End()));
        contentValues.put(ModelConst.OrderConst.KM_BEGINNING, order.getKm_Beginning());
        contentValues.put(ModelConst.OrderConst.KM_END, order.getKm_End());
        contentValues.put(ModelConst.OrderConst.FUEL_FILL, String.valueOf(order));
        contentValues.put(ModelConst.OrderConst.FUEL_LITER, order.getFuel_Liter());
        contentValues.put(ModelConst.OrderConst.PAYMENT, order.getPayment());
        contentValues.put(ModelConst.OrderConst.ORDER_NUMBER, order.getOrder_Number());
        return contentValues;
    }

    public static Order ContentValuesToOrder(ContentValues contentValues) {
        Order order = new Order();
        order.setCustomer_Number(contentValues.getAsString(OrderConst.CUSTOMER_NUMBER));
        order.setOrder_Status(contentValues.getAsBoolean(OrderConst.ORDER_STATUS));//CHANGED FROM BOOL TO STRING
        order.setCar_Number(contentValues.getAsInteger(OrderConst.CAR_NUMBER));
    //    order.setRental_Start(contentValues.(OrderConst.RENTAL_START));
      //  order.setRental_End(contentValues.(OrderConst.RENTAL_END));
        order.setKm_Beginning(contentValues.getAsInteger(OrderConst.KM_BEGINNING));
        order.setKm_End(contentValues.getAsInteger(OrderConst.KM_END));
        order.setFuel_Fill(contentValues.getAsBoolean(OrderConst.FUEL_FILL));
        order.setFuel_Liter(contentValues.getAsInteger(OrderConst.FUEL_LITER));
        order.setPayment(contentValues.getAsInteger(OrderConst.PAYMENT));
        order.setOrder_Number(contentValues.getAsInteger(OrderConst.ORDER_NUMBER));
        return order;
    }




}

