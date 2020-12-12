package com.example.daikin_123.ui.thietbi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.daikin_123.R;
import com.example.daikin_123.choose_donhang_adapter;
import com.google.android.material.tabs.TabLayout;

public class ThietbiFragment extends Fragment {

    private ThietbiViewModel thietbiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        thietbiViewModel =
                new ViewModelProvider(this).get(ThietbiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_thietbi, container, false);


        return root;
    }
}