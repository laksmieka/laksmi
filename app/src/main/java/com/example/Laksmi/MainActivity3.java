package com.example.Laksmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ListView lvbarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lvbarang = findViewById(R.id.lvbarang);
        databarang();

    }

    public void databarang (){
        ArrayList<String> dataB = new ArrayList<>();
        dataB.add("Monitor");
        dataB.add("Mouse");
        dataB.add("processor");
        dataB.add("printer");

        ArrayAdapter<String> adp = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, dataB);
        lvbarang.setAdapter(adp);
    }
}