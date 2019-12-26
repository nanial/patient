package by.training.patient.apibussiness;

import by.training.patient.bean.Patient;
import by.training.patient.filter.Filter;

import java.util.ArrayList;

public interface PatientManager {

    ArrayList<Patient> patientList();//receive from dao
    ArrayList<Patient> patientCertainDoctor(ArrayList<Patient> patientList, Filter filter);// native method
    ArrayList<Patient> patientCertainDiagnosis(ArrayList<Patient> patientList, Filter filter);// native method
    ArrayList<Patient> patientCertainNumPolicy(ArrayList<Patient> patientList, Filter filter);// native method
    ArrayList<Patient> patientCertainDepartment(ArrayList<Patient> patientList, Filter filter);// native method

    ArrayList<Patient> writePatientInFile(ArrayList<Patient> patients);// from dao
}
