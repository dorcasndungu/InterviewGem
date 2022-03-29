package com.example.interviewgem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.startButton)
    Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        startButton.setOnClickListener(this) ;
    }
    @Override
    public void onClick(View v) {
        if(v == startButton){
            Intent intent = new Intent(MainActivity.this, FormActivity.class);
            startActivity(intent);
        }

    }
}