package com.example.aaryam123.everyday_challenge_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Ultimate_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultimate_);

        TextView helloText = (TextView) findViewById(R.id.helloText);


        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("USERNAME");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("USERNAME");
        }
        TextView usernameText = (TextView) findViewById(R.id.usernameText);
        usernameText.setText(newString);

        Button changeChallengeBtn = (Button) findViewById(R.id.changeChallengeBtn);
        TextView currChallengeText = (TextView) findViewById(R.id.currChallengeText);
    }

}
