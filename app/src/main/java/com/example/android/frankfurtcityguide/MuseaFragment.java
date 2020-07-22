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
        attractions.add(new Attraction("Städel Museum",
                "The Städel Museum is an art museum with one of the most important collections in Germany. The Städel Museum owns 3,100 paintings, 660 sculptures, more than 4,600 photographs and more than 100,000 drawings and prints.",
                "Schaumainkai",
                "63",
                "60596",
                "Frankfurt am Main",
                R.drawable.staedel_rembrandt));
        attractions.add(new Attraction("Naturmuseum Senckenberg",
                "The Naturmuseum Senckenberg is a museum of natural history, located in Frankfurt am Main. It is the second-largest of its type in Germany.",
                "Senckenberganlage",
                "25",
                "60325",
                "Frankfurt am Main",
                R.drawable.senckenberg_triceratops));
        attractions.add(new Attraction("Historisches Museum Frankfurt",
                "The Historical Museum situated in the 'Saalhof' has cultural and historical objects relating to the history of Frankfurt and Germany on display.",
                "Saalhof",
                "1",
                "60311",
                "Frankfurt am Main",
                R.drawable.historymuseum_saalhof));
        attractions.add(new Attraction("Deutsches Architekturmuseum",
                "The German Architecture Museum is located on the Museumsufer in Frankfurt. It houses a permanent exhibition entitled \"From Ancient Huts to Skyscrapers\" which displays the history of architectural development in Germany.",
                "Schaumainkai",
                "43",
                "60596",
                "Frankfurt am Main",
                R.drawable.deutsches_architektur_museum));
        attractions.add(new Attraction("Frankfurt Archaeological Museum",
                "Museum in a restored monastery exploring the city's history from the Neolithic to early modern eras.",
                "Karmelitergasse",
                "1",
                "60311",
                "Frankfurt am Main",
                R.drawable.archeologymuseum));
        attractions.add(new Attraction("Struwwelpeter-Museum",
                "Stalwart, cozy museum dedicated to a beloved 19th-century children’s book & its author’s life.",
                "Hinter dem Lämmchen",
                "2-4",
                "60311",
                "Frankfurt am Main",
                R.drawable.struwwel_peter_museum));
        attractions.add(new Attraction("Junges Museum Frankfurt",
                "Bright children's museum with interactive displays on natural science, multimedia workshops and craft activities.",
                "Saalhof",
                "1",
                "60311",
                "Frankfurt am Main",
                R.drawable.jungesmuseum));
        attractions.add(new Attraction("Jüdisches Museum",
                "800 Years of jewish history and culture in Frankfurt",
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