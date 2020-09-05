package com.example.sacand.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.sacand.R;
import com.example.sacand.data.Meal;

import java.util.ArrayList;

public class SearchViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SearchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is search fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public ArrayList<Meal> prepareArray() {
        ArrayList<Meal> m = new ArrayList<>();

        Meal p1 = new Meal();
        p1.setMealName("Burger");
        p1.setMealPriceOne("\uF005  4.9");
        p1.setMealPriceTew("(25)");
        p1.setMealPriceThree("\uF017  35 - 40 MIN");
        p1.setMelImage(R.drawable.cuisine_delicious_dinner);
        m.add(p1);

        p1 = new Meal();
        p1.setMealName("Grilled salmon with Veggitable ");
        p1.setMealPriceOne("\uF005  4.9");
        p1.setMealPriceTew("(25)");
        p1.setMealPriceThree("\uF017  35 - 40 MIN");
        p1.setMelImage(R.drawable.cuisine_delicious_dinner);
        m.add(p1);


        p1 = new Meal();
        p1.setMealName("Grilled salmon with Veggitable ");
        p1.setMealPriceOne("\uF005  4.9");
        p1.setMealPriceTew("(25)");
        p1.setMealPriceThree("\uF017  35 - 40 MIN");
        p1.setMelImage(R.drawable.cuisine_delicious_dinner);
        m.add(p1);

        return m;

    }
}