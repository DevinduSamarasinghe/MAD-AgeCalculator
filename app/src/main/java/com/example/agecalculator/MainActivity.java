package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);

    }

    public String calcAge(EditText date)throws NumberFormatException{

        String data = date.getText().toString();
        int data1 = Integer.parseInt(data);
        int value = 2022 - data1;

        String age = "Your age is " + value;
        return age;
    }
    public void displayMessage(View view){
        String message;
        EditText date = findViewById(R.id.birthdate);
        message = calcAge(date);
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}