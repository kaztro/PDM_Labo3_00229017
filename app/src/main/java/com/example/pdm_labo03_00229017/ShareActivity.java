package com.example.pdm_labo03_00229017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    TextView tv_Shared;
    Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        tv_Shared = findViewById(R.id.tv_shared);

        btn_share = findViewById(R.id.btn_share);
    }
}
