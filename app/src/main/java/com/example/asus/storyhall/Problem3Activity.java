package com.example.asus.storyhall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Problem3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem3);

        buttonNext = (Button) findViewById(R.id.buttonNext3);

        buttonNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == buttonNext) {
            startActivity(new Intent(this, Problem4Activity.class));
        }
    }

    public void goBack(View v) {
        finish();
    }
}
