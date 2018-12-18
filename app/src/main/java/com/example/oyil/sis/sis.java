package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class sis extends AppCompatActivity implements View.OnClickListener {

    private ImageView plan;
    private ImageView table;
    private ImageView register;
    private ImageView academic;
    private ImageView info;
    private ImageView service;
    private Button log_out_bt;
    private Button google_services_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sis);

        set_up();
    }

    public void set_up(){
        plan = (ImageView) findViewById(R.id.plan_img);
        table = (ImageView) findViewById(R.id.table_img);
        register = (ImageView) findViewById(R.id.register_img);
        academic = (ImageView) findViewById(R.id.academic_img);
        info = (ImageView) findViewById(R.id.info_img);
        service = (ImageView) findViewById(R.id.service_img);
        log_out_bt = (Button) findViewById(R.id.log_out_bt);
        google_services_btn = (Button) findViewById(R.id.google_services_bt);

        plan.setOnClickListener(this);
        table.setOnClickListener(this);
        register.setOnClickListener(this);
        academic.setOnClickListener(this);
        info.setOnClickListener(this);
        service.setOnClickListener(this);
        log_out_bt.setOnClickListener(this);
        google_services_btn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.plan_img:
                Intent plan_intent = new Intent(sis.this,sis.class);
                startActivity(plan_intent);
                break;
            case R.id.table_img:
                Intent table_intent = new Intent(sis.this,sis.class);
                startActivity(table_intent);
                break;
            case R.id.register_img:
                Intent register_intent = new Intent(sis.this,sis.class);
                startActivity(register_intent);
                break;
            case R.id.academic_img:
                Intent academic_intent = new Intent(sis.this,sis.class);
                startActivity(academic_intent);
                break;
            case R.id.info_img:
                Intent info_intent = new Intent(sis.this,student_info.class);
                startActivity(info_intent);
                break;
            case R.id.service_img:
                Intent service_intent = new Intent(sis.this,student_services.class);
                startActivity(service_intent);
                break;
            case R.id.log_out_bt:
                Intent log_out_intent = new Intent(sis.this,sis.class);
                startActivity(log_out_intent);
                break;
            case R.id.google_services_bt:
                Intent google_services_intent = new Intent(sis.this,google_sevices.class);
                startActivity(google_services_intent);
                break;

        }
    }
}
