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

public class Listview extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = (ListView)this.findViewById(R.id.listView);

        ArrayList<String> items = new ArrayList<>();
        items.add("스테이크 하우스");
        items.add("치즈 덮은 새우");
        items.add("룰루의 보라색 맛");
        items.add("피짜피자");

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
                    v = vi.inflate(R.layout.activity_listview2, null);
                }

                // ImageView 인스턴스
                ImageView imageView = (ImageView) v.findViewById(R.id.imageView);

                // 리스트뷰의 아이템에 이미지를 변경한다.
                if ("스테이크 하우스".equals(items.get(position)))
                    imageView.setImageResource(R.drawable.seoul);
                else if ("치즈 덮은 새우".equals(items.get(position)))
                    imageView.setImageResource(R.drawable.busan);
                else if ("룰루의 보라색 맛".equals(items.get(position)))
                    imageView.setImageResource(R.drawable.mupin);
                else if ("피짜피자".equals(items.get(position)))
                    imageView.setImageResource(R.drawable.jeju);


                TextView textView = (TextView) v.findViewById(R.id.textView);
                textView.setText(items.get(position));

                final String text = items.get(position);
                Button button = (Button) v.findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (text == "스테이크 하우스") {
                            Intent i = new Intent(Listview.this, SteakHouse.class);
                            startActivity(i);                        }
                        else if (text == "치즈 덮은 새우")
                        {
                            Intent i = new Intent(Listview.this,saewoo.class);
                            startActivity(i);                        }

                        else if (text == "룰루의 보라색 맛")
                        {
                            Intent i = new Intent(Listview.this,lulu.class);
                            startActivity(i);                        }
                        else if (text == "피짜피자")
                        {
                            Intent i = new Intent(Listview.this,pizza.class);
                            startActivity(i);                        }
                    }
                });

                return v;
            }
        }
    }
