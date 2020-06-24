package com.yujin.foodtruck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SobijaMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobija_main);

        Button btnplace = (Button)findViewById(R.id.select1);

        btnplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SobijaMain.this, Listview.class);
                startActivity(i);
            }
        });
        Button star = (Button)findViewById(R.id.select2);

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SobijaMain.this, foodstar.class);
                startActivity(i);
            }
        });
        Button ji = (Button)findViewById(R.id.select3);

        ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SobijaMain.this, jiyeok.class);
                startActivity(i);
            }
        });
        Button sh = (Button)findViewById(R.id.select4);

        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SobijaMain.this, search.class);
                startActivity(i);
            }
        });
    }
}
