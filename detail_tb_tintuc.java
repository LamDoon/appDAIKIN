package com.example.daikin_123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daikin_123.ui.taikhoan.TaikhoanFragment;

public class detail_tb_tintuc extends AppCompatActivity {
ImageButton exitdetail_tintuc_408;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tb_tintuc);
        exitdetail_tintuc_408= (ImageButton) findViewById(R.id.exit_in_detail_sp);
//        exitdetail_tintuc_408.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent();
//                startActivity(intent);
//            }
//        });
    }
}