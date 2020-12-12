package com.example.daikin_123;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.daikin_123.ui.taikhoan.TaikhoanFragment;

public class profile extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
        ImageView exit_408;
        ImageButton dinhvi_408;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Spinner spinner = findViewById(R.id.muc_tinh);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.chon_tinh, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        exit_408=(ImageView)findViewById(R.id.exit_in_prf);
        exit_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getSupportFragmentManager();
//                TaikhoanFragment tk = new TaikhoanFragment();
//                fm.beginTransaction().replace(R.id.nav_host_fragment,tk).commit();
                Intent intent =new Intent(v.getContext(),TaikhoanFragment.class);
                startActivity(intent);
            }
        });
        dinhvi_408 = (ImageButton)findViewById(R.id.dinhvi);
        dinhvi_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(profile.this,map.class);
                startActivity(intent);
            }
        });
   }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}