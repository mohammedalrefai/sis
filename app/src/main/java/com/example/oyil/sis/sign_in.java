package com.example.oyil.sis;

/*import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;*/

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class sign_in extends AppCompatActivity implements View.OnClickListener{

    public static final int CONNECTION_TIMEOUT=10000;
    public static final int READ_TIMEOUT=15000;
    private Button sign_in;
    private EditText username;
    private EditText password;

    private static final String TAG = "sign_in";
//    String URL= "http://192.168.8.114/test_android/index.php";

//    JSONParser jsonParser=new JSONParser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        set_up();
//        requestQueue = Volley.newRequestQueue(this);

    }

    public void set_up(){

        sign_in = (Button) findViewById(R.id.sign_in);
        username = (EditText) findViewById(R.id.id_edit);
        password = (EditText) findViewById(R.id.pass_edit);

//        sign_in.setOnClickListener(this);

    }
  @Override
    public void onClick(View view){

//       AttemptLogin attemptLogin= new AttemptLogin();
//        attemptLogin.execute(username.getText().toString(),password.getText().toString(),"");
    }


//                Intent intent = new Intent(sign_in.this,sis.class);
//                startActivity(intent);
//                Toast.makeText(sign_in.this,"sign in",Toast.LENGTH_SHORT).show();
//                Log.i(TAG,"sign in button triggerd");





//        request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                try {
//                    JSONObject jsonObject = new JSONObject(response);
//                    if (jsonObject.names().get(0).equals("success")) {
//                        Toast.makeText(getApplicationContext(), "SUCCESS " + jsonObject.getString("success"), Toast.LENGTH_SHORT).show();
//                        startActivity(new Intent(getApplicationContext(), sis.class));
//                    } else {
//                        Toast.makeText(getApplicationContext(), "Error" + jsonObject.getString("error"), Toast.LENGTH_SHORT).show();
//                    }
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
//
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//            }
//        }) {
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                HashMap<String, String> hashMap = new HashMap<String, String>();
//                hashMap.put("email", id_edit.getText().toString());
//                hashMap.put("password", pass_edit.getText().toString());
//
//                return hashMap;
//            }
//        };

//        requestQueue.add(request);


//        String id = id_edit.getText().toString();
//        String pass = pass_edit.getText().toString();
//        String type="login";
//        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
//        backgroundWorker.execute(type,id,pass);

    public void checkLogin(View arg0) {

        // Get text from email and passord field
        final String email = username.getText().toString();
        final String pass = password.getText().toString();

        // Initialize  AsyncLogin() class with email and password
        new AsyncLogin().execute(email,pass);

    }
   private class AsyncLogin extends AsyncTask<String, String, String>
    {
        ProgressDialog pdLoading = new ProgressDialog(sign_in.this);
        HttpURLConnection conn;
        URL url = null;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //this method will be running on UI thread
            pdLoading.setMessage("\tLoading...");
            pdLoading.setCancelable(false);
            pdLoading.show();

        }
        @Override
        protected String doInBackground(String... params) {
            try {

                // Enter URL address where your php file resides
                url = new URL("http://192.168.8.114:3306/testandroid/login.php");

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "exception";
            }
            try {
                // Setup HttpURLConnection class to send and receive data from php and mysql
                conn = (HttpURLConnection)url.openConnection();
                conn.setReadTimeout(READ_TIMEOUT);
                conn.setConnectTimeout(CONNECTION_TIMEOUT);
                conn.setRequestMethod("POST");

                // setDoInput and setDoOutput method depict handling of both send and receive
                conn.setDoInput(true);
                conn.setDoOutput(true);

                // Append parameters to URL
                Uri.Builder builder = new Uri.Builder()
                        .appendQueryParameter("username", params[0])
                        .appendQueryParameter("password", params[1]);
                String query = builder.build().getEncodedQuery();

                // Open connection for sending data
                OutputStream os = conn.getOutputStream();
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));
                writer.write(query);
                writer.flush();
                writer.close();
                os.close();
                conn.connect();

            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
                return "exception";
            }

            try {

                int response_code = conn.getResponseCode();

                // Check if successful connection made
                if (response_code == HttpURLConnection.HTTP_OK) {

                    // Read data sent from server
                    InputStream input = conn.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                    StringBuilder result = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        result.append(line);
                    }

                    // Pass data to onPostExecute method
                    return(result.toString());

                }else{

                    return("unsuccessful");
                }

            } catch (IOException e) {
                e.printStackTrace();
                return "exception";
            } finally {
                conn.disconnect();
            }


        }

        @Override
        protected void onPostExecute(String result) {

            //this method will be running on UI thread

            pdLoading.dismiss();

            if(result.equalsIgnoreCase("true"))
            {
                /* Here launching another activity when login successful. If you persist login state
                use sharedPreferences of Android. and logout button to clear sharedPreferences.
                 */

                Intent intent = new Intent(sign_in.this,sis.class);
                startActivity(intent);
                sign_in.this.finish();

            }else if (result.equalsIgnoreCase("false")){

                // If username and password does not match display a error message
                Toast.makeText(sign_in.this, "Invalid email or password", Toast.LENGTH_LONG).show();

            } else if (result.equalsIgnoreCase("exception") || result.equalsIgnoreCase("unsuccessful")) {

                Toast.makeText(sign_in.this, "OOPs! Something went wrong. Connection Problem.", Toast.LENGTH_LONG).show();

            }
        }

    }
/*
private class AttemptLogin extends AsyncTask<String, String, JSONObject> {

    @Override

    protected void onPreExecute() {

        super.onPreExecute();

    }

    @Override

    protected JSONObject doInBackground(String... args) {



        String email = args[2];
        String password = args[1];
        String name= args[0];

        ArrayList params = new ArrayList();
        params.add(new BasicNameValuePair("username", name));
        params.add(new BasicNameValuePair("password", password));
        if(email.length()>0)
            params.add(new BasicNameValuePair("email",email));

        JSONObject json = jsonParser.makeHttpRequest(URL, "POST", params);


        return json;

    }

    protected void onPostExecute(JSONObject result) {

        // dismiss the dialog once product deleted
        //Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

        try {
            if (result != null) {

                Intent intent = new Intent(sign_in.this,sis.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),result.getString("message"),Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(getApplicationContext(), "Unable to retrieve any data from server", Toast.LENGTH_LONG).show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }


}*/
}