package com.example.aaryam123.everyday_challenge_final;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.Level;

public class Progress_Activity extends AppCompatActivity {
    private Levels levels = new Levels();
    private TextView mTextMessage;
    private ImageButton mLevel1;
    private ImageButton mLevel2;
    private ImageButton mLevel3;
    private ImageButton mLevel4;
    private ImageButton mLevel5;
    private ImageButton mLevel6;
    private ImageButton mLevel7;
    private ImageButton mLevel8;
    private ImageButton mLevel9;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_);

        mLevel1 = findViewById(R.id.level1);
        mLevel2 = findViewById(R.id.level2);
        mLevel3 = findViewById(R.id.level3);
        mLevel4 = findViewById(R.id.level4);
        mLevel5 = findViewById(R.id.level5);
        mLevel6 = findViewById(R.id.level6);
        mLevel7 = findViewById(R.id.level7);
        mLevel8 = findViewById(R.id.level8);
        mLevel9 = findViewById(R.id.level9);

        mTextMessage = (TextView) findViewById(R.id.message);

        View.OnClickListener onClickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                if (levels.getCurrLevel() < 1) {
                    Toast.makeText(Progress_Activity.this,
                            "Sorry, your current level is not high enough. Complete more daily challenges",
                            Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Progress_Activity.this, ChallengeLevel1.class);
                    startActivity(intent);
                }
            }
        };

        View.OnClickListener onClickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                if (levels.getCurrLevel() < 2) {
                    Toast.makeText(Progress_Activity.this,
                            "Sorry, your current level is not high enough. Complete more daily challenges",
                            Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Progress_Activity.this, challengelevel2.class);
                    startActivity(intent);
                }
            }
        };

        View.OnClickListener onClickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                if (levels.getCurrLevel() < 3) {
                    Toast.makeText(Progress_Activity.this,
                            "Sorry, your current level is not high enough. Complete more daily challenges",
                            Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Progress_Activity.this, challengelevel3.class);
                    startActivity(intent);
                }
            }
        };

        View.OnClickListener onClickListener4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                if (levels.getCurrLevel() < 4) {
                    Toast.makeText(Progress_Activity.this,
                            "Sorry, your current level is not high enough. Complete more daily challenges",
                            Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Progress_Activity.this, challengelevel4.class);
                    startActivity(intent);
                }
            }
        };

        View.OnClickListener onClickListener5 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                if (levels.getCurrLevel() < 5) {
                    Toast.makeText(Progress_Activity.this,
                            "Sorry, your current level is not high enough. Complete more daily challenges",
                            Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Progress_Activity.this, challengelevel5.class);
                    startActivity(intent);
                }
            }
        };

        View.OnClickListener onClickListener6 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                if (levels.getCurrLevel() < 6) {
                    Toast.makeText(Progress_Activity.this,
                            "Sorry, your current level is not high enough. Complete more daily challenges",
                            Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Progress_Activity.this, challengelevel6.class);
                    startActivity(intent);
                }
            }
        };

        View.OnClickListener onClickListener7 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                if (levels.getCurrLevel() < 7) {
                    Toast.makeText(Progress_Activity.this,
                            "Sorry, your current level is not high enough. Complete more daily challenges",
                            Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Progress_Activity.this, challengelevel7.class);
                    startActivity(intent);
                }
            }
        };

        View.OnClickListener onClickListener8 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                if (levels.getCurrLevel() < 8) {
                    Toast.makeText(Progress_Activity.this,
                            "Sorry, your current level is not high enough. Complete more daily challenges",
                            Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Progress_Activity.this, challengelevel8.class);
                    startActivity(intent);
                }
            }
        };

        View.OnClickListener onClickListener9 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                if (levels.getCurrLevel() < 9) {
                    Toast.makeText(Progress_Activity.this,
                            "Sorry, your current level is not high enough. Complete more daily challenges",
                            Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Progress_Activity.this, challengelevel9.class);
                    startActivity(intent);
                }
            }
        };

        mLevel1.setOnClickListener(onClickListener1);
        mLevel2.setOnClickListener(onClickListener2);
        mLevel3.setOnClickListener(onClickListener3);
        mLevel4.setOnClickListener(onClickListener4);
        mLevel5.setOnClickListener(onClickListener5);
        mLevel6.setOnClickListener(onClickListener6);
        mLevel7.setOnClickListener(onClickListener7);
        mLevel8.setOnClickListener(onClickListener8);
        mLevel9.setOnClickListener(onClickListener9);

        //BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
