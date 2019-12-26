package by.training.patient.bussiness;

import by.training.patient.apibussiness.DispatcherBuilder;
import by.training.patient.controller.Dispatcher;

public class DispatcherBuilderImpl implements DispatcherBuilder {

    private Dispatcher dispatcher;
    private static DispatcherBuilderImpl instance;

    private DispatcherBuilderImpl() {
        this.dispatcher = new Dispatcher();
    }

    synchronized public static DispatcherBuilderImpl getInstance(){

        if(instance == null){
            instance = new DispatcherBuilderImpl();
        }
        return instance;
    }

    @Override
    public Dispatcher getDispatcher() {
        return dispatcher;
    }
}
