package com.example.pngo.chapter61final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.text.DecimalFormat;

public class Driver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);


        Button sumButton = (Button) findViewById(R.id.sumButton);
        Button averageButton = (Button) findViewById(R.id.averageButton);
        Button productButton = (Button) findViewById(R.id.productButton);
        Button factorialButton = (Button) findViewById(R.id.factorialButton);


        final EditText xInput = (EditText) findViewById(R.id.xInput);
        final EditText yInput = (EditText) findViewById(R.id.yInput);
        final TextView display = (TextView) findViewById(R.id.display);
        final String[] sumOutput = {""};
        final String[] averageOutput = {""};
        final String[] productOutput = {""};
        final String[] factorialOutput = {""};
        final String[] sum = {" "};

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double[] x = {Double.parseDouble(xInput.getText().toString()), Double.parseDouble(yInput.getText().toString())};
                DecimalFormat format = new DecimalFormat("####.00");
                display.setText("Sum of x and y: " + format.format(Calculator.findSum(x)));

            }
        });

        averageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double[] x = {Double.parseDouble(xInput.getText().toString()), Double.parseDouble(yInput.getText().toString())};
                DecimalFormat format = new DecimalFormat("####.00");
                display.setText("Average of x and y: " + format.format(Calculator.findAverage(x)));


            }
        });

        productButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputX = xInput.getText().toString();
                double x = Double.parseDouble(inputX);
                String inputY = yInput.getText().toString();
                double y = Double.parseDouble(inputY);

                double product = x * y;

                productOutput[0] = String.valueOf(product);
                display.setText("Product of x and y: " + productOutput[0]);
            }
        });

        factorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double[] x = {Double.parseDouble(xInput.getText().toString()), Double.parseDouble(yInput.getText().toString())};
                DecimalFormat format = new DecimalFormat("####.00");
                display.setText(format.format(Calculator.findAverage(x)));
                String result = "";
                result = Calculator.findFactorial((int) x[0]) + "\t";
                double finalResult = Double.parseDouble(result) - 1;
                display.setText("Factorial of x: " + Double.toString(finalResult));

            }
        });



    }
}
