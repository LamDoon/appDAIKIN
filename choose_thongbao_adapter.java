package com.example.daikin_123;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class choose_thongbao_adapter extends FragmentStatePagerAdapter {
    int mNoOfTabke;

    public  choose_thongbao_adapter(FragmentManager fm, int Num)
    {
        super(fm);
        this.mNoOfTabke=Num;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                thongbao_cviec cv=new thongbao_cviec();

                return cv;
            case 1:
                thongbao_tintuc tt=new thongbao_tintuc();

                return tt;
//            case 2:
//                DonNhap donNhap=new DonNhap();
//
//                return donNhap;
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabke;
    }
}
