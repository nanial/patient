package by.training.patient.bean;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    List<Patient> patientList = new ArrayList<>();

    public ArrayList<Patient> fillList() {

        patientList.add(new Patient("Anenkov", "Illia",
                "Tolstogo, 18, 25","+375172791285",
                236159423,"diabetes",
                "I.I.Vozenkov", Department.THERAPY));

        return (ArrayList<Patient>) patientList;
    }

}
