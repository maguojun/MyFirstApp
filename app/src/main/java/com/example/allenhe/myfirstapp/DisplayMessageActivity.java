package com.example.allenhe.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        /*TextView editText = (TextView)findViewById(R.id.display_message);
            editText.setText(message);*/

        TextView textView = new TextView(this);
            textView.setText(message);

        setContentView(textView);
        System.out.println("DisplayMessageActivity Invoke onCreate() method");

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
    }

    @Override
    protected void onStart(){
        super.onStart();
        System.out.println("DisplayMessageActivity Invoke onStart() method");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        System.out.println("DisplayMessageActivity Invoke onRestart() method");
    }

    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("DisplayMessageActivity Invoke onResume() method");
    }

    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("DisplayMessageActivity Invoke onPause() method");
    }

    @Override
    protected void onStop(){
        super.onStop();
        System.out.println("DisplayMessageActivity Invoke onStop() method");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("DisplayMessageActivity Invoke onDestroy() method");
    }

}
