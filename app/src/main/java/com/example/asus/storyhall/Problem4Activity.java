package com.example.asus.storyhall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Problem4Activity extends AppCompatActivity  implements View.OnClickListener {

    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem4);

        buttonNext = (Button) findViewById(R.id.buttonNext4);

        buttonNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == buttonNext) {
            startActivity(new Intent(this, Problem5Activity.class));
        }
    }

    public void goBack(View v) {
        finish();
    }
}
