package by.training.patient.bean;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Patient implements Serializable {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int patientId;
    private String surname;
    private String name;
    private String address;
    private String phone;
    private int numOfMedPolicy;
    private String diagnosis;
    private String doctor;
    private Department department;

    public Patient() {
    }

    public Patient(String surname, String name, String address,
                   String phone, int numOfMedPolicy, String diagnosis,
                   String doctor, Department department) {

        this.patientId = count.incrementAndGet();
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.numOfMedPolicy = numOfMedPolicy;
        this.diagnosis = diagnosis;
        this.doctor = doctor;
        this.department = department;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumOfMedPolicy() {
        return numOfMedPolicy;
    }

    public void setNumOfMedPolicy(int numOfMedPolicy) {
        this.numOfMedPolicy = numOfMedPolicy;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;

        Patient patient = (Patient) o;

        if (getPatientId() != patient.getPatientId()) return false;
        if (getNumOfMedPolicy() != patient.getNumOfMedPolicy()) return false;
        if (getSurname() != null ? !getSurname().equals(patient.getSurname()) : patient.getSurname() != null)
            return false;
        if (getName() != null ? !getName().equals(patient.getName()) : patient.getName() != null) return false;
        if (getAddress() != null ? !getAddress().equals(patient.getAddress()) : patient.getAddress() != null)
            return false;
        if (getPhone() != null ? !getPhone().equals(patient.getPhone()) : patient.getPhone() != null) return false;
        if (getDiagnosis() != null ? !getDiagnosis().equals(patient.getDiagnosis()) : patient.getDiagnosis() != null)
            return false;
        if (getDoctor() != null ? !getDoctor().equals(patient.getDoctor()) : patient.getDoctor() != null) return false;
        return department == patient.department;
    }

    @Override
    public int hashCode() {
        int result = getPatientId();
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + getNumOfMedPolicy();
        result = 31 * result + (getDiagnosis() != null ? getDiagnosis().hashCode() : 0);
        result = 31 * result + (getDoctor() != null ? getDoctor().hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", numOfMedPolicy=" + numOfMedPolicy +
                ", diagnosis='" + diagnosis + '\'' +
                ", doctor='" + doctor + '\'' +
                ", department=" + department +
                '}';
    }
}
