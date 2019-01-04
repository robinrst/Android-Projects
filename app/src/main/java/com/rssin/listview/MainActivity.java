package com.rssin.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView=(ListView)findViewById(R.id.myListView);
        final ArrayList<String> myFamily=new ArrayList<String>();
        String s[]={"Papa","Mummy","Robin","Sisters","Friends"};
        for(String name:s){
            myFamily.add(name);
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myFamily);
        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Log.i("Person Tapped",myFamily.get(position)) ;
                Toast.makeText(MainActivity.this, myFamily.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
