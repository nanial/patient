package by.training.patient.bussiness;

import by.training.patient.apibussiness.DispatcherBuilder;

public class DispatcherFactory {

    public static DispatcherBuilder getDispatcherBuilder(){

        return DispatcherBuilderImpl.getInstance();
    }
}
