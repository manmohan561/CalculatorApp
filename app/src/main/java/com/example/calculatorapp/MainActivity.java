package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    EditText e1,e2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.num1);
        e2=findViewById(R.id.num2);
        res=findViewById(R.id.result);
        radioGroup=findViewById(R.id.radioGroup);
    }
    public void calculate(View view)
    {
        final boolean checked = ((RadioButton) view).isChecked();
        double num1 = Double.parseDouble(e1.getText().toString());
        double num2 = Double.parseDouble(e2.getText().toString());


        int selectedId = radioGroup.getCheckedRadioButtonId();

        double sum = 0;
        if(selectedId==-1)
            res.setText("Enter Numbers");
        else {
            switch (view.getId()) {
                case R.id.radioButton2:
                    if(checked)
                        sum = num1 + num2;
                    break;
                case R.id.radioButton3:
                    if(checked)
                        sum = num1 - num2;
                    break;
                case R.id.radioButton4:
                    if(checked)
                        sum = num1 * num2;
                    break;

                case R.id.radioButton5:
                    if(checked)
                        sum = num1 / num2;
                    break;
            }
        }
        res.setText(Double.toString(sum));
    }
    public void clear(View V)
    {
           e1.setText("Enter Number 1");
           e2.setText("Enter Number 2");
           res.setText("Result");

    }

}