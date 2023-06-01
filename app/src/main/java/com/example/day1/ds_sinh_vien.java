package com.example.day1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ds_sinh_vien extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds_sinh_vien);
        ListView lv = findViewById(R.id.lv_dsSinhVien);
        Button themSV  = findViewById(R.id.btnThemSinhVien);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayList<sinhvien> list = new ArrayList<>();

        list.add(new sinhvien("Fpoly ha noi", "hieu", "ha noi"));
        list.add(new sinhvien("Fpoly tay nguyem", "hieu", "ta nguyen"));
        list.add(new sinhvien("Fpoly ho chi minh", "hieu", "ho chi minh"));
        list.add(new sinhvien("Fpoly da nang", "hieu", "da nang"));
        list.add(new sinhvien("Fpoly can tho", "hieu", "can tho"));

        sinhvienListViewAdapter svAdapter = new sinhvienListViewAdapter(this, list);
        lv.setAdapter(svAdapter);

        themSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ds_sinh_vien.this, themsinhvien.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menutoolbar, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.about_hieu){
            Toast.makeText(this, "lichhoc", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.bangdiem){
            Toast.makeText(this, "bang diem", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.diemdanh){
            Toast.makeText(this, "bang diem", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.diemdanh){
            Toast.makeText(this, "diem danh", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.dangxuat) {
             startActivity(new Intent(ds_sinh_vien.this, dangnhap.class));
        }


        return true;
    }
}