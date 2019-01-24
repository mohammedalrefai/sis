package com.example.oyil.sis;



import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.TextView;


public class student_infor extends AppCompatActivity implements View.OnClickListener {

    private Button scholarship;

    private Button back;

    private Button log_out;

    private TextView st_name;

    private TextView collage;

    private TextView department;

    private TextView study_filed;

    private TextView academic_status;

    private TextView gender;

    private TextView expected_graduate;

    private TextView regstration_date;

    private TextView regstration_date_1;

    private TextView regstration_date_2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_student_infor);



        set_up();

    }



    public void set_up(){

        scholarship = (Button) findViewById(R.id.scholarship_bt);

        back = (Button) findViewById(R.id.back_bt);

        log_out = (Button) findViewById(R.id.log_out_bt);

        st_name= (TextView) findViewById(R.id.st_name);

        collage = (TextView) findViewById(R.id.collage);

        department = (TextView) findViewById(R.id.department);

        study_filed = (TextView) findViewById(R.id.study_filed);

        academic_status = (TextView) findViewById(R.id.academic_status);

        gender = (TextView) findViewById(R.id.gender);

        expected_graduate= (TextView) findViewById(R.id.expected_graduate);

        regstration_date = (TextView) findViewById(R.id.regstration_date);

        regstration_date_1 = (TextView) findViewById(R.id.regstration_date_1);

        regstration_date_2 = (TextView) findViewById(R.id.regstration_date_2);


        log_out.setOnClickListener(this);

        scholarship.setOnClickListener(this);

        back.setOnClickListener(this);

    }



    @Override

    public void onClick(View v) {

        switch(v.getId()){

            case R.id.scholarship_bt:

                Intent scholarship_intent = new Intent(student_infor.this,scholarship.class);

                startActivity(scholarship_intent);

                break;

            case R.id.back_bt:

                Intent back_intent = new Intent(student_infor.this,student_info.class);

                startActivity(back_intent);

                break;
            case R.id.log_out_bt:
                Intent log_out_intent = new Intent(student_infor.this, sign_in.class);
                startActivity(log_out_intent);
                break;


        }

    }



}