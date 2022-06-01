package com.codewithkohli.stupus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoard extends AppCompatActivity {
    Button attendance , feeDetails,studentsinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        attendance = findViewById(R.id.attendance);
        feeDetails = findViewById(R.id.feeDetails);
        studentsinfo = findViewById(R.id.studentsinfo);
        feeDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this,FeeDetails.class);
                startActivity(intent);
            }
        });
        studentsinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent2 = new Intent(DashBoard.this,studentsinfo.class);
            }
        });
    }
}