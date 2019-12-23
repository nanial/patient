package by.training.patient.filter;

public class Filter {

    private String numOfMedPolicy;
    private String diagnosis;
    private String doctor;
    private String numOfDepartment;

    public Filter() {
    }

    public Filter(String numOfMedPolicy, String diagnosis, String doctor, String numOfDepartment) {
        this.numOfMedPolicy = numOfMedPolicy;
        this.diagnosis = diagnosis;
        this.doctor = doctor;
        this.numOfDepartment = numOfDepartment;
    }

    public String getNumOfMedPolicy() {
        return numOfMedPolicy;
    }

    public void setNumOfMedPolicy(String numOfMedPolicy) {
        this.numOfMedPolicy = numOfMedPolicy;
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

    public String getNumOfDepartment() {
        return numOfDepartment;
    }

    public void setNumOfDepartment(String numOfDepartment) {
        this.numOfDepartment = numOfDepartment;
    }
}
