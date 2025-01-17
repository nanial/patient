package by.training.patient.controller;

import by.training.patient.apibusiness.PatientManager;
import by.training.patient.bean.Hospital;
import by.training.patient.bean.Patient;
import by.training.patient.business.Factory;
import by.training.patient.business.PatientManagerImpl;
import by.training.patient.dao.PatientDAOImpl;
import by.training.patient.exception.MenuException;
import by.training.patient.filter.Filter;
import by.training.patient.view.View;

import java.util.ArrayList;


public class Dispatcher {

    Hospital hospital = new Factory().getHospitalBuilder().getHospital();//create hospital
    PatientManager patientManager = new PatientManagerImpl(new PatientDAOImpl());


    public void execute() {

        View view = new Factory().getMenuBuilder().getMenu();

        patientManager.writePatientInFile(hospital.fillList());//init base
       // View view = new AlternativeMenu();
        try {
            view.userService();
        }
        catch (MenuException me){
            System.out.println(me.getMessage());
        }

    }
    public ArrayList<Patient> execCertainDoctor(Filter filter) {

        return patientManager.patientCertainDoctor(filter);
    }
    public ArrayList<Patient> execCertainDiagnosis(Filter filter) {

        return patientManager.patientCertainDiagnosis(filter);
    }
    public ArrayList<Patient> execCertainDepartment(Filter filter) {

        return patientManager.patientCertainDepartment(filter);
    }
    public ArrayList<Patient> execCertainNumPolicy(Filter filter) {

        return patientManager.patientCertainNumPolicy(filter);
    }
}
