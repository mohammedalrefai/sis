package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ename extends AppCompatActivity implements View.OnClickListener {
    private Button log_out;
    private Button back;
    private Button save;
    private Button clear;
    private EditText f_name;
    private EditText s_name;
    private EditText t_name;
    private EditText l_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ename);
        set_up();
    }
    public void set_up(){

        log_out = (Button) findViewById(R.id.log_out_bt);
        back = (Button) findViewById(R.id.back_bt);
        save=(Button)findViewById(R.id.save_bt) ;
        clear = (Button)findViewById(R.id.clear_bt);
        f_name = (EditText)findViewById(R.id.fname);
        s_name = (EditText)findViewById(R.id.sname);
        t_name = (EditText)findViewById(R.id.tname);
        l_name = (EditText)findViewById(R.id.lname);
        log_out.setOnClickListener(this);
        back.setOnClickListener(this);
        save.setOnClickListener(this);
        clear.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.log_out_bt:
                Intent log_out_intent = new Intent(Ename.this, sign_in.class);
                startActivity(log_out_intent);
                break;
            case R.id.back_bt:
                Intent back_intent = new Intent(Ename.this, student_info.class);
                startActivity(back_intent);
                break;
            case R.id.save_bt:
                Intent save_intent = new Intent(Ename.this, Ename.class);
                startActivity(save_intent);
                break;
            case R.id.clear_bt:
                Intent clear_intent = new Intent(Ename.this, Ename.class);
                startActivity(clear_intent);
                break;
        }}
}
