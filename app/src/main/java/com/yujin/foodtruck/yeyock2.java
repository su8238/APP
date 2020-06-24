package com.yujin.foodtruck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class yeyock2 extends AppCompatActivity {
    int count =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeyock2);


        Button plus2 = (Button)findViewById(R.id.plus2);
        final TextView number2 = (TextView)findViewById(R.id.number2);
        final TextView money = (TextView)findViewById(R.id.money);
        Button minus2 = (Button)findViewById(R.id.minus2);
        Button damgi2 = (Button)findViewById(R.id.newAC3);


        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                money.setText(""+ count*4000);
                number2.setText("" + count);

            }
        });

        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                money.setText(""+ count*4000);
                number2.setText("" + count);
            }
        });


        damgi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),count+"개 예약되었습니다!",
                        Toast.LENGTH_SHORT).show();
                Intent i = new Intent(yeyock2.this, lulu.class);
                startActivity(i);
            }
        });

    }
}
