package com.example.practica2dani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listadeplaneta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listadeplaneta=(ListView) findViewById(R.id.titulo);
        ArrayAdapter<CharSequence>adaptador=ArrayAdapter.createFromResource(this, R.array.planetas, android.R.layout.simple_list_item_1);
        listadeplaneta.setAdapter(adaptador);

        listadeplaneta.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long i) {
                Toast.makeText(getApplicationContext(), "El elemento seleccionado es:" + adapterView.getItemAtPosition(position), Toast.LENGTH_LONG).show();
            }


            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }
}