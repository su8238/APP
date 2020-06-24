package com.yujin.foodtruck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class newAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);

        Button next = (Button) findViewById(R.id.newacNEXT);
        final EditText pw1 = (EditText) findViewById(R.id.newacPW);
        final EditText pw2 = (EditText) findViewById(R.id.newacPW2);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = pw1.getText().toString();
                String text2 = pw2.getText().toString();

                if(text1.equals(text2)) {
                    Intent intent = new Intent(newAccount.this, newAccount2.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(getApplicationContext(), "비밀번호를 확인해주세요!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
