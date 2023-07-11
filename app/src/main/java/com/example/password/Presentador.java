package com.example.password;

public class Presentador {
    protected Modelo modelo;
    public void evaluarClave(String password){
        int nivelFortaleza = modelo.validarClave(password);
        if (nivelFortaleza == Modelo.WEAK) {

        } else if (nivelFortaleza == Modelo.MEDIUM) {

        } else if (nivelFortaleza == Modelo.STRONG) {

        }else {

        }
    }
}
