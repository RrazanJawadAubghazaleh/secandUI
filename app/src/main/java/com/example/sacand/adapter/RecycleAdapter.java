package com.example.sacand.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.sacand.R;
import com.example.sacand.data.Meal;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.viewitem> {


    ArrayList<Meal> items;
    private Context context;


    public RecycleAdapter(Context context) {
        this.context = context;
    }


    //onCreateViewHolder used to HAndle on Clicks
    @Override
    public viewitem onCreateViewHolder(final ViewGroup parent, int viewType) {

        final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_meal, parent, false);
        return new viewitem(itemView);
    }


    //to fill each item with data from the array depending on position
    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(final viewitem holder, final int position) {

      holder.imageViewPropertiesHome.setImageResource(items.get(position).getMelImage());
      holder.tvName.setText(items.get(position).getMealName());
      holder.tvOne.setText(items.get(position).getMealPriceOne());
      holder.tvTew.setText(items.get(position).getMealPriceTew());
      holder.tvThree.setText(items.get(position).getMealPriceThree());
      if (items.get(position).isFreeDelivery())
      holder.buttonFreeDelivery.setVisibility(View.VISIBLE);
      else holder.buttonFreeDelivery.setVisibility(View.GONE);

    }


    @Override
    public int getItemCount() {
        if (items == null)
            return 0;

        return items.size();
    }

    public void setList(ArrayList<Meal> list) {
        this.items = list;
        notifyDataSetChanged();
    }




    class viewitem extends RecyclerView.ViewHolder {

        //Declare
       // ImageView image;
        TextView tvName,tvOne,tvTew,tvThree;
        Button buttonFreeDelivery;
        SimpleDraweeView imageViewPropertiesHome ;
        //initialize
        public viewitem(View itemView) {
            super(itemView);
            imageViewPropertiesHome = (SimpleDraweeView)itemView.findViewById(R.id.image_meal_rec);
            tvName=  itemView.findViewById(R.id.tv_name);
            tvOne=  itemView.findViewById(R.id.tv_one);
            tvTew=  itemView.findViewById(R.id.tv_tow);
            tvThree=  itemView.findViewById(R.id.tv_thee);
            buttonFreeDelivery=  itemView.findViewById(R.id.bn_free_delivery);

        }
    }

}

