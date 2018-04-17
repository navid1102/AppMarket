package com.nf.myapp.config;

import android.content.Context;
import android.content.SharedPreferences;

import com.nf.myapp.models.User;

/**
 * Created by KarAmad-user on 4/17/2018.
 */

public class LoginManagement
{
    SharedPreferences sh;
    SharedPreferences.Editor editor;
    Context context;

    public LoginManagement(Context context)
    {this.context=context;
        sh=context.getSharedPreferences("userData",Context.MODE_PRIVATE);
        editor=sh.edit();
    }

    public void saveData(User user)
    {
        editor.putString("userName",user.getUserName());
        editor.putString("passWord",user.getPassWord());
        editor.commit();
    }

    public String getUserName(){
        return sh.getString("userName","");
    }

    public String getPassWord()
    {
        return sh.getString("passWord","");
    }
}
