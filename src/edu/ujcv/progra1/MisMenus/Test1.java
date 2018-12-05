package edu.ujcv.progra1.MisMenus;

import edu.ujcv.progra1.Menu.IMenuItem;

public class Test1 implements IMenuItem {
    @Override
    public String getLabel() {
        return "test 1";
    }

    @Override
    public void runAction() {
        System.out.println("ejecutando menu test1!!");
    }
}
