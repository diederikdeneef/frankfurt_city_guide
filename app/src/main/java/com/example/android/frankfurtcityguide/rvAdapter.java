package com.example.android.frankfurtcityguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.ViewHolder> {

    // Variables
    private ArrayList<Attraction> mData;
    private LayoutInflater mInflater;

    // Constructor
    rvAdapter(Context context, ArrayList<Attraction> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    // Inflate the recycler row item
    @NonNull
    @Override
    public rvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    // Bind data to the TextView in each recycler row item
    @Override
    public void onBindViewHolder(@NonNull rvAdapter.ViewHolder holder, int position) {
        Attraction attraction = mData.get(position);
        holder.attractionName.setText(attraction.getmAttractionName());
        holder.attractionDescription.setText(attraction.getmAttractionDescription());
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView attractionName;
        TextView attractionDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            attractionName = itemView.findViewById(R.id.attraction_name);
            attractionDescription = itemView.findViewById(R.id.description);
        }
    }
}
