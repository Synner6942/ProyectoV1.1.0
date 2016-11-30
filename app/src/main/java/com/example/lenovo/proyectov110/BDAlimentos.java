package com.example.lenovo.proyectov110;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class BDAlimentos extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "prueba.db";
    private static final int DATABASE_VERSION = 1;

    public BDAlimentos(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    /*public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }*/

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
