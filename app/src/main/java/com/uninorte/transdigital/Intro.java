package com.uninorte.transdigital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void Onclik_Iniciar(View view) {
        Intent i = new Intent(this, Login.class);
        startActivity(i);

    }

    public void Onclick_Registro(View view) {
        Intent i = new Intent(this, Register.class);
        startActivity(i);

    }
}
