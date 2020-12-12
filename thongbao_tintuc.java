package com.example.daikin_123;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link thongbao_tintuc#newInstance} factory method to
 * create an instance of this fragment.
 */
public class thongbao_tintuc extends Fragment {
    ListView listView_408;
    Spinner spinner;


    String tieude_408[]={"Nhanh tay nhận ưu đãi cuối tháng 11","Tháng 11 Book bảo trì có ngay quà hay",
    "Cùng DAIKIN Việt Nam hướng về miền Trung","Thời tiết nồm rồi bật ngay chế độ Dry khử ấm","News","News","Thời tiết nồm rồi bật ngay chế độ Dry khử ấm","News","News"};
    String time_408[]={"2 tuần trước","1 tháng trước","1 tháng trước","1 tháng trước","2 tháng trước","3 tháng trước","5 tháng trước","7 tháng trước","1 năm trước"};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public thongbao_tintuc() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment thongbao_tintuc.
     */
    // TODO: Rename and change types and number of parameters
    public static thongbao_tintuc newInstance(String param1, String param2) {
        thongbao_tintuc fragment = new thongbao_tintuc();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_thongbao_tintuc, container, false);
        listView_408=v.findViewById(R.id.list_tb_tintuc);
        list_thongbao_tintuc adapter = new list_thongbao_tintuc(getActivity(),tieude_408,time_408);
        listView_408.setAdapter(adapter);

        listView_408.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent in_detail_ttuc_408 = new Intent(getActivity(),detail_tb_tintuc.class);
                    startActivity(in_detail_ttuc_408);
                }
            }
        });

        return v;
    }
}