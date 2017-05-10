package com.acme.csci3130;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//This code is based on the sample code in the Android Studio tutorial
//on Android's developer site for creating activities and has been modified
//to meet the needs of the assignment.

public class MainActivity extends Activity {
    public static final String MESSAGE = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE);
        TextView textView = (TextView) findViewById(R.id.helloText);
        textView.setText(message);
    }

    //This code is based on the sample code in the Android Studio tutorial
    //on Android's developer site for creating activities and has been modified
    //to meet the needs of the assignment.
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        intent.putExtra(MESSAGE, message);
        startActivity(intent);
    }
}
