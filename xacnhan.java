package com.example.daikin_123;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.daikin_123.ui.taikhoan.TaikhoanFragment;
import com.example.daikin_123.ui.trangchu.TrangchuFragment;

public class xacnhan extends AppCompatActivity {
    Button xn;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xacnhan);
        xn = (Button) findViewById(R.id.xacnhan);
        xn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getSupportFragmentManager();
//                TrangchuFragment tc = new TrangchuFragment();
//                fm.beginTransaction().replace(R.id.nav_host_fragment,tc).commit();

                Intent intent =new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        back = (ImageButton) findViewById(R.id.back_in_xacnhan);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(xacnhan.this,dangnhap.class);
                startActivity(intent);
            }
        });
    }
}