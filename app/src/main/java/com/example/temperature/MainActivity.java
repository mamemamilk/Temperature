package com.example.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.temperature.model.Body;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button cfButton = findViewById(R.id.cf_button);
        Button fcButton = findViewById(R.id.fc_button);
        cfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TemEditText = findViewById(R.id.Tem_editText);
                TextView TemTextView = findViewById(R.id.Tem_textView);
                double tem = Integer.parseInt(TemEditText.getText().toString());
                Body b = new Body(tem);
                double result = b.getResult_ctof();
                String p = "0.00";
                DecimalFormat df = new DecimalFormat(p);
                String resultText = String.valueOf(df.format(result));
                TemTextView.setText(resultText);
            }
        });

        fcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TemEditText = findViewById(R.id.Tem_editText);
                TextView TemTextView = findViewById(R.id.Tem_textView);
                double tem = Integer.parseInt(TemEditText.getText().toString());
                Body b = new Body(tem);
                double result = b.getResult_ftoc();
                String p = "0.00";
                DecimalFormat df = new DecimalFormat(p);
                String resultText = String.valueOf(df.format(result));
                TemTextView.setText(resultText);
            }
        });
    }
}
