package com.example.android.frankfurtcityguide;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ImageCreditsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_credits);

        // Data to populate the recycler view
        ArrayList<ImageCredits> imageCredits = new ArrayList<>();
        imageCredits.add(new ImageCredits(
                "Römerberg Frankfurt abends.jpg",
                "https://de.wikipedia.org/wiki/Datei:R%C3%B6merberg_Frankfurt_abends.jpg",
                "Thomas Wolf",
                "https://foto-tw.de/",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));

        // Find the recycler view in the xml layout
        RecyclerView recyclerView = findViewById(R.id.image_credits_recyclerview);

        // Set a layout manager for the recycler view
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Set the recycler view adapter
        icAdapter adapter = new icAdapter(this, imageCredits);
        recyclerView.setAdapter(adapter);



    }
}
