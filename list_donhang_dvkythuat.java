package com.example.daikin_123;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class list_donhang_dvkythuat extends ArrayAdapter<String> {
    Context context;

    int imgs_408[];
    String ten_408[];
    String sohieu_408[];
    String gia_408[];
    String sl_408[];



    public list_donhang_dvkythuat(Context c, String[] ten,String[] sohieu, String[] gia, String[] sl, int[] imgs) {
        super(c, R.layout.row_dh_phukien, R.id.ten,ten);
        this.context = c;
       this.ten_408 = ten;
        this.sohieu_408 = sohieu;
        this.gia_408 = gia;
       this.sl_408 = sl;
      this.imgs_408=imgs;
    }

    public list_donhang_dvkythuat(@NonNull Context context, int resource) {
        super(context, resource);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= (LayoutInflater) getContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row =layoutInflater.inflate(R.layout.row_dh_phukien,parent,false);
        TextView tendo=row.findViewById(R.id.ten);
        TextView sohieudo=row.findViewById(R.id.sohieu);
        TextView giado=row.findViewById(R.id.gia);
      TextView sldo=row.findViewById(R.id.sl);
       ImageView imgrr=row.findViewById(R.id.image);

        //add nó vô
        tendo.setText(ten_408[position]);
        sohieudo.setText(sohieu_408[position]);
        giado.setText(gia_408[position]);
       sldo.setText(sl_408[position]);
       imgrr.setImageResource(imgs_408[position]);
        return row;
    }



}
