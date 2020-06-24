package com.yujin.foodtruck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class reveiw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reveiw);

        Button write = (Button)findViewById(R.id.write);
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(reveiw.this, review2.class);
                startActivity(i);
            }
        });
        Button Home = (Button)findViewById(R.id.home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(reveiw.this, SobijaMain.class);
                startActivity(i);
            }
        });
    }
}
