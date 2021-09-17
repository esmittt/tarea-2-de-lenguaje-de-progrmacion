package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonM1 = findViewById(R.id.metodo1);
        botonM1.setOnClickListener(this);

        Button botonM2 = findViewById(R.id.metodo2);
        botonM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Metodo 2", Toast.LENGTH_SHORT).show();
            }
        });

        Toolbar miToolbar = findViewById(R.id.mitoolvar);
        setSupportActionBar(miToolbar);

    }
    @Override
    public  void onClick(View view){
        Toast.makeText(this, "Metodo 1", Toast.LENGTH_SHORT).show();
    }


    public void mostraMensaje(View view) {
        Toast.makeText(this, "Metodo 3", Toast.LENGTH_SHORT).show();
    }


    public void enviarActivity(View view) {
        Intent intent =new Intent(this,MainActivity2.class);
        intent.putExtra("nombre","klisman");
        intent.putExtra("apellido","albornoz");
    startActivity(intent);
    }

    public void llamarUniversidad(View view) {
        Intent intent =new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+"+51 952696972"));
        startActivity(intent);
    }

    public void enviarAlarma(View view) {
        Intent intent =new Intent(this,MainActivity2.class);

        startActivity(intent);
    }

    public void saliApp(View view) {
        finish();
    }
}





