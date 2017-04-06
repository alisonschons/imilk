package com.example.alisonschons.imilk30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText usuario = (EditText) findViewById(R.id.usuario);
        EditText senha = (EditText) findViewById(R.id.senha);

        if(!usuario.getText().equals("master") && !senha.getText().equals("master")) {

        } else {

        }
    }
}
