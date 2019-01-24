package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class payment extends AppCompatActivity implements View.OnClickListener {

    private Button log_out;

    private Button back;

    private Button quere;

    private EditText hours_number;

    private TextView hours_fees;

    private TextView service_fees;

    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        set_up();
    }
    public void set_up() {
        log_out = (Button) findViewById(R.id.log_out_bt);

        back = (Button) findViewById(R.id.back_bt);

        quere = (Button) findViewById(R.id.quere_bt);

        hours_number= (EditText) findViewById(R.id.hours_number);

        hours_fees = (TextView) findViewById(R.id.hours_fees);

        service_fees = (TextView) findViewById(R.id.service_fees);

        total = (TextView) findViewById(R.id.total);


        quere.setOnClickListener(this);

        log_out.setOnClickListener(this);

        back.setOnClickListener(this);


    }
    @Override

    public void onClick(View v) {

        switch(v.getId()){

            case R.id.log_out_bt:

                Intent log_out_intent = new Intent(payment.this,sign_in.class);

                startActivity(log_out_intent);

                break;

            case R.id.back_bt:

                Intent back_intent = new Intent(payment.this,student_services.class);

                startActivity(back_intent);

                break;





        }

    }
}
