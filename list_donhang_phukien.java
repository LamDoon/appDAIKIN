package com.example.daikin_123;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class list_donhang_phukien extends ArrayAdapter<String> {
    Context context;


    String rten_408[];
    String rsohieu_408[];
    String rgia_408[];
    String rsl_408[];
    int rimg_408[];


    public list_donhang_phukien(Context c, String[] ten, String[] sohieu, String[] gia, String[] sl, int[] img) {
        super(c, R.layout.row_dh_phukien, R.id.ten,ten);
        this.context = c;
        this.rten_408 = ten;
        this.rsohieu_408 = sohieu;
        this.rgia_408 = gia;
        this.rsl_408 = sl;
        this.rimg_408 = img;


    }

    public list_donhang_phukien(@NonNull Context context, int resource) {
        super(context, resource);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= (LayoutInflater) getContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row =layoutInflater.inflate(R.layout.row_dh_phukien,parent,false);
        TextView tendh_408=row.findViewById(R.id.ten);
        TextView sohieudh_408=row.findViewById(R.id.sohieu);
        TextView giadh_408=row.findViewById(R.id.gia);
        TextView sldh_408=row.findViewById(R.id.sl);
        ImageView imgsdh_408=row.findViewById(R.id.image);

        tendh_408.setText(rten_408[position]);
        sohieudh_408.setText(rsohieu_408[position]);
        giadh_408.setText(rgia_408[position]);
        sldh_408.setText(rsl_408[position]);
        imgsdh_408.setImageResource(rimg_408[position]);


        return row;
    }



}