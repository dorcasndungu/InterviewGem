package com.example.interviewgem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ListActivity extends AppCompatActivity {
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.textReplace)
    TextView mTextReplace;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.skillList)
    ListView mSkillList;
    private final String[] softSkills = new String[] {"Excellent Communication", "Positive Attitude",
            " Strong Work Ethic", "Creativity", "Problem-Solving", "Teamwork",
            "Emotional Intelligence ", "Persuasiveness", "Leadership", "Quantitative Skills",
            "Curiosity", "Perform Under Pressure ", "Flexibility",
            "Decisiveness", "Empathy","Self Motivation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        final Unbinder bind = ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, softSkills);
       mSkillList.setAdapter(adapter);

       mSkillList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String softSkills= ((TextView)view).getText().toString();
                Toast.makeText(ListActivity.this, softSkills, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String personName= intent.getStringExtra("personName");
        String jobName = intent.getStringExtra("jobName");
        mTextReplace.setText(new StringBuilder().append(personName).append(" these skills are required in ").append(jobName).toString());
    }
}

