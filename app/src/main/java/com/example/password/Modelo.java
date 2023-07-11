package com.example.password;

public class Modelo {
    public static final int WEAK = 0;
    public static final int MEDIUM = 1;
    public static final int STRONG = 2;

    public int validarClave(String password) {
        if (password.length() < 5) {
            return WEAK;
        } else if (password.equals(password.toLowerCase())) {
            return MEDIUM;
        } else {
            return STRONG;
        }
    }
}
