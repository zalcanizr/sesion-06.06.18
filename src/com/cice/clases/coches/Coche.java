package com.cice.clases.coches;

public class Coche {

    //generamos los atributos de la clase
    //normalmente privados

    private String color;
    private int potencia;
    private String modelo;
    private String bastidor;
    private String marca;


    public void arrancar(){
        System.out.println("Estoy arrancando...");
        System.out.println("Motor arrancado...");
    }

    public void acelerar(){
        System.out.println("Acelerandoooooooo");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }

    public void parar(){
        System.out.println("Apagando motor...");
        System.out.println("Motor apagado...");
    }



    //set potencia
    public void setPotencia(int potenciaDada){
        //this.potencia=potenciaDada;
        // si quiero que la  pontencia sea >0 le añado un bucle
        if(potencia>0){
            potencia=potenciaDada;
        }
    }
}
