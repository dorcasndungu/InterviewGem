package com.example.interviewgem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.chip.Chip;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FormActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.submitChip) Chip mSubmitChip;

    @BindView(R.id.personName)EditText mPersonName;

    @BindView(R.id.jobName)EditText mJobName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ButterKnife.bind(this);
        mSubmitChip.setOnClickListener(this) ;
    }
    @Override
    public void onClick(View v) {
        if(v == mSubmitChip){
            String personName = mPersonName.getText().toString();
            String jobName=mJobName.getText().toString();
            Intent intent = new Intent(FormActivity.this, ListActivity.class);
            intent.putExtra("personName", personName);
            intent.putExtra("jobName", jobName);
            startActivity(intent);
}}}