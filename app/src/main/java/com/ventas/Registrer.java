package com.ventas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registrer extends AppCompatActivity {

    Button btnVolverHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registrer);

        btnVolverHome = findViewById(R.id.btn_volver_home);

        btnVolverHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                volverHomeDesdeRegistro();
            }


        });

    }
    public void volverHomeDesdeRegistro(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}