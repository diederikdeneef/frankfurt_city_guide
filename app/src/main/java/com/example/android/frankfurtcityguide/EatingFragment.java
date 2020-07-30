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
 * {@link Fragment} displays examples of the local cuisine
 */
public class EatingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_eating, container, false);

        // Data to populate the recycler view
        ArrayList<Attraction> localCuisine = new ArrayList<>();
        localCuisine.add(new Attraction(
                getContext().getString(R.string.eating_frankfurter_wuerstchen_name),
                getContext().getString(R.string.eating_frankfurter_wuerstchen_description),
                R.drawable.frankfurter_wuerstchen));
        localCuisine.add(new Attraction(
                getContext().getString(R.string.eating_gruene_sosse_name),
                getContext().getString(R.string.eating_gruene_sosse_description),
                R.drawable.gruene_sosse));
        localCuisine.add(new Attraction(
                getContext().getString(R.string.eating_rippchen_name),
                getContext().getString(R.string.eating_rippchen_description),
                R.drawable.frankfurter_rippchen));
        localCuisine.add(new Attraction(
                getContext().getString(R.string.eating_handkaes_name),
                getContext().getString(R.string.eating_handkaes_description),
                R.drawable.handkaese_mit_musik));
        localCuisine.add(new Attraction(
                getContext().getString(R.string.eating_applewine_name),
                getContext().getString(R.string.eating_applewine_description),
                R.drawable.apfelwein));
        localCuisine.add(new Attraction(
                getContext().getString(R.string.eating_frankfurter_kranz_name),
                getContext().getString(R.string.eating_frankfurter_kranz_description),
                R.drawable.frankfurter_kranz));

        // Create the recycler view
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        // Set a layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(layoutManager);

        // Set the adapter
        rvAdapter adapter = new rvAdapter(getContext(), localCuisine);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}