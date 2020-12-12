package com.example.daikin_123.ui.taikhoan;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.daikin_123.R;
import com.example.daikin_123.dangnhap;
import com.example.daikin_123.profile;

public class TaikhoanFragment extends Fragment {
    Dialog dialog;
    private TaikhoanViewModel taikhoanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        taikhoanViewModel =
                new ViewModelProvider(this).get(TaikhoanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_taikhoan, container, false);
        ImageButton open_prf_408 = (ImageButton) root.findViewById(R.id.open_prf);
        open_prf_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), profile.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });

        dialog = new Dialog(getActivity());
        Button dx_408 = (Button) root.findViewById(R.id.dangxuat);
        dx_408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), dangnhap.class);
//                startActivity(intent);
                openDialog();
            }
        });

        return root;
    }
    public void openDialog(){
                dialog.setContentView(R.layout.dialog_dangxuat);
              //  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Button yes_408 = dialog.findViewById(R.id.dia_yes);
                Button no_408 = dialog.findViewById(R.id.dia_no);
                yes_408.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), dangnhap.class);
                        startActivity(intent);
                    }
                });
                no_408.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
    }
}

