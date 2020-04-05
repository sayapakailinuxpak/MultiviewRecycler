package com.eldisprojectcodelabs.multiviewrecycler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eldisprojectcodelabs.multiviewrecycler.R;
import com.eldisprojectcodelabs.multiviewrecycler.holder.GroupViewHolder;
import com.eldisprojectcodelabs.multiviewrecycler.model.GroupModel;
import com.eldisprojectcodelabs.multiviewrecycler.model.MovieModel;

import java.util.ArrayList;

public class GroupLayoutAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<GroupModel> groupModelArrayList;
    private ArrayList<MovieModel> movieModelArrayList;
    private ArrayList<MovieModel> advetiseModelArrayList;

    public GroupLayoutAdapter(Context context, ArrayList<GroupModel> groupModelArrayList, ArrayList<MovieModel> movieModelArrayList, ArrayList<MovieModel> advetiseModelArrayList) {
        this.context = context;
        this.groupModelArrayList = groupModelArrayList;
        this.movieModelArrayList = movieModelArrayList;
        this.advetiseModelArrayList = advetiseModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_layout, parent, false);
        return new GroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        setGroupTitle(((GroupViewHolder) holder).textViewGroupTitle, groupModelArrayList.get(position).getGroupTitle());
        setGroupButtonTitle(((GroupViewHolder) holder).buttonViewAll, groupModelArrayList.get(position).getGroupButtonTitle());
        setOnClickButtonViewAll(((GroupViewHolder) holder).relativeLayoutGroup, groupModelArrayList.get(position).getGroupTitle());
        setLists(((GroupViewHolder) holder).recyclerViewGroup, position);
    }

    @Override
    public int getItemCount() {
        return groupModelArrayList.size();
    }

    private void setGroupTitle(TextView textView, String text){
        textView.setText(text);
    }

    private void setGroupButtonTitle(Button button, String text){
        button.setText(text);
    }

    private void setOnClickButtonViewAll(RelativeLayout relativeLayout, final String groupTitle){
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "View All " + groupTitle, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setLists(RecyclerView recyclerView, int position){
        switch (position){
            case 0 :
                setHorizontalAdsList(recyclerView);
                break;
            case 1 :
                setHorizontalMovieList(recyclerView);
                break;
        }
    }

    //set group

    private void setHorizontalAdsList(RecyclerView recyclerView){
        AdvertiseCardAdapter advertiseCardAdapter = new AdvertiseCardAdapter(context, advetiseModelArrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(advertiseCardAdapter);
        recyclerView.setNestedScrollingEnabled(true);
    }

    private void setHorizontalMovieList(RecyclerView recyclerView){
        MovieCardAdapter movieCardAdapter = new MovieCardAdapter(context, movieModelArrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(movieCardAdapter);
        recyclerView.setNestedScrollingEnabled(true);
    }
}
