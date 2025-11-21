package com.example.layoutsdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnFrame, btnLinear, btnTable, btnRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFrame = findViewById(R.id.btnFrame);
        btnLinear = findViewById(R.id.btnLinear);
        btnTable = findViewById(R.id.btnTable);
        btnRelative = findViewById(R.id.btnRelative);

        btnFrame.setOnClickListener(v -> navegar(FrameActivity.class));
        btnLinear.setOnClickListener(v -> navegar(LinearActivity.class));
        btnTable.setOnClickListener(v -> navegar(TableActivity.class));
        btnRelative.setOnClickListener(v -> navegar(RelativeActivity.class));
    }

    private void navegar(Class<?> destino) {
        Toast.makeText(this, "Cambiando de pantalla...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, destino));
    }
}
