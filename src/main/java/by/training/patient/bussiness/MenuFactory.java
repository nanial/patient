package by.training.patient.bussiness;

import by.training.patient.apibussiness.MenuBuilder;

public class MenuFactory {

    public static MenuBuilder getMenuBuilder(){

        return MenuBuilderImpl.getInstance();
    }
}
