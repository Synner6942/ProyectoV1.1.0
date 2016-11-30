package com.example.lenovo.proyectov110;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class Lacteos extends AppCompatActivity {

    private DBManager manager;
    private Cursor cursor;
    private ListView lista;
    SimpleCursorAdapter adapter;
    SQLiteDatabase db;

    String[] from;
    ArrayList<String> texto = new ArrayList<String>();
    ArrayList<String> id_texto = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lista = (ListView) findViewById(R.id.listView1);
        manager = new DBManager(this);
        cursor = manager.cargarCursorLacteos();
        cursor.moveToFirst();
        //from = new String[]{manager.CN_CATEGORIA};

        for (int i = 0; i < cursor.getCount(); i++) {
            texto.add(cursor.getString((cursor.getColumnIndex("Nombre"))));
            id_texto.add(cursor.getString((cursor.getColumnIndex("_id"))));
            cursor.moveToNext();
        }

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, texto);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), cursor.getCount() + " posicion " + (i + 1) + texto.get(i), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Info_alimentos.class);
                intent.putExtra("Hola", id_texto.get(i));
                startActivity(intent);
            }
        });
    }

}
