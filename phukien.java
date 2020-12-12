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
import com.example.daikin_123.ui.trangchu.TrangchuFragment;

public class phukien extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
        ImageButton exit_408;
        ImageButton giohang_408;
        ImageView sp_rm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phukien);
/*========================= spinner ======================= */
        Spinner spinner = findViewById(R.id.muc_sapxep);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.sapxep_phukien, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        exit_408=(ImageButton) findViewById(R.id.exit_in_phukien);
        exit_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getSupportFragmentManager();
//                TrangchuFragment tc = new TrangchuFragment();
//                fm.beginTransaction().replace(R.id.nav_host_fragment,tc).commit();
                Intent intent =new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });


        giohang_408=(ImageButton) findViewById(R.id.gio_hang);
        giohang_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phukien.this,giohang.class);
                startActivity(intent);
            }
        });

        sp_rm = (ImageView) findViewById(R.id.sp_remote);
        sp_rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(phukien.this,detail_sanpham.class);
                startActivity(intent1);
            }
        });



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    /*=========================== end spinner ========================= */
}