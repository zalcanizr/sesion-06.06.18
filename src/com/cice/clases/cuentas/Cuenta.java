package com.cice.clases.cuentas;

public class Cuenta {

    //Crea una clase cuenta con los métodos ingreso, reintegro y transferencia.

    private double balance;

    public void ingreso(double ingresa){
         balance+= ingresa;

    }

    public void reintegro(double reintegra){
        balance-=reintegra;

    }

    public void transferencia(double transfiere){
        balance-=transfiere;

    }

    //getBalance
    public double getBalance(){
        return balance;
    }

    //setBalance
    public void setBalance(double balance1){
        balance=balance1;
    }



}
