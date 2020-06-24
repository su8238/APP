package com.yujin.foodtruck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class review2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review2);

        Button write2 = (Button)findViewById(R.id.button13);
        write2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"다음 업데이트를 기대해주세여!",
                        Toast.LENGTH_SHORT).show();
                Intent i = new Intent(review2.this, reveiw.class);
                startActivity(i);
            }
        });
    }
}
