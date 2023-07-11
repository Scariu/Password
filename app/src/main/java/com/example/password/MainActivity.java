package com.example.password;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import com.example.password.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IViewPresenter {
    private ActivityMainBinding binding;
    private Presentador presentador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presentador = new Presentador(this);
        binding.textViewTitle.setText("¿Qué tan segura es tu contraseña?");
        //Para que se evalue mientras se escribe.
        binding.editTextPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presentador.evaluarClave(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void showWeak() {
        Toast.makeText(this, "Débil", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMedium() {
        Toast.makeText(this, "Medio", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showStrong() {
        Toast.makeText(this, "Fuerte", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}