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
        //String attraction = mData.get(position).getmAttractionDE();
        holder.germanDescription.setText(attraction.getmAttractionDE());
        holder.englishDescription.setText(attraction.getmAttractionEN());
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView germanDescription;
        TextView englishDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            germanDescription = itemView.findViewById(R.id.german_description);
            englishDescription = itemView.findViewById(R.id.english_description);
        }
    }
}
