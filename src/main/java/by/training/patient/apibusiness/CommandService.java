package by.training.patient.apibusiness;

import by.training.patient.bean.Patient;
import by.training.patient.filter.Filter;

import java.util.ArrayList;

public interface CommandService {
    ArrayList<Patient> service(Filter filter);
}
