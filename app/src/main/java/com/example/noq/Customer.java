package com.example.noq;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Customer extends AppCompatActivity {
     private Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        button8 = (Button) findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openCustnewacc();

            }
        });}
        public void openCustnewacc() {
            Intent intent = new Intent(this, Custnewacc.class);
            startActivity(intent);
        }

    }


