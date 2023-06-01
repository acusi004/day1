package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class dangky extends AppCompatActivity {

    public static  String KEY_USERNAME = "username";
    public static  String KEY_PASSWORD = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
        EditText userName = findViewById(R.id.edt_username);
        EditText passWord = findViewById(R.id.edt_password);
        EditText cfpassword = findViewById(R.id.edt_Cfpassword);
        Button btnDangky = findViewById(R.id.btnDangKy);

        btnDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userName.getText().toString();
                String password = passWord.getText().toString();
                String cfpass = cfpassword.getText().toString();

                if(username.trim().isEmpty()){
                    Toast.makeText(getApplicationContext(), "khong duoc de trong ten", Toast.LENGTH_SHORT).show();
                }else if (password.trim().isEmpty()){
                    Toast.makeText(getApplicationContext(), "khong duoc de trong mat khau", Toast.LENGTH_SHORT).show();
                } else if (cfpass.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "can nhap lai mat khau", Toast.LENGTH_SHORT).show();
                } else if (!cfpass.equals(password)) {
                    Toast.makeText(getApplicationContext(), "mat khau nhap lai sai", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(dangky.this, dangnhap.class);
                    Bundle bundle = new Bundle();
                    bundle.putString(KEY_USERNAME, username);
                    bundle.putString(KEY_PASSWORD, password);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }
}