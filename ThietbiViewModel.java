package com.example.daikin_123.ui.thietbi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ThietbiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ThietbiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is THIET bi fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}