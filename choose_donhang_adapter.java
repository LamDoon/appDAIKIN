package com.example.daikin_123;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class choose_donhang_adapter extends FragmentStatePagerAdapter {
    int mNoOfTabke;

    public  choose_donhang_adapter(FragmentManager fm, int Num)
    {
        super(fm);
        this.mNoOfTabke=Num;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
          case 0:
               donhang_dvkythuat kythuat=new donhang_dvkythuat();
              return kythuat;
            case 1:
                donhang_phukien pk=new donhang_phukien();
                return pk;

//                return null;
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
