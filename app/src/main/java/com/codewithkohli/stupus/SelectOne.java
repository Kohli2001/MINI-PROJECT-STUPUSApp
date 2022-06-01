package com.codewithkohli.stupus;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codewithkohli.stupus.ui.login.*;
import com.codewithkohli.stupus.Login;

public class SelectOne extends AppCompatActivity {
    Button institutelogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_one);
        institutelogin = findViewById(R.id.institutelogin);
        Intent intent = getIntent();
        institutelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent2 = new Intent(SelectOne.this, Login.class);
                startActivity(intent2);
            }
        });
    }
}