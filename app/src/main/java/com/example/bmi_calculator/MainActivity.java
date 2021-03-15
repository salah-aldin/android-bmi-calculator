package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText weightEditText;
    private EditText heigthEditText;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = findViewById(R.id.weightEditText);
        heigthEditText = findViewById(R.id.heightEditText);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void calculateButtonOnClick(View view) {
        float weight = Float.parseFloat(weightEditText.getText().toString());
        float height = Float.parseFloat(heigthEditText.getText().toString());

        float bmi = weight / (height * height);

        String res = Float.toString(bmi);
        
        if(bmi > 18.5 && bmi <= 24.9){
            resultTextView.setTextColor(this.getResources().getColor(R.color.success));
        }else{
            resultTextView.setTextColor(this.getResources().getColor(R.color.danger));
        }

        resultTextView.setText(res);
    }
}