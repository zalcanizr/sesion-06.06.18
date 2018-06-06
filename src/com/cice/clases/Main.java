package com.cice.clases;

import com.cice.clases.coches.Coche;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //creamos un objeto de la clase Coche

        Coche coche=new Coche();
        coche.setPotencia(40);
        coche.arrancar();
        coche.acelerar();
        coche.frenar();
        coche.parar();


        Coche coche2=new Coche();
        coche2.setPotencia(50);
        Coche coche3=new Coche();
        coche3.setPotencia(90);

        //hsta aqui los objetos coche, coche2, coche3 contienen el puntero de memoria.

    }
}
