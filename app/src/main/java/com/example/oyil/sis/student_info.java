package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class student_info extends AppCompatActivity implements View.OnClickListener {

    private ImageView info;
    private ImageView foreign;
    private ImageView address;
    private ImageView name;
    private Button log_out;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        set_up();

    }

    public void set_up(){
        info = (ImageView) findViewById(R.id.info_img);
        foreign = (ImageView) findViewById(R.id.foreign_img);
        address = (ImageView) findViewById(R.id.address_img);
        name = (ImageView) findViewById(R.id.name_img);
        log_out = (Button) findViewById(R.id.log_out_bt);
        back = (Button) findViewById(R.id.back_bt);

        info.setOnClickListener(this);
        foreign.setOnClickListener(this);
        address.setOnClickListener(this);
        name.setOnClickListener(this);
        log_out.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.info_img:
                Intent info_intent = new Intent(student_info.this,student_infor.class);
                startActivity(info_intent);
                break;
            case R.id.foreign_img:
                Intent foreign_intent = new Intent(student_info.this,international_student_info.class);
                startActivity(foreign_intent);
                break;
            case R.id.address_img:
                Intent address_intent = new Intent(student_info.this,student_address.class);
                startActivity(address_intent);
                break;
            case R.id.name_img:
                Intent name_intent = new Intent(student_info.this,Ename.class);
                startActivity(name_intent);
                break;
            case R.id.log_out_bt:
                Intent log_out_intent = new Intent(student_info.this,sign_in.class);
                startActivity(log_out_intent);
                break;
            case R.id.back_bt:
                Intent google_services_intent = new Intent(student_info.this,sis.class);
                startActivity(google_services_intent);
                break;


        }

    }
}
