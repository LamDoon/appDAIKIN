package com.example.daikin_123.ui.trangchu;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.daikin_123.R;
import com.example.daikin_123.phukien;
import com.example.daikin_123.profile;

public class TrangchuFragment extends Fragment {
    TextView txt_phukien_408;
    ImageView img_phukien_408;

    private TrangchuViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(TrangchuViewModel.class);
        View root = inflater.inflate(R.layout.fragment_trangchu, container, false);
        txt_phukien_408 =(TextView)root.findViewById(R.id.txt_phukien);
        txt_phukien_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), phukien.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });
        img_phukien_408 =root.findViewById(R.id.img_phukien);
        img_phukien_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), phukien.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });
        return root;
    }
}