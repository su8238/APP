package com.yujin.foodtruck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SajangLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sajang_login);

        Button AddMenu = (Button)findViewById(R.id.MenuAddBTN);

        AddMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SajangLogin.this, MenuAdd.class);
                startActivity(i);
            }
        });
    }
}
