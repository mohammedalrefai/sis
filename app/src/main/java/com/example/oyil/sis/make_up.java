package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class make_up extends AppCompatActivity implements View.OnClickListener {



    private Button log_out;

    private Button back;

    private Button make_up;

    private EditText course;

    private EditText excuse;

    private EditText description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_up);
        set_up();
    }
    public void set_up() {
        log_out = (Button) findViewById(R.id.log_out_bt);

        back = (Button) findViewById(R.id.back_bt);

        make_up = (Button) findViewById(R.id.make_up_bt);

        course= (EditText) findViewById(R.id.course);

        excuse = (EditText) findViewById(R.id.excuse);

        description = (EditText) findViewById(R.id.description);

        make_up.setOnClickListener(this);

        log_out.setOnClickListener(this);

        back.setOnClickListener(this);
    }
    @Override

    public void onClick(View v) {

        switch(v.getId()){

            case R.id.log_out_bt:

                Intent log_out_intent = new Intent(make_up.this,sign_in.class);

                startActivity(log_out_intent);

                break;

            case R.id.back_bt:

                Intent back_intent = new Intent(make_up.this,student_services.class);

                startActivity(back_intent);

                break;





        }

    }
}
