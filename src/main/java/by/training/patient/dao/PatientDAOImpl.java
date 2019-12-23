package by.training.patient.dao;

import by.training.patient.apidao.PatientDAO;
import by.training.patient.bean.Patient;
import by.training.patient.filter.Filter;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class PatientDAOImpl implements PatientDAO {
    @Override
    public ArrayList<Patient> getPatientList(Filter filter) {
        return null;
    }

    @Override
    public ArrayList<Patient> getPatientOfCertainDoctor(Filter filter) {
        return null;
    }

    @Override
    public void writePatientInFile(ArrayList<Patient> patients) {

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream
                    ("D:\\study\\java\\patient\\patients.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        encoder.writeObject(patients);
        encoder.close();
    }
}
