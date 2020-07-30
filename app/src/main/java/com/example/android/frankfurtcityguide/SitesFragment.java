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
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_roemerberg_name),
                getContext().getString(R.string.sites_roemerberg_description),
                "Roemerberg",
                "27",
                "60311",
                "Frankfurt am Main",
                R.drawable.roemerberg));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_dom_name),
                getContext().getString(R.string.sites_dom_description),
                "Domplatz ",
                "1",
                "60311",
                "Frankfurt am Main",
                R.drawable.frankfurter_dom));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_eiserne_steg_name),
                getContext().getString(R.string.sites_eiserne_steg_description),
                "Mainkai",
                "39",
                "60311",
                "Frankfurt am Main",
                R.drawable.eiserner_steg));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_hauptwache_name),
                getContext().getString(R.string.sites_hauptwache_description),
                "An der Hauptwache",
                "",
                "60311",
                "Frankfurt am Main",
                R.drawable.hauptwache));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_kleinmarkthalle_name),
                getContext().getString(R.string.sites_kleinmarkthalle_description),
                "Hasengasse",
                "5-7",
                "60311",
                "Frankfurt am Main",
                R.drawable.kleinmarkthalle));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_sachsenhausen_name),
                getContext().getString(R.string.sites_sachsenhausen_description),
                "",
                "",
                "60596",
                "Frankfurt am Main",
                R.drawable.sachsenhausen));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_alte_oper_name),
                getContext().getString(R.string.sites_alte_oper_description),
                "Opernplatz",
                "1",
                "60311",
                "Frankfurt am Main",
                R.drawable.alteoper));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_palmengarten_name),
                getContext().getString(R.string.sites_palmengartem_description),
                "Siesmayerstr.",
                " 61",
                "60323",
                "Frankfurt am Main",
                R.drawable.palmengarten));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_nikolaikirche_name),
                getContext().getString(R.string.sites_nikolaikirche_description),
                "Roemerberg",
                "11",
                "60311",
                "Frankfurt am Main",
                R.drawable.altenikolaikirche));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_paulskirche_name),
                getContext().getString(R.string.sites_paulskirche_description),
                "Paulsplatz",
                "11",
                "60311",
                "Frankfurt am Main",
                R.drawable.paulskirche));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_goethe_haus_name),
                getContext().getString(R.string.sites_goethe_haus_description),
                "Grosser Hirschgraben",
                "23 - 25",
                "60311",
                "Frankfurt am Main",
                R.drawable.goethehaus));
        attractions.add(new Attraction(
                getContext().getString(R.string.sites_museums_ufer_name),
                getContext().getString(R.string.sites_museums_ufer_description),
                "",
                "",
                "",
                "Frankfurt am Main",
                R.drawable.museumsufer));


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