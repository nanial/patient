package by.training.patient.bussiness;

import by.training.patient.apibussiness.HospitalBuilder;

public class HospitalFactory {

    public static HospitalBuilder getHospitalBuilder(){

        return HospitalBuilderImpl.getInstance();
    }
}
