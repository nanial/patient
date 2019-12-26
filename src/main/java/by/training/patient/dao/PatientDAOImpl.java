package by.training.patient.dao;

import by.training.patient.apidao.PatientDAO;
import by.training.patient.bean.Patient;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class PatientDAOImpl implements PatientDAO {
    @Override
    public ArrayList<Patient> patientList() {

        ArrayList<Patient> patients = new ArrayList<>();

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream
                    ("D:\\study\\java\\patient\\patients.xml")));

            patients = (ArrayList<Patient>) decoder.readObject();


        } catch (FileNotFoundException io) {
            io.getMessage();
        }
        return patients;
    }

   /* @Override
    public ArrayList<Patient> getPatientOfCertainDoctor(Filter filter) {
        return null;
    }
*/
    @Override
    public void writePatientInFile(ArrayList<Patient> patients) {

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream
                    ("D:\\study\\java\\patient\\patients.xml")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        encoder.writeObject(patients);
        encoder.close();
    }
}
