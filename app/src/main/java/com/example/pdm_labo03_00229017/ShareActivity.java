package com.example.pdm_labo03_00229017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.pdm_labo03_00229017.utils.AppConstants;

public class ShareActivity extends AppCompatActivity {

    TextView tv_show_u, tv_show_p, tv_show_m, tv_show_g;
    Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        //Obteniendo ID's
        tv_show_u = findViewById(R.id.tv_show_u);
        tv_show_p = findViewById(R.id.tv_show_p);
        tv_show_m = findViewById(R.id.tv_show_m);
        tv_show_g = findViewById(R.id.tv_show_g);
        btn_share = findViewById(R.id.btn_share);

        //creacion del Bundle
       Bundle bundle = getIntent().getExtras();

       String tv_1, tv_2, tv_3, tv_4, message;

       tv_1 = bundle.getString(AppConstants.TEXT_KEY);
       tv_2 = bundle.getString(AppConstants.TEXT_KEY_1);
       tv_3 = bundle.getString(AppConstants.TEXT_KEY_2);
       tv_4 = bundle.getString(AppConstants.TEXT_KEY_3);

        tv_show_u.setText(tv_1);
        tv_show_p.setText(tv_2);
        tv_show_m.setText(tv_3);
        tv_show_g.setText(tv_4);

        message = "User: "
                + tv_1
                + " Password: "
                + tv_2
                + " E-Mail: "
                + tv_3
                + " Gender: "
                + tv_4;

        btn_share.setOnClickListener(v -> {
            Intent mIntent = new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT, message);
            startActivity(mIntent);
        });

    }
}
