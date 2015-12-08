package com.example.aib.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends ActionBarActivity {

    private EditText usernameView;
    private EditText passwordView;
    private EditText phoneNumberView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle intentExtras = getIntent().getExtras();
        String username = intentExtras.getString("username");
        TextView helloView = (TextView)findViewById(R.id.hello);
        helloView.setText("Witaj" + username + "!");

        phoneNumberView = (EditText) findViewById(R.id.phoneNumber);
    }

    public void openClicked(View view) {

        
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://onet.pl"));
        startActivity(intent);

    }

}

