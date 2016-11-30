package com.example.lenovo.proyectov110;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by lenovo on 16/11/2016.
 */
public class DBManager {

    public static final String TABLE_NAME = "Alimentos";
    public static final String CN_CATEGORIA = "Categoria";
    public static final String CN_ID = "_id";
    public static final String CN_NAME = "Nombre";
    public static final String CN_APODO = "apodo";
    public static final String CN_MORE = "descripcion";
    public static final String CN_IMG = "imagen";
    public static final String CN_CALORIAS = "Calorias";
    public static final String CN_GRASAS = "Grasas";
    public static final String CN_PROTEINAS = "Proteinas";
    public static final String CN_CARBOS = "Carbohidratos";
    public static final String CN_AZUCAR = "Azucar";
    public static final String CN_FIBRA = "Fibra";
    public static final String CN_COLESTEROL = "Colesterol";

    private BDAlimentos helper;
    private SQLiteDatabase db;
    public DBManager (Context context){
        helper = new BDAlimentos(context);
        db = helper.getReadableDatabase();
    }

    public Cursor cargarCursorFrutas(){
        String[] args = new String[]{"1"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarCursorVerduras(){
        String[] args = new String[]{"2"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarCursorCarne(){
        String[] args = new String[]{"3"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarCursorPescados(){
        String[] args = new String[]{"4"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarCursorLacteos(){
        String[] args = new String[]{"5"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarCursorCereales(){
        String[] args = new String[]{"6"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarCursorLegumbres(){
        String[] args = new String[]{"7"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarCursorFrutosSecos(){
        String[] args = new String[]{"8"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarCursorOtrosAlimentos(){
        String[] args = new String[]{"9"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarCursorPlatos(){
        String[] args = new String[]{"10"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarCursorBebidas(){
        String[] args = new String[]{"11"};
        String[] columnas = new String[]{CN_ID, CN_NAME};
        return db.query(TABLE_NAME,columnas,"Categoria=?",args,null,null,null);
    }

    public Cursor cargarInfoAlimento(String x){
        String[] cosa = new String[]{x};
        String[] columnas = new String[]{CN_ID, CN_CALORIAS, CN_PROTEINAS, CN_CARBOS, CN_FIBRA, CN_COLESTEROL, CN_AZUCAR};
        return db.query("Info_default",columnas,"_id=?",cosa,null,null,null);
    }
}
