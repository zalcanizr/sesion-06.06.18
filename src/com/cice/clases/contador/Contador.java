package com.cice.clases.contador;

public class Contador {

    //metodos incrementar y decrementar
    //atributo cuenta
    private int cuenta;

    public void incrementar( int incremento){
        cuenta+=incremento;
    }

    public void decrementar (int decremento){
        cuenta-=decremento;
    }

    //get
    public int getCuenta() {
        return cuenta;
    }

    //set
    public void setCuenta(int cuenta1){
        cuenta=cuenta1;
    }

    //constructor por defecto
    public Contador(){

    }

        //constructor con params
    public Contador(int cuenta){
        this.cuenta=cuenta;
    }


    //constructor copia
    public Contador(Contador cont1){

        cuenta=cont1.cuenta;
    }
}
