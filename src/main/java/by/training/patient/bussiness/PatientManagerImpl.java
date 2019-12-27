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
    public ArrayList<Patient> patientList() {
        return dao.patientList();
    }

    @Override
    public ArrayList<Patient> patientCertainDoctor(Filter filter) {

        ArrayList<Patient> patients = new ArrayList<>();

        if(filter != null){

            if (filter.getDoctor() != null){

                for (Patient p : this.patientList()){

                    if (p.getDoctor().equals(filter.getDoctor())){

                        patients.add(p);
                    }
                }
            }
        }
        return patients;
    }

    @Override
    public ArrayList<Patient> patientCertainDiagnosis(Filter filter) {

        ArrayList<Patient> patients = new ArrayList<>();

        if(filter != null){

            if (filter.getDiagnosis() != null){

                for (Patient p : this.patientList()){

                    if (p.getDiagnosis().equals(filter.getDiagnosis())){

                        patients.add(p);
                    }
                }
            }
        }
        return patients;
    }

    @Override
    public ArrayList<Patient> patientCertainNumPolicy(Filter filter) {

        ArrayList<Patient> patients = new ArrayList<>();

        if(filter != null){

            if (filter.getNumOfMedPolicyLow() != 0 &&
                    filter.getGetNumOfMedPolicyHigh() != 0){

                for (Patient p : this.patientList()){

                    if (p.getNumOfMedPolicy() <= filter.getGetNumOfMedPolicyHigh()
                            && p.getNumOfMedPolicy() >= filter.getNumOfMedPolicyLow()){

                        patients.add(p);
                    }
                }
            }
        }
        return patients;
    }

    @Override
    public ArrayList<Patient> patientCertainDepartment(Filter filter) {

        ArrayList<Patient> patients = new ArrayList<>();

        if(filter != null){

            if (filter.getDepartment() != null){

                for (Patient p : this.patientList()){

                    if (p.getDepartment().equals(filter.getDepartment())){

                        patients.add(p);
                    }
                }
            }
        }
        return patients;
    }

    @Override
    public ArrayList<Patient> writePatientInFile(ArrayList<Patient> patients) {
        dao.writePatientInFile(patients);
        return patients;
    }
}
