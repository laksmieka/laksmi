package com.example.Laksmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.Laksmi.helper.helper;

public class MainActivity2 extends AppCompatActivity {

    TextView tvUsername;
    ImageView txtgambar1;
    ImageView txtgambar2;
    ImageView txtgambar3;
    ImageView txtgambar4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvUsername = findViewById(R.id. tvUsername);
        txtgambar1 = findViewById(R.id. txtgambar1);
        txtgambar2 = findViewById(R.id. txtgambar2);
        txtgambar3 = findViewById(R.id. txtgambar3);
        txtgambar4 = findViewById(R.id. txtgambar4);
        tvUsername.setText(helper.getUsername());

        txtgambar1.setOnClickListener(view -> {
            startActivity(new Intent(this, MainActivity3.class));
        });


    }
}