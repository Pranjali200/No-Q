package com.example.noq;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class Custnewacc extends AppCompatActivity {
    private Button button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custnewacc);

        button10 = (Button) findViewById(R.id.button10);

        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openCustomer();

            }
        });}
    public void openCustomer() {
        Intent intent = new Intent(this, Customer.class);
        startActivity(intent);
    }

}