package com.example.practical141;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String[] lt={"Android","Java","Php","Hadoop","Sap","Python","Ajax","C++","Ruby","Rails","Js","C"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,lt);
        lv = findViewById(R.id.list);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent,View view,int position,long id){
               String str="";
               str=adapter.getItem(position);
               Toast.makeText(MainActivity.this, str ,Toast.LENGTH_SHORT).show();
           }
        });
    }
}