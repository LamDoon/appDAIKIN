package com.example.daikin_123.ui.taikhoan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TaikhoanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TaikhoanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}