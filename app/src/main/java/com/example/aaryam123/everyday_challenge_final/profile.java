package com.example.aaryam123.everyday_challenge_final;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class profile extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageButton facebookBtn = (ImageButton) findViewById(R.id.facebookBtn);
        ImageButton whatsappBtn = (ImageButton) findViewById(R.id.whatsappBtn);
        TextView welcomeText = (TextView) findViewById(R.id.welcomeText);
        TextView facebookText = (TextView) findViewById(R.id.facebookText);
        TextView whatsappText = (TextView) findViewById(R.id.whatsappText);
        TextView challengeText = (TextView) findViewById(R.id.challengeText);
        TextView wantText = (TextView) findViewById(R.id.wantText);
        TextView profNameText = (TextView) findViewById(R.id.profNameText);

        final String nameInput;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                nameInput = null;
            } else {
                nameInput = extras.getString("USERNAME");
            }
        } else {
            nameInput = (String) savedInstanceState.getSerializable("USERNAME");
        }

        profNameText.setText(nameInput);

    }
}
