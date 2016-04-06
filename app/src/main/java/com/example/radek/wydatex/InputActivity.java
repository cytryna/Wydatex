package com.example.radek.wydatex;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class InputActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        Button ok = (Button) findViewById(R.id.ok);

        ok.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                TextView nameTextView = (TextView) findViewById(R.id.name);
                RadioButton genderMale = (RadioButton) findViewById(R.id.male);
                RadioButton genderFemale = (RadioButton) findViewById(R.id.female);

                String name = nameTextView.getText().toString();
                String gender = "";

                if(genderMale.isChecked())
                    gender = "Facet! ";

                if(genderFemale.isChecked())
                    gender = "Kobieta! ";


                Toast.makeText(getApplicationContext(), "O " + gender + name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
