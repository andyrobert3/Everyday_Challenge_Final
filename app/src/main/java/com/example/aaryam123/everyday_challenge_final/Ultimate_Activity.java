package com.example.aaryam123.everyday_challenge_final;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Ultimate_Activity extends AppCompatActivity {
    public final static int LIMIT = 3;
    // Create challenge book objects
    private ChallengeBook challengeBook = new ChallengeBook();

    // set Views and their variables
    private TextView helloText;
    private TextView usernameText;
    private ImageButton changeChallengeBtn;
    private TextView currChallengeText;
    private ImageButton finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultimate_);

        helloText = (TextView) findViewById(R.id.helloText);
        changeChallengeBtn = (ImageButton) findViewById(R.id.changeChallengeBtn);
        currChallengeText = (TextView) findViewById(R.id.currChallengeText);
        usernameText = (TextView) findViewById(R.id.usernameText);
        finish = findViewById(R.id.finishBtn);

        ImageButton settingsBtn = (ImageButton) findViewById(R.id.settingsBtn);
        ImageButton profileBtn = (ImageButton) findViewById(R.id.profileBtn);

        // Read username from Main Activity
        final String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString = null;
            } else {
                newString = extras.getString("USERNAME");
            }
        } else {
            newString = (String) savedInstanceState.getSerializable("USERNAME");
        }

        currChallengeText.setText(challengeBook.getRandomChallenge());

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (challengeBook.getNumberChallenge() < LIMIT) {
                    currChallengeText.setText(challengeBook.getRandomChallenge());
                } else {
                    Toast.makeText(Ultimate_Activity.this,
                            "Sorry, you've reached your daily limit for changing challenges!",
                            Toast.LENGTH_LONG).show();
                }
            }
        };

        View.OnClickListener finishChallenge = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };

        usernameText.setText(newString);
        changeChallengeBtn.setOnClickListener(onClickListener);

        ImageButton progressBtn = (ImageButton) findViewById(R.id.progressBtn);

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ultimate_Activity.this, Progress_Activity.class);
                startActivity(intent);
            }
        };
        // send intent to Ultimate Activity with name of user

        progressBtn.setOnClickListener(ocl);

        View.OnClickListener callProfile = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profInt = new Intent(Ultimate_Activity.this, profile.class);
                profInt.putExtra("USERNAME", newString);
                startActivity(profInt);
            }
        };
        // send intent to Ultimate Activity with name of user

        profileBtn.setOnClickListener(callProfile);

    }

}
