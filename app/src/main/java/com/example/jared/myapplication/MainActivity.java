package com.example.jared.myapplication;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cloud_control.EndpointsAsyncTask;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button click  = (Button)findViewById(R.id.bt_click);
        final TextView etname = (TextView)findViewById(R.id.et_name);
        etname.setText("");
        //
       // final String name = "buda";

        click.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final String name = etname.getText().toString();
                        new EndpointsAsyncTask().execute(new Pair<Context, String>(getApplication(), name));
                        etname.setText("");
                    }
                }
        );



        
    }
}
