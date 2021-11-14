package com.example.ejercicioboton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numero_de_clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView text = (TextView) findViewById(R.id.count);
        text.setText("Boton clickeado "+numero_de_clicks+" veces");
        numero_de_clicks++;
    }
}