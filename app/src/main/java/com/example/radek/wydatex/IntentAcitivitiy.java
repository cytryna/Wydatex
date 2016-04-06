package com.example.radek.wydatex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by rwichrowski on 06.04.16.
 */
public class IntentAcitivitiy extends Activity {

    private EditText titleField;
    private EditText messageField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_homework);

        titleField = (EditText) findViewById(R.id.title);
        messageField = (EditText) findViewById(R.id.message);
    }

    public void sendButton(View view) {
        Intent intent = new Intent(android.content.Intent.ACTION_SEND);
        intent.setType("text/plain");

        String title = titleField.getText().toString();
        String message = messageField.getText().toString();

        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, title);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, message);
        startActivity(intent);
    }
}
