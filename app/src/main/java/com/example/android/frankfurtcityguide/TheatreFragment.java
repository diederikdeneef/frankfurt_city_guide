package com.example.android.frankfurtcityguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays the Theatres in Frankfurt
 */
public class TheatreFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_theatre, container, false);

        // Data to populate the recycler view

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Alte Oper",
                "Destroyed by Allied bombing in 1944, Frankfurt's beautifully reconstructed opera house was reopened in 1981. It's now a major venue for concerts and operas.",
                "Opernplatz",
                "1",
                "60311",
                "Frankfurt am Main",
                R.drawable.alteoper));
        attractions.add(new Attraction("The English Theatre Frankfurt",
                "The English Theatre Frankfurt is a 300-seat theatre located at the Gallileo skyscraper.",
                "Gallusanlage",
                "7",
                "60329",
                "Frankfurt am Main",
                R.drawable.english_theatre));
        attractions.add(new Attraction("Oper Frankfurt",
                "The Oper Frankfurt is one of the leading opera companies in Europe, and voted best \"Opera house of the year\" several times since 1996.",
                "Untermainanlage",
                "11",
                "60311",
                "Frankfurt am Main",
                R.drawable.operfrankfurt));
        attractions.add(new Attraction("Jazzkeller Frankfurt",
                "Intimate, storied jazz club since 1952 with crafted cocktails & a nostalgic speakeasy fee",
                "Kleine Bockenheimer Str.",
                "18a",
                "60313",
                "Frankfurt am Main",
                R.drawable.jazzkeller));
        attractions.add(new Attraction("Internationales Theater Frankfurt",
                "Authentic art from their homes, performed with heart and soul: This is what artists and ensembles from over 25 cultures offer at The International Theatre Frankfurt.",
                "Hanauer Landstraße",
                "5-7",
                "60314",
                "Frankfurt am Main",
                R.drawable.internationalestheater));

        // Create the recycler view
        recyclerView = rootView.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        // Set a layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(layoutManager);

        // Set the adapter
        rvAdapter adapter = new rvAdapter(getContext(),attractions);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}