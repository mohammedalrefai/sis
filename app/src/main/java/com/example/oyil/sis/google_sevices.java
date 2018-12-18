package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class google_sevices extends AppCompatActivity implements View.OnClickListener {

    private ImageView drive;
    private ImageView gmail;
    private ImageView calender;
    private ImageView google_account;
    private Button log_out;
    private Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_sevices);

        set_up();
    }

    public void set_up(){

        drive = (ImageView) findViewById(R.id.drive_img);
        gmail = (ImageView) findViewById(R.id.gmail_img);
        calender = (ImageView) findViewById(R.id.calender_img);
        google_account = (ImageView) findViewById(R.id.google_account_img);
        log_out = (Button) findViewById(R.id.log_out_bt);
        back = (Button) findViewById(R.id.back_bt);

        drive.setOnClickListener(this);
        gmail.setOnClickListener(this);
        calender.setOnClickListener(this);
        google_account.setOnClickListener(this);
        log_out.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.drive_img:
                Intent drive_intent = new Intent(google_sevices.this,google_sevices.class);
                startActivity(drive_intent);
                break;
            case R.id.gmail_img:
                Intent gmail_intent = new Intent(google_sevices.this,google_sevices.class);
                startActivity(gmail_intent);
                break;
            case R.id.calender_img:
                Intent calender_intent = new Intent(google_sevices.this,google_sevices.class);
                startActivity(calender_intent);
                break;
            case R.id.google_account_img:
                Intent google_account_intent = new Intent(google_sevices.this,google_sevices.class);
                startActivity(google_account_intent);
                break;
            case R.id.log_out_bt:
                Intent log_out_intent = new Intent(google_sevices.this,google_sevices.class);
                startActivity(log_out_intent);
                break;
            case R.id.back_bt:
                Intent google_services_intent = new Intent(google_sevices.this,sis.class);
                startActivity(google_services_intent);
                break;


        }

    }
}
