package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class international_student_info extends AppCompatActivity implements View.OnClickListener {

    private Button save;
    private Button log_out;
    private Button back;
    private EditText Phone;
    private EditText address;
    private EditText email;
    private EditText country;
    private EditText state;
    private EditText street;
    private EditText zip;
    private EditText telephone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international_student_info);

        set_up();
    }

    public void set_up(){

        save = (Button) findViewById(R.id.save_bt);
        log_out = (Button) findViewById(R.id.log_out_bt);
        back = (Button) findViewById(R.id.back_bt);
        Phone = (EditText) findViewById(R.id.phone_txt);
        address = (EditText) findViewById(R.id.address_txt);
        email = (EditText) findViewById(R.id.email_txt);
        country = (EditText) findViewById(R.id.country_txt);
        state = (EditText) findViewById(R.id.state_txt);
        street = (EditText) findViewById(R.id.street_txt);
        zip = (EditText) findViewById(R.id.zip_txt);
        telephone = (EditText) findViewById(R.id.telephone_txt);

        save.setOnClickListener(this);
        log_out.setOnClickListener(this);
        back.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.save_bt:
                Intent save_intent = new Intent(international_student_info.this,international_student_info.class);
                startActivity(save_intent);
                break;
            case R.id.log_out_bt:
                Intent log_out_intent = new Intent(international_student_info.this,sign_in.class);
                startActivity(log_out_intent);
                break;
            case R.id.back_bt:
                Intent back_intent = new Intent(international_student_info.this,student_info.class);
                startActivity(back_intent);
                break;



        }

    }
}
