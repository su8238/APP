package com.yujin.foodtruck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button finish = (Button)findViewById(R.id.finished);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"회원가입이 완료되었습니다!",
                        Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Map.this, SajangMain.class);
                startActivity(i);
            }
        });
    }
}
