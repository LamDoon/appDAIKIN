package com.example.daikin_123;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class giohang extends AppCompatActivity {
    Button ttuc_408;
    ListView lis_408;
    String[] ten_408={"Máy lạnh ion mát lạnh","Đồng hồ áp suất"};
   String[] sohieu_408={"678789","009895"};
   String[] gia_408={"10.223.000","1.200.000"};
   String[] sl_408={"1","1"};
  int[] img_408={R.drawable.maylanh,R.drawable.dhoapsuat};
  ImageButton exit_408;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giohang);

        lis_408 = findViewById(R.id.list_phukien);
        CustomAdapter customAdapter = new CustomAdapter();
        lis_408.setAdapter(customAdapter);
//        MyAdapter adapter = new MyAdapter(this, ten_408);
//        lis_408.setAdapter(adapter);
        lis_408.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(giohang.this,"Máy lạnh",Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(giohang.this,"Đồng hồ",Toast.LENGTH_SHORT).show();
                }
            }
        });

        exit_408=(ImageButton) findViewById(R.id.exit_in_giohang);
        exit_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(giohang.this,phukien.class);
                startActivity(intent);
            }
        });

        ttuc_408 = (Button) findViewById(R.id.giohang_tt);
        ttuc_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_ttuc = new Intent(giohang.this,phukien.class);
                startActivity(in_ttuc);
            }
        });



    }
//    class MyAdapter extends ArrayAdapter<String>{
//         Context context;
//         String[] rTen;
//         String rSohieu[];
//         String rGia[];
//         int rSl[];
//         int rImg[];
//         MyAdapter (Context c, String ten[]){
//             super(c, R.layout.row_phukien_giohang,R.id.ten,ten);
//             this.context = c;
//             this.rTen = ten;
            // this.rSohieu = sohieu;
           //  this.rGia = gia;
           //  this.rSl = sl;
            // this.rImg = img;
    //     }

//        @NonNull
//        @Override
//        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View row = layoutInflater.inflate(R.layout.row_phukien_giohang,parent,false);
       //     ImageView myimages_408 = row.findViewById(R.id.imagesp);
     //       TextView myTen_408 = row.findViewById(R.id.tensp);
       //     TextView mySohieu_408 = row.findViewById(R.id.sohieusp);
       //     TextView myGia_408 = row.findViewById(R.id.giasp);
       //     TextView mySl_408 = row.findViewById(R.id.slsp);

          //  myimages_408.setImageResource(rImg[position]);
     //       myTen_408.setText(rTen[position]);
          //  mySohieu_408.setText(rSohieu[position]);
           // myGia_408.setText(rGia[position]);
          //  mySl_408.setText(rSl[position]);

           //  return super.getView(position, convertView, parent);
      //  }
    //}

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return ten_408.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.row_phukien_giohang,null);
            TextView ten = view1.findViewById(R.id.tensp);
            TextView sohieu = view1.findViewById(R.id.sohieusp);
            TextView gia = view1.findViewById(R.id.giasp);
            TextView sl = view1.findViewById(R.id.slsp);
            ImageView img = view1.findViewById(R.id.imagesp);

            ten.setText(ten_408[position]);
            sohieu.setText(sohieu_408[position]);
            gia.setText(gia_408[position]);
            sl.setText(sl_408[position]);
            img.setImageResource(img_408[position]);



            return view1;
        }
    }
}