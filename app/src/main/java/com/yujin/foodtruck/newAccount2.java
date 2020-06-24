package com.yujin.foodtruck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class newAccount2 extends AppCompatActivity {


    private Spinner spinner;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    private Spinner spinner2;
    ArrayList<String> arrayList2;
    ArrayAdapter<String> arrayAdapter2;
    private Spinner spinner3;
    ArrayList<String> arrayList3;
    ArrayAdapter<String> arrayAdapter3;
    private Spinner spinner4;
    ArrayList<String> arrayList4;
    ArrayAdapter<String> arrayAdapter4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account2);
        Button btnnext2 = (Button) findViewById(R.id.newacNEXT2);
        arrayList = new ArrayList<>();
        arrayList.add("0시");
        arrayList.add("1시");
        arrayList.add("2시");
        arrayList.add("3시");
        arrayList.add("4시");
        arrayList.add("5시");
        arrayList.add("6시");
        arrayList.add("7시");
        arrayList.add("8시");
        arrayList.add("9시");
        arrayList.add("10시");
        arrayList.add("11시");
        arrayList.add("12시");
        arrayList.add("13시");
        arrayList.add("14시");
        arrayList.add("15시");
        arrayList.add("16시");
        arrayList.add("17시");
        arrayList.add("18시");
        arrayList.add("19시");
        arrayList.add("20시");
        arrayList.add("21시");
        arrayList.add("22시");
        arrayList.add("23시");


        arrayList2 = new ArrayList<>();
        arrayList2.add("0분");
        arrayList2.add("10분");
        arrayList2.add("20분");
        arrayList2.add("30분");
        arrayList2.add("40분");
        arrayList2.add("50분");


        arrayList3 = new ArrayList<>();
        arrayList3.add("0시");
        arrayList3.add("1시");
        arrayList3.add("2시");
        arrayList3.add("3시");
        arrayList3.add("4시");
        arrayList3.add("5시");
        arrayList3.add("6시");
        arrayList3.add("7시");
        arrayList3.add("8시");
        arrayList3.add("9시");
        arrayList3.add("10시");
        arrayList3.add("11시");
        arrayList3.add("12시");
        arrayList3.add("13시");
        arrayList3.add("14시");
        arrayList3.add("15시");
        arrayList3.add("16시");
        arrayList3.add("17시");
        arrayList3.add("18시");
        arrayList3.add("19시");
        arrayList3.add("20시");
        arrayList3.add("21시");
        arrayList3.add("22시");
        arrayList3.add("23시");


        arrayList4 = new ArrayList<>();
        arrayList4.add("0분");
        arrayList4.add("10분");
        arrayList4.add("20분");
        arrayList4.add("30분");
        arrayList4.add("40분");
        arrayList4.add("50분");


        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                arrayList);

        spinner = (Spinner)findViewById(R.id.spinner2);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),arrayList.get(i)+"가 선택되었습니다.",
//                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        arrayAdapter2 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                arrayList2);

        spinner2 = (Spinner)findViewById(R.id.spinner3);
        spinner2.setAdapter(arrayAdapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),arrayList.get(i)+"가 선택되었습니다.",
//                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });




        arrayAdapter3 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                arrayList3);

        spinner3 = (Spinner)findViewById(R.id.spinner4);
        spinner3.setAdapter(arrayAdapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),arrayList.get(i)+"가 선택되었습니다.",
//                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });




        arrayAdapter4 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                arrayList4);

        spinner4 = (Spinner)findViewById(R.id.spinner5);
        spinner4.setAdapter(arrayAdapter4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),arrayList.get(i)+"가 선택되었습니다.",
//                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(newAccount2.this, Map.class);
                startActivity(i);
            }
        });


    }
}

