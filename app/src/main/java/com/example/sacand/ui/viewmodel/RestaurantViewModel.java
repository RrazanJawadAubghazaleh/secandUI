package com.example.sacand.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RestaurantViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RestaurantViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is restaurant fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}