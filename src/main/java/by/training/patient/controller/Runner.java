package by.training.patient.controller;

//Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
//карты, Диагноз.Создать массив объектов. Вывести:a) список пациентов,
// имеющих данный диагноз;b) список пациентов, номер медицинской карты
// которых находится в заданном интервале.

import by.training.patient.bussiness.DispatcherFactory;


public class Runner {

    public static void main(String[] args) {

        Dispatcher dispatcher = new DispatcherFactory().getDispatcherBuilder().getDispatcher();
        dispatcher.execute();
    }
}
