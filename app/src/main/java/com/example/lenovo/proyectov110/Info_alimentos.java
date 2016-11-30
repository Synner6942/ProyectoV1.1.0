package com.example.lenovo.proyectov110;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Info_alimentos extends AppCompatActivity {

    private DBManager manager;
    private Cursor cursor;
    private ListView lista;
    SimpleCursorAdapter adapter;
    SQLiteDatabase db;

    ArrayList<String> _datos = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_alimentos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView texto = (TextView)findViewById(R.id.texto_prueba);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with you1r own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String extras= getIntent().getStringExtra("Hola");

        lista = (ListView) findViewById(R.id.listView1);
        manager = new DBManager(this);
        cursor = manager.cargarInfoAlimento(extras);
        cursor.moveToFirst();

        _datos.add(cursor.getString((cursor.getColumnIndex("Calorias"))));
        _datos.add(cursor.getString((cursor.getColumnIndex("Proteinas"))));
        _datos.add(cursor.getString((cursor.getColumnIndex("Carbohidratos"))));
        _datos.add(cursor.getString((cursor.getColumnIndex("Fibra"))));
        _datos.add(cursor.getString((cursor.getColumnIndex("Colesterol"))));
        _datos.add(cursor.getString((cursor.getColumnIndex("Azucar"))));

        texto.setText("Cada 100g"+"\n"+"Calorias: "+ _datos.get(0)+"\n"+"Proteinas: "+_datos.get(1)+"\n"+"Carbohidratos: "+_datos.get(2)+"\n"+"Fibra: "+_datos.get(3)+"\n"+"Colesterol: "+_datos.get(4)+"\n"+"Azucar: "+_datos.get(5));
    }

}
