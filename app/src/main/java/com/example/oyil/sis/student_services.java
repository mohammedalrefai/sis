package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class student_services extends AppCompatActivity implements View.OnClickListener {

    private ImageView progress;
    private ImageView uncomplete;
    private ImageView quittance;
    private ImageView pay;
    private ImageView suspend;
    private ImageView health_requir;
    private Button log_out;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_services);

        set_up();

    }

    public void set_up(){
        progress = (ImageView) findViewById(R.id.progress_img);
        uncomplete = (ImageView) findViewById(R.id.uncomplete_img);
        quittance = (ImageView) findViewById(R.id.quittance_img);
        pay = (ImageView) findViewById(R.id.pay_img);
        suspend = (ImageView) findViewById(R.id.suspend_img);
        health_requir = (ImageView) findViewById(R.id.health_requir_img);
        log_out = (Button) findViewById(R.id.log_out_bt);
        back = (Button) findViewById(R.id.back_bt);

        progress.setOnClickListener(this);
        uncomplete.setOnClickListener(this);
        quittance.setOnClickListener(this);
        pay.setOnClickListener(this);
        suspend.setOnClickListener(this);
        health_requir.setOnClickListener(this);
        log_out.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.progress_img:
                Intent progress_intent = new Intent(student_services.this,student_services.class);
                startActivity(progress_intent);
                break;
            case R.id.uncomplete_img:
                Intent table_intent = new Intent(student_services.this,student_services.class);
                startActivity(table_intent);
                break;
            case R.id.quittance_img:
                Intent register_intent = new Intent(student_services.this,student_services.class);
                startActivity(register_intent);
                break;
            case R.id.pay_img:
                Intent academic_intent = new Intent(student_services.this,student_services.class);
                startActivity(academic_intent);
                break;
            case R.id.suspend_img:
                Intent info_intent = new Intent(student_services.this,student_services.class);
                startActivity(info_intent);
                break;
            case R.id.health_requir_img:
                Intent service_intent = new Intent(student_services.this,student_services.class);
                startActivity(service_intent);
                break;
            case R.id.log_out_bt:
                Intent log_out_intent = new Intent(student_services.this,student_services.class);
                startActivity(log_out_intent);
                break;
            case R.id.back_bt:
                Intent google_services_intent = new Intent(student_services.this,sis.class);
                startActivity(google_services_intent);
                break;

        }
    }
}
