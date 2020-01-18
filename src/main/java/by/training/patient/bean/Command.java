package by.training.patient.bean;

import by.training.patient.apibusiness.CommandService;
import by.training.patient.apibusiness.PatientManager;
import by.training.patient.business.PatientManagerImpl;
import by.training.patient.dao.PatientDAOImpl;
import by.training.patient.filter.Filter;

import java.util.ArrayList;

public enum Command implements CommandService {

    DOCTOR {

        @Override
        public ArrayList<Patient> service(Filter filter) {
            return patientManager.patientCertainDoctor(filter);
        }
    },
    DIAGNOSIS {

        @Override
        public ArrayList<Patient> service(Filter filter) {
            return patientManager.patientCertainDiagnosis(filter);

        }
    },
    DEPARTMENT {

        @Override
        public ArrayList<Patient> service(Filter filter) {
            return patientManager.patientCertainDepartment(filter);
        }
    },
    POLICY {

        @Override
        public ArrayList<Patient> service(Filter filter) {
            return patientManager.patientCertainNumPolicy(filter);
        }
    };
    PatientManager patientManager = new PatientManagerImpl(new PatientDAOImpl());
}
