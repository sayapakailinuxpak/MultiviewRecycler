package com.eldisprojectcodelabs.multiviewrecycler.holder;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eldisprojectcodelabs.multiviewrecycler.R;

public class GroupViewHolder extends RecyclerView.ViewHolder {
    public RelativeLayout relativeLayoutGroup;
    public TextView textViewGroupTitle;
    public Button buttonViewAll;
    public RecyclerView recyclerViewGroup;

    public GroupViewHolder(@NonNull View itemView) {
        super(itemView);
        relativeLayoutGroup = itemView.findViewById(R.id.group_relative_parent);
        textViewGroupTitle = itemView.findViewById(R.id.group_title);
        buttonViewAll = itemView.findViewById(R.id.button_view_all);
        recyclerViewGroup = itemView.findViewById(R.id.group_recyclerview);
    }

}
