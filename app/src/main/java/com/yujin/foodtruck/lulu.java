package com.yujin.foodtruck;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class lulu extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lulu);
        listView = (ListView)this.findViewById(R.id.listView);

        ArrayList<String> items = new ArrayList<>();
        items.add("케이틀린 머핀");
        items.add("자크 녹차 푸딩");


        CustomAdapter adapter = new CustomAdapter(this, 0, items);
        listView.setAdapter(adapter);
    }

    private class CustomAdapter extends ArrayAdapter<String> {
        private ArrayList<String> items;

        public CustomAdapter(Context context, int textViewResourceId, ArrayList<String> objects) {
            super(context, textViewResourceId, objects);
            this.items = objects;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null) {
                LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = vi.inflate(R.layout.activity_steak_list, null);
            }

            // ImageView 인스턴스
            ImageView imageView = (ImageView)v.findViewById(R.id.imageView);

            // 리스트뷰의 아이템에 이미지를 변경한다.
            if("케이틀린 머핀".equals(items.get(position)))
                imageView.setImageResource(R.drawable.mupin);
            else if("자크 녹차 푸딩".equals(items.get(position)))
                imageView.setImageResource(R.drawable.puding);



            TextView textView = (TextView)v.findViewById(R.id.textView);
            textView.setText(items.get(position));

            final String text = items.get(position);
            Button button = (Button)v.findViewById(R.id.button);
//            button.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(lulu.this, text, Toast.LENGTH_SHORT).show();
//                }
//            });
            Button review = (Button)findViewById(R.id.review);
            review.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(lulu.this, reveiw.class);
                    startActivity(i);
                }
            });

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (text == "케이틀린 머핀") {
                        Intent i = new Intent(lulu.this, yeyock.class);
                        startActivity(i);                        }
                }
            });

            return v;
        }
    }
}

