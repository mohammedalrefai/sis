package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class acad extends AppCompatActivity implements View.OnClickListener {

    private Button log_out;

    private Button back;

    private Button mark_bt;

    private TextView academic;

    private TextView gpa;

    private TextView hours;

    private TextView pass_hours;

    private TextView academic_status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acad);
        set_up();
    }
    public void set_up(){





        log_out = (Button) findViewById(R.id.log_out_bt);

        back = (Button) findViewById(R.id.back_bt);

        mark_bt = (Button) findViewById(R.id.mark_sub_bt);

        academic = (TextView) findViewById(R.id.academic);

        hours = (TextView) findViewById(R.id.hours);

        gpa = (TextView) findViewById(R.id.gpa);

        pass_hours = (TextView) findViewById(R.id.pass_hours);

        academic_status = (TextView) findViewById(R.id.acadeic_status);





        log_out.setOnClickListener(this);

        back.setOnClickListener(this);

        mark_bt.setOnClickListener(this);



    }
    @Override

    public void onClick(View v) {

        switch(v.getId()){

            case R.id.log_out_bt:

                Intent log_out_intent = new Intent(acad.this,sign_in.class);

                startActivity(log_out_intent);

                break;

            case R.id.back_bt:

                Intent back_intent = new Intent(acad.this,sis.class);

                startActivity(back_intent);

                break;

            case R.id.mark_sub_bt:

                Intent mark_intent = new Intent(acad.this,acad.class);

                startActivity(mark_intent);

                break;




        }

    }
}
