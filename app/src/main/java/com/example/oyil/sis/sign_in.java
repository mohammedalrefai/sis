package com.example.oyil.sis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sign_in extends AppCompatActivity implements View.OnClickListener {

    private Button sign_in;
    private EditText id_edit;
    private EditText pass_edit;
    private static final String TAG = "sign_in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        set_up();
    }

    public void set_up(){

        sign_in = (Button) findViewById(R.id.sign_in);
        id_edit = (EditText) findViewById(R.id.id_edit);
        pass_edit = (EditText) findViewById(R.id.pass_edit);

        sign_in.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.sign_in:
                Intent intent = new Intent(sign_in.this,sis.class);
                startActivity(intent);
                Toast.makeText(sign_in.this,"sign in",Toast.LENGTH_SHORT).show();
                Log.i(TAG,"sign in button triggerd");
                break;

        }
    }
}