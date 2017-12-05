package com.example.amit.android5778_8690_8052_01.model.entities;

enum GearBox {AUTOMATIC, MANUAL};
enum Car_Category {MINI,REGULAR,STATION,JEEP_4X4,MINI_VAN,VAN,LUXURY};

public class Car_Model {
    private int Model_Code;
    private String Company_Name;
    private String Model_Name;
    private int Engine_Capacity;
    private GearBox gearBox;
    private int Seat_Number;
    private Car_Category car_category;
    private int Manufacture_Year;


    public int getModel_Code() {
        return Model_Code;
    }

    public void setModel_Code(int model_Code) {
        Model_Code = model_Code;
    }

    public String getCompany_Name() {
        return Company_Name;
    }

    public void setCompany_Name(String company_Name) {
        Company_Name = company_Name;
    }

    public String getModel_Name() {
        return Model_Name;
    }

    public void setModel_Name(String model_Name) {
        Model_Name = model_Name;
    }

    public int getEngine_Capacity() {
        return Engine_Capacity;
    }

    public void setEngine_Capacity(int engine_Capacity) {
        Engine_Capacity = engine_Capacity;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public int getSeat_Number() {
        return Seat_Number;
    }

    public void setSeat_Number(int seat_Number) {
        Seat_Number = seat_Number;
    }

    public Car_Category getCar_category() {
        return car_category;
    }

    public void setCar_category(Car_Category car_category) {
        this.car_category = car_category;
    }

    public int getManufacture_Year() {
        return Manufacture_Year;
    }

    public void setManufacture_Year(int manufacture_Year) {
        Manufacture_Year = manufacture_Year;
    }


}
