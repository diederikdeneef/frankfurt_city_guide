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
 * A simple {@link Fragment} subclass.
 */
public class SitesFragment extends Fragment {

    private RecyclerView recyclerView;

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public SitesFragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment SitesFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static SitesFragment newInstance(String param1, String param2) {
//        SitesFragment fragment = new SitesFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sites, container, false);

        // Data to populate the recyclerview
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Römerberg", "Romer"));
        attractions.add(new Attraction("Dom St. Bartolomaus", "Cathedral of St. Bartholomew"));
        attractions.add(new Attraction("Eiserne Steg", "Iron Bridge"));
        attractions.add(new Attraction("Eschenheimer Tor", "Eschenheimer Tower"));
        attractions.add(new Attraction("Main Turm", "Main Tower"));
        attractions.add(new Attraction("Hauptwache", "Hauptwache"));
        attractions.add(new Attraction("Kleinmarkthalle", "Small market hall"));
        attractions.add(new Attraction("SachsenHausen", "Sachsenhausen"));
        attractions.add(new Attraction("Alte Oper", "The Old Opera House"));
        attractions.add(new Attraction("Palmengarten", "Botanical Garden"));
        attractions.add(new Attraction("Alte Nikolaikirche", "Old Nicholas Church"));
        attractions.add(new Attraction("Bockenheimerwarte", ""));
        attractions.add(new Attraction("Paulskirche", "St. Paul's Church"));
        attractions.add(new Attraction("Rathaus Seckbach", "City Council"));
        attractions.add(new Attraction("Huhnermarkt", "Chicken market"));
        attractions.add(new Attraction("Goethe Hause", "Goethe House"));


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