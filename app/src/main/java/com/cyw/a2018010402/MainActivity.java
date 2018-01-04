package com.cyw.a2018010402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.graphics.Canvas.EdgeType.AA;

public class MainActivity extends AppCompatActivity {

    String[] str;
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=(ListView)findViewById(R.id.listVeiw);
        str=new String[]{"AA","BB","CC"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                str
        );
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,str[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
