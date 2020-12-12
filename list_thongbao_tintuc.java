package com.example.daikin_123;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class list_thongbao_tintuc extends ArrayAdapter<String> {
    Context context;


    String tieude_408[];
    String ngay_408[];



    public list_thongbao_tintuc(Context c, String[] tieude, String[] ngay) {
        super(c, R.layout.row_tb_tintuc, R.id.tieude,tieude);
        this.context = c;
        this.tieude_408 = tieude;
        this.ngay_408 = ngay;

    }

    public list_thongbao_tintuc(@NonNull Context context, int resource) {
        super(context, resource);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= (LayoutInflater) getContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row =layoutInflater.inflate(R.layout.row_tb_tintuc,parent,false);
        TextView tieudett_408=row.findViewById(R.id.tieude);
        TextView ngaytt_408=row.findViewById(R.id.ngay);

        tieudett_408.setText(tieude_408[position]);
        ngaytt_408.setText(ngay_408[position]);

        return row;
    }



}
