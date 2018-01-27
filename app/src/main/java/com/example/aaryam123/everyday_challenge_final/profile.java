package com.example.aaryam123.everyday_challenge_final;

import android.content.Intent;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Locale;

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
        TextView statsText = (TextView) findViewById(R.id.statsText);
        TextView levelText = (TextView) findViewById(R.id.levelText);
        ImageButton locationBtn = (ImageButton) findViewById(R.id.locationBtn);
        ImageView image6 = (ImageView) findViewById(R.id.imageView6);
        ImageView image7 = (ImageView) findViewById(R.id.imageView7);
        ImageView image8 = (ImageView) findViewById(R.id.imageView8);
        ImageView image9 = (ImageView) findViewById(R.id.imageView9);

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
