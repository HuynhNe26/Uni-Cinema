package com.example.unicinema.ui.theater;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TheaterViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public TheaterViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is theater fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}