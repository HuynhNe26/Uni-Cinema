package com.example.unicinema.ui.discount;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DiscountViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public DiscountViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is discount fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}