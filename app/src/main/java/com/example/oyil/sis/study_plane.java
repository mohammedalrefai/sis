package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class study_plane extends AppCompatActivity implements View.OnClickListener {

    private Button log_out;

    private Button back;

    private TextView tx_view_1;

    private TextView tx_view_2;

    private TextView tx_view_3;

    private TextView tx_view_4;

    private TextView tx_view_5;

    private TextView tx_view_6;

    private TextView hours_number_1;

    private TextView hours_number_2;

    private TextView hours_number_3;

    private TextView hours_number_4;

    private TextView hours_number_5;

    private TextView hours_number_6;

    private TextView max_hours_1;

    private TextView max_hours_2;

    private TextView max_hours_3;

    private TextView max_hours_4;

    private TextView max_hours_5;

    private TextView max_hours_6;

    private TextView st_hours_1;

    private TextView st_hours_2;

    private TextView st_hours_3;

    private TextView st_hours_4;

    private TextView st_hours_5;

    private TextView st_hours_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_plane);
        set_up();
    }
    public void set_up(){





        log_out = (Button) findViewById(R.id.log_out_bt);

        back = (Button) findViewById(R.id.back_bt);

        tx_view_1= (TextView) findViewById(R.id.tx_view_1);

        tx_view_2 = (TextView) findViewById(R.id.tx_view_2);

        tx_view_3 = (TextView) findViewById(R.id.tx_view_3);

        tx_view_4 = (TextView) findViewById(R.id.tx_view_4);

        tx_view_5 = (TextView) findViewById(R.id.tx_view_5);

        tx_view_6 = (TextView) findViewById(R.id.tx_view_6);

        hours_number_1= (TextView) findViewById(R.id.hours_number_1);

        hours_number_2 = (TextView) findViewById(R.id.hours_number_2);

        hours_number_3 = (TextView) findViewById(R.id.hours_number_3);

        hours_number_4 = (TextView) findViewById(R.id.hours_number_4);

        hours_number_5 = (TextView) findViewById(R.id.hours_number_5);

        hours_number_6 = (TextView) findViewById(R.id.hours_number_6);

        max_hours_1= (TextView) findViewById(R.id.max_hours_1);

        max_hours_2 = (TextView) findViewById(R.id.max_hours_2);

        max_hours_3 = (TextView) findViewById(R.id.max_hours_3);

        max_hours_4 = (TextView) findViewById(R.id.max_hours_4);

        max_hours_5 = (TextView) findViewById(R.id.max_hours_5);

        max_hours_6 = (TextView) findViewById(R.id.max_hours_6);

        st_hours_1= (TextView) findViewById(R.id.st_hours_1);

        st_hours_2 = (TextView) findViewById(R.id.st_hours_2);

        st_hours_3 = (TextView) findViewById(R.id.st_hours_3);

        st_hours_4 = (TextView) findViewById(R.id.st_hours_4);

        st_hours_5 = (TextView) findViewById(R.id.st_hours_5);

        st_hours_6 = (TextView) findViewById(R.id.st_hours_6);





        log_out.setOnClickListener(this);

        back.setOnClickListener(this);







    }
    @Override

    public void onClick(View v) {

        switch(v.getId()){

            case R.id.log_out_bt:

                Intent log_out_intent = new Intent(study_plane.this,sign_in.class);

                startActivity(log_out_intent);

                break;

            case R.id.back_bt:

                Intent back_intent = new Intent(study_plane.this,sis.class);

                startActivity(back_intent);

                break;





        }

    }
}
