package by.training.patient.bussiness;

import by.training.patient.apibussiness.PatientManager;
import by.training.patient.apidao.PatientDAO;
import by.training.patient.bean.Patient;
import by.training.patient.filter.Filter;

import java.util.ArrayList;

public class PatientManagerImpl implements PatientManager {

    private PatientDAO dao;

    public PatientManagerImpl() {
    }

    public PatientManagerImpl(PatientDAO dao) {
        this.dao = dao;
    }

    @Override
    public ArrayList<Patient> getPatientList(Filter filter) {
        return dao.getPatientList(filter);
    }

    @Override
    public ArrayList<Patient> getPatientOfCertainDoctor(Filter filter) {
        return dao.getPatientOfCertainDoctor(filter);
    }

    @Override
    public void writePatientInFile(ArrayList<Patient> patients) {
        dao.writePatientInFile(patients);
    }
}
