package com.nf.myapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.sax.StartElementListener;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.media.RatingCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView=(NavigationView) findViewById(R.id.navigation_slider);

        toolbar=(Toolbar)findViewById(R.id.toolbar);

        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);

        setSupportActionBar(toolbar);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.setting:
                        Toast.makeText(getApplicationContext(),"setting",Toast.LENGTH_LONG).show();
                        break;
                }
                return false;
            }
        });
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar, R.string.close, R.string.open);
        toggle.syncState();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.item_exit:
                finish();
                break;
            case R.id.item_sms:
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("sms:9893********"));
                startActivity(intent);
                break;
            case R.id.item_contact:
                Intent intent1=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:98938*******"));
                startActivity(intent1);
                break;
            case R.id.item_about:
                Intent intent2=new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(intent2);
                break;
            case R.id.item_web:
                Intent intent3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://google.com"));
                startActivity(intent3);
                break;

        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(Gravity.LEFT);
        }else
        {
            AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
            alert.setTitle(getResources().getString(R.string.exit));
            alert.setMessage(getResources().getString(R.string.are_you_sure));
            alert.setIcon(android.R.drawable.ic_menu_delete);


            alert.setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });

            alert.setNeutralButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alert.show();


        }
}}
