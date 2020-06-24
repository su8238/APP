package com.yujin.foodtruck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        final TextView tx = (TextView) findViewById(R.id.dak);
        final TextView tx2 = (TextView) findViewById(R.id.dak2);
        Button dl = (Button) findViewById(R.id.button21);
        dl.setOnClickListener(new Button.OnClickListener(){
           public  void  onClick(View v){
               tx.setText("");
               tx2.setText("");
           }
        });
    }
}
