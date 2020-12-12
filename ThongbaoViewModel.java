package com.example.daikin_123.ui.thongbao;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ThongbaoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ThongbaoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}