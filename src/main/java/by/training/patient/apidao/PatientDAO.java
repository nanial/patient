package by.training.patient.apidao;

import by.training.patient.bean.Patient;
import by.training.patient.filter.Filter;

import java.util.ArrayList;

public interface PatientDAO {

    ArrayList<Patient> patientList();
    //ArrayList<Patient> getPatientOfCertainDoctor(Filter filter);
    void writePatientInFile(ArrayList<Patient> patients);
}
