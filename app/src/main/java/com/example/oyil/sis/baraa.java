package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class baraa extends AppCompatActivity  implements View.OnClickListener{

    private Button log_out;
    private Button back;
    private TextView department;
    private TextView library;
    private TextView doner;
    private TextView elevator_key;
    private TextView admission;
    private TextView loans;
    private TextView payment_fund;
    private TextView international_student_department;
    private TextView smart_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baraa);
        set_up();
    }
    public void set_up(){





        log_out = (Button) findViewById(R.id.log_out_bt);

        back = (Button) findViewById(R.id.back_bt);

        department = (TextView) findViewById(R.id.department);

        doner = (TextView) findViewById(R.id.doner);

        library = (TextView) findViewById(R.id.library);

        elevator_key = (TextView) findViewById(R.id.elevator_key);

        admission = (TextView) findViewById(R.id.admission);

        loans = (TextView) findViewById(R.id.loans);

        payment_fund = (TextView) findViewById(R.id.payment_fund);

        international_student_department = (TextView) findViewById(R.id.international_student_department);

        smart_card = (TextView) findViewById(R.id.smart_card);





        log_out.setOnClickListener(this);

        back.setOnClickListener(this);





    }
    @Override

    public void onClick(View v) {

        switch(v.getId()){

            case R.id.log_out_bt:

                Intent log_out_intent = new Intent(baraa.this,sign_in.class);

                startActivity(log_out_intent);

                break;

            case R.id.back_bt:

                Intent back_intent = new Intent(baraa.this,student_services.class);

                startActivity(back_intent);

                break;





        }

    }
}
