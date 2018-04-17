package com.nf.myapp;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nf.myapp.database.UserDbAdapter;
import com.nf.myapp.models.User;

public class RegisterUserActivity extends AppCompatActivity {

    EditText input_email,input_password;
    Button btn_Register;

    UserDbAdapter userDbAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        input_email=(EditText) findViewById(R.id.input_email);
        input_password=(EditText)findViewById(R.id.input_password);
        btn_Register=(Button)findViewById(R.id.btn_register);

        userDbAdapter=new UserDbAdapter(getApplicationContext());



        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                User user=new User();

                user.setPassWord(input_email.getText().toString());
                user.setUserName(input_password.getText().toString());

                long result =userDbAdapter.insert(user);

                if (result>0)
                {
                    Snackbar.make(view,getResources().getString(R.string.register_successful),Snackbar.LENGTH_LONG).show();
                }
                else {
                    Snackbar.make(view,getResources().getString(R.string.register_fail),Snackbar.LENGTH_LONG).show();
                }


            }
        });
    }
}
