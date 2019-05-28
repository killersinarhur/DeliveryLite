package com.ramon.deliverylite.discover.restaurantrv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ramon.deliverylite.R;
import com.ramon.deliverylite.webservice.api.model.Restaurant;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

class RestaurantViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.rest_img_viewholder)
    ImageView restLogo;
    @BindView(R.id.rest_tv_viewholder_rest_name)
    TextView restName;
    @BindView(R.id.rest_tv_viewholder_rest_categories)
    TextView restCategoreis;
    @BindView(R.id.rest_tv_viewhlder_time)
    TextView restTime;

    public RestaurantViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public static RecyclerView.ViewHolder inflate(ViewGroup viewGroup) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.restaurant_view_holder, viewGroup, false);
        return new RestaurantViewHolder(view);
    }


    public void bind(Restaurant restaurant, View.OnClickListener listener) {
        itemView.setOnClickListener(listener);
        restName.setText(restaurant.getName());
        restCategoreis.setText(formatTags(restaurant.getTags()));
        restTime.setText(restaurant.getStatus());
        Glide.with(itemView.getContext()).load(restaurant.getCoverImgUrl()).into(restLogo);
    }

    private String formatTags(List<String> tags) {
        StringBuilder stringBuilder= new StringBuilder();
        for (String s :tags) {
            stringBuilder.append(s).append(",");
        }
        return StringUtils.isEmpty(stringBuilder.toString())? "":stringBuilder.substring(0,stringBuilder.length()-1);
    }
}
