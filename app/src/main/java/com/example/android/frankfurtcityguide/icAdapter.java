package com.example.android.frankfurtcityguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class icAdapter extends RecyclerView.Adapter<icAdapter.ViewHolder> {

    // Variables
    private ArrayList<ImageCredits> mData;
    private LayoutInflater mInflater;

    // Constructor
    icAdapter(Context context, ArrayList<ImageCredits> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    @NonNull
    @Override
    public icAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.image_credits_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull icAdapter.ViewHolder holder, int position) {
        ImageCredits imageCredits = mData.get(position);
        holder.imageTitle.setText(imageCredits.getImageTitle());
        holder.imageAuthor.setText(imageCredits.getImageAuthor());
        holder.imageLicense.setText(imageCredits.getImageLicense());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView imageTitle;
        TextView imageAuthor;
        TextView imageLicense;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageTitle = itemView.findViewById(R.id.image_title);
            imageAuthor = itemView.findViewById(R.id.image_author);
            imageLicense = itemView.findViewById(R.id.image_license);
        }

    }

}
