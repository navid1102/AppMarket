package com.nf.myapp.javaClass;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.nf.myapp.AboutActivity;
import com.nf.myapp.R;

public class MyDialog
{

  public static void loginUi(final Activity activity)
  {
      AlertDialog.Builder myAlert=new AlertDialog.Builder(activity);

      LayoutInflater inflater=LayoutInflater.from(activity);

    View view=inflater.inflate(R.layout.login_layout,null);



      EditText editText_user=(EditText)view.findViewById(R.id.edt_userName);
      EditText editText_pass=(EditText) view.findViewById(R.id.edt_password);
      Button btn_cancel=(Button) view.findViewById(R.id.btn_calcel);
      Button btn_login=(Button)view.findViewById(R.id.btn_login);
      CheckBox checkBox=(CheckBox)view.findViewById(R.id.chek_save);


      myAlert.setView(view);
      myAlert.show();
  }
}
