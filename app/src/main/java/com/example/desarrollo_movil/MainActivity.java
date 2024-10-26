package com.example.desarrollo_movil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button botonIniciarSesion, botonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciar botones de activity_main.xml
        botonIniciarSesion = findViewById(R.id.btnInicioSesion);
        botonRegistrar = findViewById(R.id.btnRegistro);

        // Configurar el botón de Iniciar Sesión
        botonIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar HomeActivity al hacer clic en Iniciar Sesión
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        // Configurar el botón de Registrar
        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar SecondActivity al hacer clic en Registrar
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
