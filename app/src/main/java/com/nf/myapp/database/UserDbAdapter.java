package com.nf.myapp.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.nf.myapp.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KarAmad-user on 4/17/2018.
 */

public class UserDbAdapter extends AppMarketDataBase
{

    public UserDbAdapter(Context context) {
        super(context);
    }

     public long insert(User user)
    {
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(key_userName,user.getUserName());
        contentValues.put(key_passWord,user.getPassWord());

        return sqLiteDatabase.insert(tbl_user,null,contentValues);
    }

    public long updata(User user)
    {
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        ContentValues contentValues=new ContentValues();

        contentValues.put(key_userName,user.getPassWord());
        return sqLiteDatabase.update(tbl_user,contentValues,key_ID+"=? ",new String[]{user.getId()+""});

    }

    public long deletAll()
    {
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        return sqLiteDatabase.delete(tbl_user,null,null);
    }

    public long deleaUser(int id)
    {
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        return sqLiteDatabase.delete(tbl_user,key_ID+"=? ",new String[]{id+""});
    }


    public List<String> selectAll()
    {
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        List<String> userList=new ArrayList<>();

         Cursor cursor=sqLiteDatabase.rawQuery("SELECT * FROM"+tbl_user,null);

         while (cursor.moveToNext())
         {
            int id=cursor.getInt(cursor.getColumnIndex(key_ID));

            String userName=cursor.getString(cursor.getColumnIndex(key_userName));

            userList.add(userName);
         }

         return userList;
    }
}
