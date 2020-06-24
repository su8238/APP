package com.yujin.foodtruck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SajangMain extends AppCompatActivity {

    EditText newID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sajang_main);



        Button newAcc = (Button) findViewById(R.id.newAC);
        Button mi = (Button) findViewById(R.id.button2);
        newID = (EditText)findViewById(R.id.LoginID);
        newAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "다음 업데이트를 기대하세요!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SajangMain.this, newAccount.class);
                startActivity(intent);

            }
        });

        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SajangMain.this, MainActivity.class);
                startActivity(intent);

            }
        });

        Button Login = (Button) findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String IDvalue = newID.getText().toString();
                Toast.makeText(getApplicationContext(),IDvalue +"로 로그인되었습니다.",
                       Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SajangMain.this, SajangLogin.class);
                startActivity(intent);

            }
        });
    }
}
