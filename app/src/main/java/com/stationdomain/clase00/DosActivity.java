package com.stationdomain.clase00;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class DosActivity extends AppCompatActivity {

    public static final String LOGTAG = "DosActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        Log.i(LOGTAG, "onCreate");

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");

        Log.i(LOGTAG, "Nombre recibido: "+nombre);
    }

    /*@Override
    protected void onStart() {
        super.onStart();
        Log.i(LOGTAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOGTAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOGTAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOGTAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOGTAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(LOGTAG, "onRestart");
    }*/
}
