package com.chemutai.basics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstInput, secondInput;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInput = findViewById(R.id.firstNumber);
        secondInput = findViewById(R.id.secondNumber);
        output = findViewById(R.id.txtResult);
    }

    public void crunch(View view) {
//        Toast.makeText(this, "Calculating", Toast.LENGTH_SHORT).show();

        //get numbers
        String a = firstInput.getText().toString().trim();
        String b = secondInput.getText().toString().trim();

        //convert a & b to numbers

        if (a.isEmpty() || b.isEmpty()){
            Toast.makeText(this, "Kindly enter all the values", Toast.LENGTH_SHORT).show();
            return;
        }
        double first = Double.parseDouble(a);
        double second = Double.parseDouble(b);

        //calculate
        double result = first + second;

        output.setText("Sum is "+result);
    }
}
