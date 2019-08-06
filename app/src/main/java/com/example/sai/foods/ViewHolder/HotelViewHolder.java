package com.example.sai.foods.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sai.foods.Interface.ItemClickListner;
import com.example.sai.foods.R;

/*
 * Created by sai on 10/02/2018.
 */

public class HotelViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtHotelName;
    public ImageView imageHotelView;

    private ItemClickListner itemClickListner;

    public HotelViewHolder(View itemView){
        super(itemView);

        txtHotelName = (TextView)itemView.findViewById(R.id.hotel_name);
        imageHotelView = (ImageView)itemView.findViewById(R.id.hotel_image);

        itemView.setOnClickListener(this);

    }

    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }

    @Override
    public void onClick(View view) {
        itemClickListner.onClick(view,getAdapterPosition(),false);
    }
}
