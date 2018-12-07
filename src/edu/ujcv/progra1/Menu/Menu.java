package edu.ujcv.progra1.Menu;

import edu.ujcv.progra1.util.LectorTeclado;

import java.util.ArrayList;

public class Menu {
    private ArrayList<IMenuItem> items;


    public Menu(ArrayList<IMenuItem> items) {
        this.items = items;
    }


    public void mostrarMenu(){

        int opcion = 1;
        for (IMenuItem menuItem: items) {
            System.out.println(""+ opcion++ + ". "+menuItem.getLabel());
        }
    }


    public void leerOpcionLuegoProcessar(){
        LectorTeclado lt = new LectorTeclado();
        int opcion =0;
        while(opcion<=0 || opcion > items.size())
        opcion = lt.leerEntero("ingrese una opcion valida","vuelva intentar");

        items.get(opcion-1).runAction();

    }
 }
