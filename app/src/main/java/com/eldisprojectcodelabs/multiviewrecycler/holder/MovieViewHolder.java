package com.eldisprojectcodelabs.multiviewrecycler.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eldisprojectcodelabs.multiviewrecycler.R;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageViewMovie;
    public RelativeLayout relativeLayout;
    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewMovie = itemView.findViewById(R.id.top_movie_imageview);
        relativeLayout = itemView.findViewById(R.id.top_movie_relative_parent);
    }
}
