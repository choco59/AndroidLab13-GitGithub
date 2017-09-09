package com.example.choco.miaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.texto);
        texto.setText("pokemon");
    }
    public void  Cambiar_texto (View Vista){

    texto.setText("pokemon");
    }
}
