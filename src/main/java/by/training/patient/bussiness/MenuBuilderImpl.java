package by.training.patient.bussiness;

import by.training.patient.apibussiness.MenuBuilder;
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
