package com.eldisprojectcodelabs.multiviewrecycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eldisprojectcodelabs.multiviewrecycler.adapter.GroupLayoutAdapter;
import com.eldisprojectcodelabs.multiviewrecycler.model.GroupModel;
import com.eldisprojectcodelabs.multiviewrecycler.model.MovieModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    GroupLayoutAdapter groupLayoutAdapter;
    private ArrayList<GroupModel> groupModelArrayList;
    private ArrayList<MovieModel> advertiesModelArrayList;
    private ArrayList<MovieModel> movieModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAdapterType();
        setAdapter();
    }

    private void initGroupData(){
        groupModelArrayList =  new ArrayList<>();
        groupModelArrayList.add(new GroupModel(GroupData.groupTitle[0], GroupData.groupButtonTitle));
        groupModelArrayList.add(new GroupModel(GroupData.groupTitle[1], GroupData.groupButtonTitle));
    }

    private void initAdsData(){
        advertiesModelArrayList = new ArrayList<>();

        advertiesModelArrayList.add(new MovieModel(MovieData.imageTitle[0], MovieData.imageUrl[0]));
        advertiesModelArrayList.add(new MovieModel(MovieData.imageTitle[1], MovieData.imageUrl[1]));
        advertiesModelArrayList.add(new MovieModel(MovieData.imageTitle[2], MovieData.imageUrl[2]));
        advertiesModelArrayList.add(new MovieModel(MovieData.imageTitle[3], MovieData.imageUrl[3]));
        advertiesModelArrayList.add(new MovieModel(MovieData.imageTitle[4], MovieData.imageUrl[4]));

    }

    private void initMovieData(){
        movieModelArrayList = new ArrayList<>();
        movieModelArrayList.add(new MovieModel(MovieData.imageTitle[0], MovieData.imageUrl[0]));
        movieModelArrayList.add(new MovieModel(MovieData.imageTitle[1], MovieData.imageUrl[1]));
        movieModelArrayList.add(new MovieModel(MovieData.imageTitle[2], MovieData.imageUrl[2]));
        movieModelArrayList.add(new MovieModel(MovieData.imageTitle[3], MovieData.imageUrl[3]));
        movieModelArrayList.add(new MovieModel(MovieData.imageTitle[4], MovieData.imageUrl[4]));

    }

    private void setAdapterType(){
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void setAdapter(){
        initGroupData();
        initMovieData();
        initAdsData();
        groupLayoutAdapter = new GroupLayoutAdapter(MainActivity.this, groupModelArrayList, movieModelArrayList, advertiesModelArrayList);
        recyclerView.setAdapter(groupLayoutAdapter);
    }
}
