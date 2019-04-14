package com.example.my_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by abinshibuthomas on 3/12/2018.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Book.db";
    public static final String TABLE_NAME ="Booktable";
    public static final String COL_1="ID";
    public static final String COL_2="NAME";
    public static final String COL_3="NUMBER";
    public static final String COL_4="YEAR";
   public DataBaseHelper(Context context) {super(context,DATABASE_NAME,null,1); }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT ,NAME TEXT, NUMBER INTEGER,YEAR INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }
    public boolean insertData(String name, String number, String year) {
    SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,number);
        contentValues.put(COL_4,year);
        long result =db.insert(TABLE_NAME,null,contentValues);
        if (result==-1){
            return false;
        }else {
            return true;
        }
    }
    public Cursor getAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM "+TABLE_NAME,null);
        return res;
    }
}
