package com.example.aaryam123.everyday_challenge_final;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private Button saveNameButton;
    private String nameOfUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveNameButton = findViewById(R.id.saveName);
        name = findViewById(R.id.userName);

        // send intent to Ultimate Activity with name of user
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameOfUser = name.getText().toString();
                Intent i = new Intent(MainActivity.this, Ultimate_Activity.class);
                i.putExtra("USERNAME", nameOfUser);
                startActivity(i);
            }
        };

        saveNameButton.setOnClickListener(onClickListener);
    }
}
