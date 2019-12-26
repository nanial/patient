package by.training.patient.controller;

import by.training.patient.apibussiness.PatientManager;
import by.training.patient.bean.Hospital;
import by.training.patient.bean.Patient;
import by.training.patient.bussiness.DispatcherFactory;
import by.training.patient.bussiness.HospitalFactory;
import by.training.patient.bussiness.MenuFactory;
import by.training.patient.bussiness.PatientManagerImpl;
import by.training.patient.dao.PatientDAOImpl;
import by.training.patient.filter.Filter;
import by.training.patient.view.Menu;
import by.training.patient.view.View;

import java.util.ArrayList;


public class Dispatcher {

    Hospital hospital = new HospitalFactory().getHospitalBuilder().getHospital();//create hospital
    PatientManager patientManager = new PatientManagerImpl(new PatientDAOImpl());


    public void execute() {

        patientManager.writePatientInFile(hospital.fillList());//init base
        View view = new MenuFactory().getMenuBuilder().getMenu();
        view.userService();

    }
    public ArrayList<Patient> execCertainDoctor(Filter filter) {

        return patientManager.patientCertainDoctor(patientManager.patientList(), filter);
    }
    public ArrayList<Patient> execCertainDiagnosis(Filter filter) {

        return patientManager.patientCertainDiagnosis(patientManager.patientList(), filter);
    }
    public ArrayList<Patient> execCertainDepartment(Filter filter) {

        return patientManager.patientCertainDepartment(patientManager.patientList(), filter);
    }
    public ArrayList<Patient> execCertainNumPolicy(Filter filter) {

        return patientManager.patientCertainNumPolicy(patientManager.patientList(), filter);
    }
}
