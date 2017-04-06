package com.example.alisonschons.imilk30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        IntentIntegrator integrator = new IntentIntegrator(menu.this);
        integrator.initiateScan();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        // if (result != null) {

        //   Intent intent =
        //         new Intent(MainActivity.this,
        //               lancamento.class);
        // startActivity(intent);

        // TextView lblResultado = (TextView) findViewById(R.id.campo_nome);
        // lblResultado.setText(result.getContents());
        //  }
    }
}
