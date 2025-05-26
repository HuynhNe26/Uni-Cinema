package com.example.unicinema.ui.gift;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GiftViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public GiftViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gift fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}