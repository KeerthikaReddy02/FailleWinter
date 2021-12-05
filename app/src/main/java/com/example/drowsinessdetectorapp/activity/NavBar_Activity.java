package com.example.drowsinessdetectorapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.drowsinessdetectorapp.R;
import com.example.drowsinessdetectorapp.fragment.AboutFragment;
import com.example.drowsinessdetectorapp.fragment.FactsFragment;
import com.example.drowsinessdetectorapp.fragment.HomeFragment;

import org.w3c.dom.Text;

public class NavBar_Activity extends AppCompatActivity {
    private static final String TAG = "NavBarActivity";
    private TextView home;
    private TextView about_us;
    private TextView facts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navbar_layout);
        Log.i(TAG,"Created");
        home = (TextView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavBar_Activity.this,HomeFragment.class);
                startActivity(intent);
                finish();
            }
        });
        facts = (TextView) findViewById(R.id.facts);
        facts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavBar_Activity.this, FactsFragment.class);
                startActivity(intent);
                finish();
            }
        });
        about_us = (TextView) findViewById(R.id.about_us);
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavBar_Activity.this, AboutFragment.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
