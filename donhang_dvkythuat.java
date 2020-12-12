package com.example.daikin_123;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link donhang_dvkythuat#newInstance} factory method to
 * create an instance of this fragment.
 */
public class donhang_dvkythuat extends Fragment {

//    ListView listView_408;
//    Spinner spinner;
//
//
//    String[] ten_408={"Máy lạnh ion hiệu suất cao","Đồng hồ áp suất gas"};
//    String[] sohieu_408={"678765","789909"};
//        String[] gia_408={"3.200.000","1.678.000"};
//        String[] sl_408={"1","1"};
//        int[] img_408={R.drawable.maylanh,R.drawable.dhoapsuat};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public donhang_dvkythuat() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment donhang_dvkythuat.
     */
    // TODO: Rename and change types and number of parameters
    public static donhang_dvkythuat newInstance(String param1, String param2) {
        donhang_dvkythuat fragment = new donhang_dvkythuat();
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
       View v= inflater.inflate(R.layout.fragment_donhang_dvkythuat, container, false);
//        listView_408 = v.findViewById(R.id.list_dh_dvkt);
//       list_donhang_dvkythuat adapter = new list_donhang_dvkythuat(getActivity(),ten_408,sohieu_408,gia_408,sl_408,img_408);
//        listView_408.setAdapter(adapter);

        return v;
    }

}