package com.nf.myapp.database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AppMarketDataBase extends SQLiteOpenHelper
{
    public static String dataBaseName="appMarket.db";
    public static int versionDb=1;


    public static String tbl_user="tbl_user";
    public static String key_ID="ID";
    public static  String key_userName="UserName";
    public static String key_passWord="PassWord";


    public AppMarketDataBase(Context context) {
        super(context,dataBaseName, null, versionDb);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


        String queryString="create table "+tbl_user+" ("+key_ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
                key_userName+" Text,"+key_passWord+" Text)";

        sqLiteDatabase.execSQL(queryString);

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}