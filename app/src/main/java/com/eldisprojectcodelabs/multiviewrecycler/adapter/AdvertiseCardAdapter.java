package com.eldisprojectcodelabs.multiviewrecycler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eldisprojectcodelabs.multiviewrecycler.R;
import com.eldisprojectcodelabs.multiviewrecycler.holder.AdvertiseViewHolder;
import com.eldisprojectcodelabs.multiviewrecycler.model.MovieModel;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdvertiseCardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<MovieModel> movieModelArrayList;

    public AdvertiseCardAdapter(Context context, ArrayList<MovieModel> movieModelArrayList) {
        this.context = context;
        this.movieModelArrayList = movieModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.advertise_item, parent, false);
        return new AdvertiseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        setImage(((AdvertiseViewHolder) holder).imageViewAds, movieModelArrayList.get(position).getMovieImageURL());
        setOnClick(((AdvertiseViewHolder) holder).relativeLayout, position);
    }

    @Override
    public int getItemCount() {
        return movieModelArrayList.size();
    }

    private void setImage(final ImageView imageView, String imageUrl){
        Picasso.get().load(imageUrl).fit().into(imageView, new Callback() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onError(Exception e) {
                imageView.setImageResource(R.drawable.ic_launcher_background);
            }
        });
    }

    private void setOnClick(RelativeLayout relativeLayout, final int position){
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Item no : " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
