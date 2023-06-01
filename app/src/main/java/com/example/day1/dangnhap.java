package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class dangnhap extends AppCompatActivity {


    String username;
    String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitydangnhap);

        EditText Username = findViewById(R.id.edt_username);
        EditText Password = findViewById(R.id.edt_password);
        Button btnDangNhap = findViewById(R.id.btnDangNhap);
        Button btnDangKy = findViewById(R.id.btnDangKy);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            username = bundle.getString(dangky.KEY_USERNAME);
            pass = bundle.getString(dangky.KEY_PASSWORD);
        }
        Username.setText(username);
        Password.setText(pass);

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dangnhap.this, dangky.class);
                startActivity(intent);
            }
        });

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dangnhap.this, ds_sinh_vien.class);
                startActivity(intent);
            }
        });
    }
}