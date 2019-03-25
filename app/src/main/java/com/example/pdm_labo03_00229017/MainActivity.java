package com.example.pdm_labo03_00229017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pdm_labo03_00229017.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    TextView tv_user, tv_pass, tv_mail, tv_gender;
    EditText et_user, et_pass, et_mail, et_gender;
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextViews
        tv_user = findViewById(R.id.tv_username_id);
        tv_pass = findViewById(R.id.tv_pass);
        tv_mail = findViewById(R.id.tv_mail);
        tv_gender = findViewById(R.id.tv_gender);
        //EditTexts
        et_user = findViewById(R.id.et_user);
        et_pass = findViewById(R.id.et_pass);
        et_mail = findViewById(R.id.et_mail);
        et_gender = findViewById(R.id.et_gender);
        //Button
        btn_send = findViewById(R.id.btn_send);

        btn_send.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this, ShareActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, et_user.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_KEY_1, et_pass.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_KEY_2, et_mail.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_KEY_3, et_gender.getText().toString());
            startActivity(mIntent);
        });
    }
}
