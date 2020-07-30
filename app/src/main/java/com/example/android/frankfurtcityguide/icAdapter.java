package com.example.android.frankfurtcityguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class icAdapter extends RecyclerView.Adapter<icAdapter.ViewHolder> {

    // Variables
    private ArrayList<ImageCredits> mData;
    private LayoutInflater mInflater;
    private Context mContext;

    // Constructor
    icAdapter(Context context, ArrayList<ImageCredits> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.mContext = context;
    }

    @NonNull
    @Override
    public icAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.image_credits_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull icAdapter.ViewHolder holder, int position) {

        // Set the text to the respective TextViews in the recyclerView item
        final ImageCredits imageCredits = mData.get(position);
        holder.imageTitle.setText(imageCredits.getImageTitle());
        holder.imageAuthor.setText(imageCredits.getImageAuthor());
        holder.imageLicense.setText(imageCredits.getImageLicense());

        // Set up an on click listener for the three views
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get xml ID of current view
                String currentView = view.getResources().getResourceEntryName(view.getId());

                // Open URL based on the ID of the current view
                if (currentView.equals("image_title")) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(imageCredits.getImageSource()));
                    mContext.startActivity(browserIntent);
                } else if (currentView.equals("image_author")) {
                    if (!imageCredits.getmImageAuthorURL().equals("")) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse(imageCredits.getmImageAuthorURL()));
                        mContext.startActivity(browserIntent);
                    } else {
                        Toast.makeText(mContext, R.string.toast_no_author_url, Toast.LENGTH_SHORT).show();
                    }
                } else if (currentView.equals("image_license")) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(imageCredits.getImageLicenseURL()));
                    mContext.startActivity(browserIntent);
                }
            }
        };

        // Set the onClickListener to the respective TextViews in the recyclerView item
        holder.imageTitle.setOnClickListener(listener);
        holder.imageAuthor.setOnClickListener(listener);
        holder.imageLicense.setOnClickListener(listener);
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
