package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Time;
import java.util.Date;

public class MainActivity4 extends AppCompatActivity {
    EditText dia;
    Button newAlarma;
    EditText mensaje;
    EditText hora;
    EditText minuto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        hora = (EditText)findViewById (R.id.hora);
        minuto =(EditText) findViewById(R.id.minuto);
/*
        Button botonM7 = findViewById(R.id.newAlarma);
        botonM7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alarmas(message="texto para despertarse",hour=10,minutes=06);
            }

            private void alarmas(String message, int hour,int minutes) {
                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                        .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                        .putExtra(AlarmClock.EXTRA_HOUR, hour)
                        .putExtra(AlarmClock.EXTRA_MINUTES, minutes);

                startActivity(intent);

            }


        });*/


    }




    public void alarmas(View view) {

        int horas = Integer.parseInt(hora.getText().toString());
        int minutos = Integer.parseInt(minuto.getText().toString());


                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)

                .putExtra(AlarmClock.EXTRA_HOUR, horas )
                .putExtra(AlarmClock.EXTRA_MINUTES, minutos);

                startActivity(intent);

    }


}