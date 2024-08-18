package com.nmc;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
public class ApiTestActivity extends AppCompatActivity {

    Button btnFetch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api_test);
        btnFetch = findViewById(R.id.fetch);
        btnFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volleyRequest();
            }
        });
    }
    public void volleyRequest(){
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        //url for localhost
        String url ="https://jsonplaceholder.typicode.com/posts";
        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //displaying response string in logcat
                        Log.d("result",response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //displaying error response message
                Log.d("exception",error.toString());
            }
        });
        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}