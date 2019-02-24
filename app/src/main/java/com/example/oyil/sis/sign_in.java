package com.example.oyil.sis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class sign_in extends AppCompatActivity implements View.OnClickListener{


    private EditText id_edit;
    private EditText pass_edit;
    private Button sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        set_up();



    }

    public void set_up(){
        id_edit= (EditText) findViewById(R.id.id_edit);
        pass_edit = (EditText) findViewById(R.id.pass_edit);
        sign_in = (Button) findViewById(R.id.sign_in);

//        id_edit.setOnClickListener(this);
//        pass_edit.setOnClickListener(this);
        sign_in.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.sign_in:
                //on login button click implemetation
                String st_id = id_edit.getText().toString();
                String password = pass_edit.getText().toString();
                String type = "login"; //type of operation on id and username

                BackgroundWorker backgroundworker= new BackgroundWorker(this);
                backgroundworker.execute(type,st_id,password);
                break;

        }

    }
}
