package by.training.patient.controller;

//Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
//карты, Диагноз.Создать массив объектов. Вывести:a) список пациентов,
// имеющих данный диагноз;b) список пациентов, номер медицинской карты
// которых находится в заданном интервале.

import by.training.patient.apibussiness.PatientManager;
import by.training.patient.bean.Hospital;
import by.training.patient.bussiness.HospitalFactory;
import by.training.patient.bussiness.PatientManagerImpl;
import by.training.patient.dao.PatientDAOImpl;


public class Runner {
    public static void main(String[] args) {

        Hospital hospital = new HospitalFactory().getHospitalBuilder().getHospital();//create hospital
        PatientManager patientManager = new PatientManagerImpl(new PatientDAOImpl());
        patientManager.writePatientInFile(hospital.fillList(null));
        new Menu().userService();
    }
}
