package com.example.scorp_gym_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scorp_gym_app.bmi.BmiCalculator;


//this is the last time I try
//this is the last time I try2.0

public class MainActivity extends AppCompatActivity {
    private String email;

    Button BmiCalc;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        BmiCalc = findViewById(R.id.button2);
        BmiCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){bmiCalculator();};
        });

    }



    public void bmiCalculator() {

        Intent intent = new Intent(this, BmiCalculator.class);

        startActivity(intent);
    }
    //What's uuuup!!!!!!
    //What's uuuup!!!!!!2.0

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    Intent intent = new Intent();

    public boolean testIntent() {
        if(intent == null){
            System.out.println("The result is false");
            return false;
        }
        System.out.println("The result is true");
        return true;
    }




    //141414
}

