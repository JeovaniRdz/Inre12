package com.example.gerar.inre12;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

/**
 * Created by gerar on 19/02/2018.
 */

public class AdminSQLiteOpenHelper extends  SQLiteOpenHelper{
    public SQLiteDatabase db;

    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table departamentos(id primary key, text departamento)");
        db.execSQL("create table usuarios(id primary key, text usuario, int Nempleado, text jefe)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
