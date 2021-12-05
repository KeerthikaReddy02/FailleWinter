package com.example.drowsinessdetectorapp.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.drowsinessdetectorapp.R;
import com.example.drowsinessdetectorapp.activity.MainActivity;
import com.example.drowsinessdetectorapp.activity.NavBar_Activity;


    public class HomeFragment  extends AppCompatActivity {
        private static final String TAG = "AboutFragment";

        private ImageButton hamburgerImageButton;
        private TextView homeStartButton;
        private DrawerLayout startingDrawerLayout;

        private Animation button_click;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_home);
            Log.i(TAG,"Created");
            button_click = AnimationUtils.loadAnimation(this,R.anim.button_click);

            hamburgerImageButton = (ImageButton) findViewById(R.id.hamburgerImageButton);

            hamburgerImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    hamburgerImageButton.setAnimation(button_click);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(HomeFragment.this, NavBar_Activity.class);
                            startActivity(intent);
                            finish();
                        }
                    },200);
                }
            });
            homeStartButton = (TextView) findViewById(R.id.homeStartButton);
            homeStartButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    homeStartButton.startAnimation(button_click);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(HomeFragment.this,MainActivity.class);
                            startActivity(intent);

                        /*if (getActivity() != null)
                            getActivity().finish();*/
                        }
                    },100);
                }
            });

        }
    }