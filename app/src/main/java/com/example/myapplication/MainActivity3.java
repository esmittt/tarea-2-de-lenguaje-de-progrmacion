package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText usuario,password;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        usuario = findViewById(R.id.usuario);
        password = findViewById(R.id.password);

    }

    public void login(View view) {
        String user = usuario.getText().toString();
        String pass = password.getText().toString();

        if (user.equals("klisman")) {
            if (pass.equals("12345")) {


                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }else
                {
                    Toast.makeText(this, " contraseña invalido", Toast.LENGTH_SHORT).show();
                }
            }
        else{
           Toast.makeText(this, "usuario o contraseña invalido", Toast.LENGTH_SHORT).show();
        }
    }


}