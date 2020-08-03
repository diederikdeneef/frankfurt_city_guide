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
 * A simple {@link Fragment} subclass.
 */
public class SitesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sites, container, false);

        // Data to populate the recyclerview
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_roemerberg_name),
                getContext().getString(R.string.sites_roemerberg_description),
                R.drawable.roemerberg));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_dom_name),
                getContext().getString(R.string.sites_dom_description),
                R.drawable.frankfurter_dom));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_eiserne_steg_name),
                getContext().getString(R.string.sites_eiserne_steg_description),
                R.drawable.eiserner_steg));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_hauptwache_name),
                getContext().getString(R.string.sites_hauptwache_description),
                R.drawable.hauptwache));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_kleinmarkthalle_name),
                getContext().getString(R.string.sites_kleinmarkthalle_description),
                R.drawable.kleinmarkthalle));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_sachsenhausen_name),
                getContext().getString(R.string.sites_sachsenhausen_description),
                R.drawable.sachsenhausen));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_alte_oper_name),
                getContext().getString(R.string.sites_alte_oper_description),
                R.drawable.alteoper));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_palmengarten_name),
                getContext().getString(R.string.sites_palmengartem_description),
                R.drawable.palmengarten));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_nikolaikirche_name),
                getContext().getString(R.string.sites_nikolaikirche_description),
                R.drawable.altenikolaikirche));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_paulskirche_name),
                getContext().getString(R.string.sites_paulskirche_description),
                R.drawable.paulskirche));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_goethe_haus_name),
                getContext().getString(R.string.sites_goethe_haus_description),
                R.drawable.goethehaus));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_museums_ufer_name),
                getContext().getString(R.string.sites_museums_ufer_description),
                R.drawable.museumsufer));


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