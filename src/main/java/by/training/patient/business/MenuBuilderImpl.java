package by.training.patient.business;

import by.training.patient.apibusiness.MenuBuilder;
import by.training.patient.view.Menu;

public class MenuBuilderImpl implements MenuBuilder {

    private Menu menu;
    private static MenuBuilderImpl instance;

    private MenuBuilderImpl() {
        this.menu = new Menu();
    }

    synchronized public static MenuBuilderImpl getInstance(){

        if(instance == null){
            instance = new MenuBuilderImpl();
        }
        return instance;
    }

    @Override
    public Menu getMenu() {
        return menu;
    }
}
