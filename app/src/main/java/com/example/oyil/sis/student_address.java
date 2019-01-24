package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class student_address extends AppCompatActivity implements View.OnClickListener{

    private Button save;
    private Button log_out;
    private Button back;
    private EditText f_address;
    private EditText s_address;
    private EditText th_address;
    private EditText address;
    private EditText phone_number;
    private EditText phone_number_2;
    private EditText father_work;
    private EditText mother_work;
    private EditText family_number;
    private EditText effort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_address);
        set_up();
    }

    public void set_up(){

        save = (Button) findViewById(R.id.save_bt);
        log_out = (Button) findViewById(R.id.log_out_bt);
        back = (Button) findViewById(R.id.back_bt);
        f_address = (EditText) findViewById(R.id.f_address);
        s_address = (EditText) findViewById(R.id.s_address);
        th_address = (EditText) findViewById(R.id.th_address);
        address = (EditText) findViewById(R.id.address);
        phone_number = (EditText) findViewById(R.id.phone_number);
        phone_number_2 = (EditText) findViewById(R.id.phone_number_2);
        father_work = (EditText) findViewById(R.id.father_work);
        mother_work = (EditText) findViewById(R.id.mother_work);
        family_number = (EditText) findViewById(R.id.family_number);
        effort = (EditText) findViewById(R.id.effort);

        save.setOnClickListener(this);
        log_out.setOnClickListener(this);
        back.setOnClickListener(this);

    }
    @Override

    public void onClick(View v) {

        switch(v.getId()){

            case R.id.log_out_bt:

                Intent log_out_intent = new Intent(student_address.this,sign_in.class);

                startActivity(log_out_intent);

                break;

            case R.id.back_bt:

                Intent back_intent = new Intent(student_address.this,student_info.class);

                startActivity(back_intent);

                break;
            case R.id.save_bt:

                Intent save_intent = new Intent(student_address.this,student_address.class);

                startActivity(save_intent);

                break;




        }

    }
}
