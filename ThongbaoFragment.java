package com.example.daikin_123.ui.thongbao;

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

public class ThongbaoFragment extends Fragment {

    private ThongbaoViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(ThongbaoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_thongbao, container, false);
        TabLayout tabLayout=(TabLayout) root.findViewById(R.id.choose_list_thongbao);
        tabLayout.addTab(tabLayout.newTab().setText("Công việc"));
        tabLayout.addTab(tabLayout.newTab().setText("Tin tức"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);





        final ViewPager viewPager=(ViewPager) root.findViewById(R.id.content_list_thongbao);
        final choose_thongbao_adapter adater =new choose_thongbao_adapter(getFragmentManager(),tabLayout.getTabCount());
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