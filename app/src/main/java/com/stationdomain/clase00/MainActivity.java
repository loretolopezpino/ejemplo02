package com.stationdomain.clase00;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String LOGTAG = "MainActivity";
    EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);

        Log.i(LOGTAG, "onCreate");
    }

    @Override
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
    }

    public void irSiguiente(View view) {
        String nombre = etNombre.getText().toString();
        Log.i(LOGTAG, "Nombre enviado: "+nombre);


        Intent intent = new Intent(this, DosActivity.class);
        intent.putExtra("nombre",nombre);
        startActivity(intent);
        finish();

    }
}
