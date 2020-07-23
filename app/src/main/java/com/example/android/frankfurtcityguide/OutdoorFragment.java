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
 * {@link Fragment} displays the outdoor activities in and around Frankfurt
 */
public class OutdoorFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_outdoor, container, false);

        // Data to populate the recycler view
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Alter Flugplatz",
                "The old airfield with the Tower Café is located in the green belt of Frankfurt in the middle of the landscape protection area.",
                "Am Burghof",
                "55",
                "60437",
                "Frankfurt am Main - Bonames",
                 R.drawable.alten_flugplatz));
        attractions.add(new Attraction("Grüneburgpark",
                "The large park near the cit center offers meadows with groups of large trees, curved gravel paths, two playgrounds, and a pavillion.",
                "Grüneburgweg",
                "",
                "60323",
                "Frankfurt am Main",
                R.drawable.grueneburgpark));
        attractions.add(new Attraction("Günthersburgpark",
                "Besides a water playground for hot summer days, this park offers rare exotic species such as sequoias, black pines, empress tree, and coffee trees.",
                "Comeniusstraße",
                "",
                "60389",
                "Frankfurt am Main",
                R.drawable.guenthersburgpark));
        attractions.add(new Attraction("GrünGürtel Frankfurt",
                "The GrünGurtel (Green Ring) is a system of open spaces running around the core city of Frankfurt am Main. It offers orchards, nature reserves, streams, fields, parks, gardens, sports and leisure facilities.",
                "",
                "",
                "",
                "Frankfurt am Main",
                R.drawable.gruenguertel));
        attractions.add(new Attraction("Zoo Frankfurt",
                "The Frankfurt Zoo features over 4,500 animals of more than 510 species on more than 11 hectares. The zoo was founded in 1858 and is the second oldest zoo in Germany.",
                "Bernhard-Grzimek-Allee",
                "1",
                "60316",
                "Frankfurt am Main",
                R.drawable.zoofrankfurt));

        attractions.add(new Attraction("Freibäder Frankfurt",
                "A Freibad is an open air pool of which Frankfurt offers several. Check www.frankfurter-baeder.de/freibaeder/ for more information.",
                "",
                "",
                "",
                "Frankfurt am Main",
                R.drawable.freibad));

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