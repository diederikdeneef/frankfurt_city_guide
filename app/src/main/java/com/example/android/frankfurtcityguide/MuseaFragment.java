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
 * {@link Fragment} showing the museums
 */
public class MuseaFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_musea, container, false);

        // Data to populate the museums recycler view
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(
                getContext().getString(R.string.museum_staedel_name),
                getContext().getString(R.string.museum_staedel_description),
                "Schaumainkai",
                "63",
                "60596",
                "Frankfurt am Main",
                R.drawable.staedel_rembrandt));
        attractions.add(new Attraction(
                getContext().getString(R.string.museum_senckenberg_name),
                getContext().getString(R.string.museum_senckenberg_description),
                "Senckenberganlage",
                "25",
                "60325",
                "Frankfurt am Main",
                R.drawable.senckenberg_triceratops));
        attractions.add(new Attraction(
                getContext().getString(R.string.museum_historisches_name),
                getContext().getString(R.string.museum_historisches_description),
                "Saalhof",
                "1",
                "60311",
                "Frankfurt am Main",
                R.drawable.historymuseum_saalhof));
        attractions.add(new Attraction(
                getContext().getString(R.string.museum_architecture_name),
                getContext().getString(R.string.museum_architecture_description),
                "Schaumainkai",
                "43",
                "60596",
                "Frankfurt am Main",
                R.drawable.deutsches_architektur_museum));
        attractions.add(new Attraction(
                getContext().getString(R.string.museum_archeological_name),
                getContext().getString(R.string.museum_archeological_description),
                "Karmelitergasse",
                "1",
                "60311",
                "Frankfurt am Main",
                R.drawable.archeologymuseum));
        attractions.add(new Attraction(
                getContext().getString(R.string.museum_struwel_peter_name),
                getContext().getString(R.string.museum_struwel_peter_description),
                "Hinter dem Lämmchen",
                "2-4",
                "60311",
                "Frankfurt am Main",
                R.drawable.struwwel_peter_museum));
        attractions.add(new Attraction(
                getContext().getString(R.string.museum_junges_name),
                getContext().getString(R.string.museum_junges_description),
                "Saalhof",
                "1",
                "60311",
                "Frankfurt am Main",
                R.drawable.jungesmuseum));
        attractions.add(new Attraction(
                getContext().getString(R.string.museum_jewish_name),
                getContext().getString(R.string.museum_jewish_description),
                "Untermainkai",
                " 14-15",
                "60311",
                "Frankfurt am Main",
                R.drawable.judischesmuseum));

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