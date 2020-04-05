package com.eldisprojectcodelabs.multiviewrecycler.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eldisprojectcodelabs.multiviewrecycler.R;

public class AdvertiseViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageViewAds;
    public RelativeLayout relativeLayout;
    public AdvertiseViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewAds = itemView.findViewById(R.id.advertise_imageview);
        relativeLayout = itemView.findViewById(R.id.advertise_relative_parent);
    }
}
