package com.example.asus.storyhall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProblemActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);

        buttonNext = (Button) findViewById(R.id.buttonNext2);

        buttonNext.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == buttonNext) {
            startActivity(new Intent(this, Problem2Activity.class));
        }
    }

    public void goBack(View v) {
        finish();
    }
}
