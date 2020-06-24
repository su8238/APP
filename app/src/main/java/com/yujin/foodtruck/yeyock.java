package com.yujin.foodtruck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class yeyock extends AppCompatActivity {
    int count= 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeyock);

        Button plus = (Button)findViewById(R.id.plus);
        final TextView number = (TextView)findViewById(R.id.number);
        Button minus = (Button)findViewById(R.id.minus);
        Button damgi = (Button)findViewById(R.id.newAC2);


                plus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        count++;
                        number.setText("" + count);
                    }
                });

                    minus.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            count--;
                            number.setText("" + count);
                        }
                    });
                    damgi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(yeyock.this, yeyock2.class);
                startActivity(i);

            }
        });
    }
}
