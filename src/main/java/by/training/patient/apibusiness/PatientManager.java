package by.training.patient.apibusiness;

import by.training.patient.bean.Patient;
import by.training.patient.filter.Filter;

import java.util.ArrayList;

public interface PatientManager {

    ArrayList<Patient> patientList();//receive from dao
    ArrayList<Patient> patientCertainDoctor(Filter filter);// native method
    ArrayList<Patient> patientCertainDiagnosis(Filter filter);// native method
    ArrayList<Patient> patientCertainNumPolicy(Filter filter);// native method
    ArrayList<Patient> patientCertainDepartment(Filter filter);// native method

    ArrayList<Patient> writePatientInFile(ArrayList<Patient> patients);// from dao
}
