package com.example.desarrollo_movil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        // Configuración del botón "Registrar"
        Button registerButton = findViewById(R.id.btnaceptargr);
        registerButton.setOnClickListener(v -> {
            // Mostrar notificación de "Registro exitoso"
            Toast.makeText(SecondActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();

            // Iniciar MainActivity
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK); // Limpiar la pila de actividades
            startActivity(intent);

            // Cerrar esta actividad
            finish();
        });
    }
}
