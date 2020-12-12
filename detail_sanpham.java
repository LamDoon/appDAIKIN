package com.example.daikin_123;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class detail_sanpham extends AppCompatActivity {
    ImageButton exit_408;
    Dialog dialog_408;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sanpham);

        dialog_408 = new Dialog(this);
        Button chonmua_408 = (Button)findViewById(R.id.chonmua);
        chonmua_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog_408.setContentView(R.layout.dialog_chonmua);
                Button tt_408 = dialog_408.findViewById(R.id.dia_ttmua);
                tt_408.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog_408.dismiss();
                    }
                });
                dialog_408.show();
            }
        });


        exit_408= (ImageButton) findViewById(R.id.exit_in_detail_sp);
        exit_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detail_sanpham.this,phukien.class);
                startActivity(intent);
            }
        });
    }
}