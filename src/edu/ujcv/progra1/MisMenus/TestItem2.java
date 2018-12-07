package edu.ujcv.progra1.MisMenus;

import edu.ujcv.progra1.Menu.IMenuItem;
import edu.ujcv.progra1.Menu.Menu;

import java.util.ArrayList;

public class TestItem2 implements IMenuItem {


    @Override
    public String getLabel() {
        return "prueba sub menu";
    }

    @Override
    public void runAction() {


        ArrayList<IMenuItem> itemsSubMenu = new ArrayList<>();

        itemsSubMenu.add(new ExitItem());
        itemsSubMenu.add(new TestItem3());
        itemsSubMenu.add(new Test1());

        Menu subMenu = new Menu(itemsSubMenu);

        subMenu.mostrarMenu();
        subMenu.leerOpcionLuegoProcessar();

    }
}
