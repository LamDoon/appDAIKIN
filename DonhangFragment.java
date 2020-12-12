package com.example.daikin_123.ui.donhang;

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
import com.example.daikin_123.choose_thongbao_adapter;
import com.google.android.material.tabs.TabLayout;

public class DonhangFragment extends Fragment {

    private DonhangViewModel donhangViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        donhangViewModel =
                new ViewModelProvider(this).get(DonhangViewModel.class);
        View root = inflater.inflate(R.layout.fragment_donhang, container, false);
//==========================choose adapter=========================================*/
        TabLayout tabLayout=(TabLayout) root.findViewById(R.id.choose_list_donhang);
        tabLayout.addTab(tabLayout.newTab().setText("Dịch vụ kỹ thuật"));
        tabLayout.addTab(tabLayout.newTab().setText("Phụ kiện"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);





        final ViewPager viewPager=(ViewPager) root.findViewById(R.id.content_list_donhang);
        final choose_donhang_adapter adater =new choose_donhang_adapter(getFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adater);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return root;
    }
}