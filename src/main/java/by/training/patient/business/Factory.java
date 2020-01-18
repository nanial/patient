package by.training.patient.business;

import by.training.patient.apibusiness.DispatcherBuilder;
import by.training.patient.apibusiness.HospitalBuilder;
import by.training.patient.apibusiness.MenuBuilder;

public class Factory {

    public static DispatcherBuilder getDispatcherBuilder(){

        return DispatcherBuilderImpl.getInstance();
    }
    public static MenuBuilder getMenuBuilder(){

        return MenuBuilderImpl.getInstance();
    }
    public static HospitalBuilder getHospitalBuilder(){

        return HospitalBuilderImpl.getInstance();
    }
}
