package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class themsinhvien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themsinhvien);
        Spinner spn_coso = findViewById(R.id.spn_themSv);
        EditText name = findViewById(R.id.edt_tenSv);
        EditText diachi = findViewById(R.id.edt_diaChiSv);
        Button btnsubmit = findViewById(R.id.btn_subMit);

        ArrayList<school> list = new ArrayList<>();
        list.add(new school(R.drawable.england, "da nang"));
        list.add(new school(R.drawable.france, "can tho"));
        list.add(new school(R.drawable.japan, "ho chi minh"));
        list.add(new school(R.drawable.korea, "tay nguyen"));
        list.add(new school(R.drawable.vietnam, "ha noi"));

        SchoolSpinnerAdapter sc = new SchoolSpinnerAdapter(this, list);
        spn_coso.setAdapter(sc);

    }
}