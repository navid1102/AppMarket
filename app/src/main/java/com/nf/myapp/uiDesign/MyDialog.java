package com.nf.myapp.uiDesign;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nf.myapp.R;
import com.nf.myapp.RegisterUserActivity;
import com.nf.myapp.config.LoginManagement;
import com.nf.myapp.database.UserDbAdapter;
import com.nf.myapp.models.User;

public class MyDialog
{

  public static void loginUi(final Activity activity)
  {
    final LoginManagement loginManagement=new LoginManagement(activity);

      AlertDialog.Builder myAlert=new AlertDialog.Builder(activity);
    final UserDbAdapter userDbAdapter =new UserDbAdapter(activity);

      LayoutInflater inflater=LayoutInflater.from(activity);

    View view=inflater.inflate(R.layout.login_layout,null);




      final EditText editText_user=(EditText)view.findViewById(R.id.edt_userName);
      final EditText editText_pass=(EditText) view.findViewById(R.id.edt_password);
      Button btn_cancel=(Button) view.findViewById(R.id.btn_calcel);
      Button btn_login=(Button)view.findViewById(R.id.btn_login);
      final CheckBox checkBox=(CheckBox)view.findViewById(R.id.chek_save);
      TextView text_register=(TextView)view.findViewById(R.id.text_register);

      editText_user.setText(loginManagement.getUserName());
      editText_pass.setText(loginManagement.getPassWord());


      myAlert.setView(view);
      myAlert.show();

      btn_login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

          String userName=editText_user.getText().toString();
          String passWord=editText_pass.getText().toString();

          User user=new User();
          user.setUserName(userName);
          user.setPassWord(passWord);

          if (userDbAdapter.login(user) > 0)
          {
            if (checkBox.isChecked()) {
              loginManagement.saveData(user);
              Snackbar.make(view, "saved data your id is :"+userDbAdapter.login(user), Snackbar.LENGTH_LONG).show();//************
            } else{
              Snackbar.make(view, "dont saved data", Snackbar.LENGTH_LONG).show();}//********
          }
          else
          {

            Snackbar.make(view,"user name or password is false ! try again",Snackbar.LENGTH_LONG).show();//**************

          }

        }
      });

      text_register.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

          Intent intent=new Intent(activity, RegisterUserActivity.class);
          activity.startActivity(intent);

        }
      });




  }
}
