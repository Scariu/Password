package com.example.password;

public class Presentador {
    private IViewPresenter iViewPresenter;
    private Modelo modelo;
    public Presentador(IViewPresenter iViewPresenter){
        this.iViewPresenter = iViewPresenter;

        modelo = new Modelo();
    }

    //Se enlaza Presentador a Modelo
    public void evaluarClave(String password) {
        int nivelFortaleza = modelo.validarClave(password);
        if (nivelFortaleza == Modelo.WEAK) {
            this.iViewPresenter.showWeak();

        } else if (nivelFortaleza == Modelo.MEDIUM) {
            this.iViewPresenter.showMedium();

        } else if (nivelFortaleza == Modelo.STRONG) {
            this.iViewPresenter.showStrong();

        } else {
            this.iViewPresenter.showError();
        }
    }
}
