package com.example.Laksmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.Laksmi.helper.helper;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername, txtpassword;
    Button btnLogin;
    TextView tvdaftar;
    String username = "laksmi";
    String password = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.txtUsername);
        txtpassword = findViewById(R.id.txtpassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvdaftar = findViewById(R.id.tvdaftar);

        btnLogin.setOnClickListener(view -> {
            String user= txtUsername.getText().toString();
            String pass= txtpassword.getText().toString();

            if((user.equals(username)) && (pass.equals(password))){
                Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
                helper.setUsername(user);
                startActivity(new Intent(this, MainActivity2.class));
            } else{
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

