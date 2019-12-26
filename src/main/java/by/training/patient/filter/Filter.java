package by.training.patient.filter;

import by.training.patient.bean.Department;

public class Filter {

    private int numOfMedPolicyLow;
    private int getNumOfMedPolicyHigh;
    private String diagnosis;
    private String doctor;
    private Department department;

    public Filter() {
    }

    public Filter(String doctor) {
        this.doctor = doctor;
    }

    public Filter(String diagnosis, String department) {
        this.diagnosis = diagnosis;
        this.department = Department.valueOf(department);
    }

    public Filter(int numOfMedPolicyLow, int getNumOfMedPolicyHigh) {
        this.numOfMedPolicyLow = numOfMedPolicyLow;
        this.getNumOfMedPolicyHigh = getNumOfMedPolicyHigh;
    }

    public int getNumOfMedPolicyLow() {
        return numOfMedPolicyLow;
    }

    public void setNumOfMedPolicyLow(int numOfMedPolicyLow) {
        this.numOfMedPolicyLow = numOfMedPolicyLow;
    }

    public int getGetNumOfMedPolicyHigh() {
        return getNumOfMedPolicyHigh;
    }

    public void setGetNumOfMedPolicyHigh(int getNumOfMedPolicyHigh) {
        this.getNumOfMedPolicyHigh = getNumOfMedPolicyHigh;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
