package com.example.sacand.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sacand.R;
import com.example.sacand.adapter.RecycleAdapter;
import com.example.sacand.data.Meal;
import com.example.sacand.ui.viewmodel.SearchViewModel;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

  //  private SearchViewModel searchViewModel;
    private RecyclerView recyclerView;
    RecycleAdapter adapter;

    @SuppressLint("WrongConstant")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        searchViewModel =
//                ViewModelProviders.of(this).get(SearchViewModel.class);
        View root = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView = root.findViewById(R.id.recycler_meal);
        adapter = new RecycleAdapter(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayout.VERTICAL,false));
        adapter.setList(prepareArray());
        recyclerView.setAdapter(adapter);
        return root;
    }

    private ArrayList<Meal> prepareArray() {
        ArrayList<Meal> m = new ArrayList<>();

        Meal p1 = new Meal();
        p1.setMealName("Burger");
        p1.setMealPriceOne("\uF005  4.9");
        p1.setMealPriceTew("(25)");
        p1.setMealPriceThree("\uF017  35 - 40 MIN");
        p1.setMelImage(R.drawable.cuisine_delicious_dinner);
        p1.setFreeDelivery(true);
        m.add(p1);

        p1 = new Meal();
        p1.setMealName("Grilled salmon with Veggitable ");
        p1.setMealPriceOne("\uF005  4.9");
        p1.setMealPriceTew("(25)");
        p1.setMealPriceThree("\uF017  35 - 40 MIN");
        p1.setMelImage(R.drawable.cuisine_delicious_dinner);
        p1.setFreeDelivery(false);
        m.add(p1);


        p1 = new Meal();
        p1.setMealName("Grilled salmon with Veggitable ");
        p1.setMealPriceOne("\uF005  4.9");
        p1.setMealPriceTew("(25)");
        p1.setMealPriceThree("\uF017  35 - 40 MIN");
        p1.setMelImage(R.drawable.cuisine_delicious_dinner);
        p1.setFreeDelivery(false);
        m.add(p1);

        return m;

    }
}