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

public class Progress_Activity extends AppCompatActivity {

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
                Intent intent = new Intent(Progress_Activity.this, ChallengeLevel1.class);
                        startActivity(intent);
            }
        };

        mLevel1.setOnClickListener(onClickListener1);

        View.OnClickListener onClickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                Intent intent = new Intent(Progress_Activity.this, challengelevel2.class);
                startActivity(intent);
            }
        };

        mLevel2.setOnClickListener(onClickListener2);

        View.OnClickListener onClickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                Intent intent = new Intent(Progress_Activity.this, challengelevel3.class);
                startActivity(intent);
            }
        };

        mLevel3.setOnClickListener(onClickListener3);

        View.OnClickListener onClickListener4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                Intent intent = new Intent(Progress_Activity.this, challengelevel4.class);
                startActivity(intent);
            }
        };

        mLevel4.setOnClickListener(onClickListener4);

        View.OnClickListener onClickListener5 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                Intent intent = new Intent(Progress_Activity.this, challengelevel5.class);
                startActivity(intent);
            }
        };

        mLevel5.setOnClickListener(onClickListener5);

        View.OnClickListener onClickListener6 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                Intent intent = new Intent(Progress_Activity.this, challengelevel6.class);
                startActivity(intent);
            }
        };

        mLevel6.setOnClickListener(onClickListener6);

        View.OnClickListener onClickListener7 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                Intent intent = new Intent(Progress_Activity.this, challengelevel7.class);
                startActivity(intent);
            }
        };

        mLevel7.setOnClickListener(onClickListener7);

        View.OnClickListener onClickListener8 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                Intent intent = new Intent(Progress_Activity.this, challengelevel8.class);
                startActivity(intent);
            }
        };

        mLevel8.setOnClickListener(onClickListener8);

        View.OnClickListener onClickListener9 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                Intent intent = new Intent(Progress_Activity.this, challengelevel9.class);
                startActivity(intent);
            }
        };

        mLevel9.setOnClickListener(onClickListener9);

        //BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
