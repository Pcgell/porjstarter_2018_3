package edu.ujcv.progra1;

import edu.ujcv.progra1.Menu.IMenuItem;
import edu.ujcv.progra1.Menu.Menu;
import edu.ujcv.progra1.MisMenus.ExitItem;
import edu.ujcv.progra1.MisMenus.Test1;
import edu.ujcv.progra1.MisMenus.TestItem2;
import edu.ujcv.progra1.MisMenus.TestItem3;

import java.util.ArrayList;

public class Main {
    // no hacer esto ya que no es una variable privada y de paso es estatica!!!
    public static int valorSalida = 0;


    public static void main(String[] args) {
	// write your code here
        System.out.println("hola mundo!");


        ArrayList<IMenuItem> itemsMenuPrincipal = new ArrayList<>();

        itemsMenuPrincipal.add(new Test1());
        itemsMenuPrincipal.add(new TestItem2());
        itemsMenuPrincipal.add(new TestItem3());
        itemsMenuPrincipal.add(new ExitItem());


        Menu menuPrincipal = new Menu(itemsMenuPrincipal);

        while (valorSalida == 0) {
            menuPrincipal.mostrarMenu();
            menuPrincipal.leerOpcionLuegoProcessar();
        }
    }
}
