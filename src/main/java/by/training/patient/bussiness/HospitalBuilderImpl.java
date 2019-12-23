package by.training.patient.bussiness;

import by.training.patient.apibussiness.HospitalBuilder;
import by.training.patient.bean.Hospital;


public class HospitalBuilderImpl implements HospitalBuilder {

    private Hospital hospital;
    private static HospitalBuilderImpl instance;

    private HospitalBuilderImpl() {
        this.hospital = new Hospital();
    }

    synchronized public static HospitalBuilderImpl getInstance(){

        if(instance == null){
            instance = new HospitalBuilderImpl();
        }
        return instance;
    }

    @Override
    public Hospital getHospital() {
        return hospital;
    }
}
