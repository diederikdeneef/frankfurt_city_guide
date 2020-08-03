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
 * {@link Fragment} displays the outdoor activities in and around Frankfurt
 */
public class OutdoorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_outdoor, container, false);

        // Data to populate the recycler view
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(
                getContext().getString(R.string.outdoor_alter_flugplatz_name),
                getContext().getString(R.string.outdoor_alter_flugplatz_description),
                R.drawable.alten_flugplatz));
        attractions.add(new Attraction(
                getContext().getString(R.string.outdoor_grueneburgpark_name),
                getContext().getString(R.string.outdoor_grueneburgpark_description),
                R.drawable.grueneburgpark));
        attractions.add(new Attraction(
                getContext().getString(R.string.outdoor_guenthersburgpark_name),
                getContext().getString(R.string.outdoor_guenthersburgpark_description),
                R.drawable.guenthersburgpark));
        attractions.add(new Attraction(
                getContext().getString(R.string.outdoor_gruenguertel_name),
                getContext().getString(R.string.outdoor_gruenguertel_description),
                R.drawable.gruenguertel));
        attractions.add(new Attraction(
                getContext().getString(R.string.outdoor_zoo_name),
                getContext().getString(R.string.outdoor_zoo_description),
                R.drawable.zoofrankfurt));
        attractions.add(new Attraction(
                getContext().getString(R.string.outdoor_pool_name),
                getContext().getString(R.string.outdoor_pool_description),
                R.drawable.freibad));

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