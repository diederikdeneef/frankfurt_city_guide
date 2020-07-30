package com.example.android.frankfurtcityguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays the Theatres in Frankfurt
 */
public class TheatreFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_theatre, container, false);

        // Data to populate the recycler view

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_alte_oper_name),
                getContext().getString(R.string.sites_alte_oper_description),
                "Opernplatz",
                "1",
                "60311",
                "Frankfurt am Main",
                R.drawable.alteoper));
        attractions.add(new Attraction(
                getContext().getString(R.string.theatre_english_name),
                getContext().getString(R.string.theatre_english_description),
                "Gallusanlage",
                "7",
                "60329",
                "Frankfurt am Main",
                R.drawable.english_theatre));
        attractions.add(new Attraction(
                getContext().getString(R.string.theatre_oper_name),
                getContext().getString(R.string.theatre_oper_description),
                "Untermainanlage",
                "11",
                "60311",
                "Frankfurt am Main",
                R.drawable.operfrankfurt));
        attractions.add(new Attraction(
                getContext().getString(R.string.theatre_jazzkeller_name),
                getContext().getString(R.string.theatre_jazzkeller_description),
                "Kleine Bockenheimer Str.",
                "18a",
                "60313",
                "Frankfurt am Main",
                R.drawable.jazzkeller));
        attractions.add(new Attraction(
                getContext().getString(R.string.theatre_internationales_name),
                getContext().getString(R.string.theatre_internationales_description),
                "Hanauer Landstraße",
                "5-7",
                "60314",
                "Frankfurt am Main",
                R.drawable.internationalestheater));

        // Create the recycler view
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        // Set a layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(layoutManager);

        // Set the adapter
        rvAdapter adapter = new rvAdapter(getContext(), attractions);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}