package com.example.you.finalexamcpsu2016.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by You on 18/12/2559.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "final.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "user";
    public static final String COL_ID = "_id";
    public static final String COL_NAME = "name";
    public static final String COL_USERNAME = "usename";
    public static final String COL_PASSWORD = "password";

    private static final String SQL_CRATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_NAME + " TEXT, "
                    + COL_USERNAME + " TEXT"
                    + COL_PASSWORD + " password"
                    + ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CRATE_TABLE);
        insertInitialData(db);
    }

    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();

        cv.put(COL_ID, "1");
        cv.put(COL_NAME, "Android Studio");
        cv.put(COL_USERNAME, "android");
        cv.put(COL_PASSWORD, "123456");

        cv.put(COL_ID, "2");
        cv.put(COL_NAME, "Promlert Lovichit");
        cv.put(COL_USERNAME, "promlert");
        cv.put(COL_PASSWORD, "456789");

        cv.put(COL_ID, "3");
        cv.put(COL_NAME, "Mark Zuckerberg");
        cv.put(COL_USERNAME, "markz");
        cv.put(COL_PASSWORD, "789012");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
