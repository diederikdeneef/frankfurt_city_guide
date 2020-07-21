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
        attractions.add(new Attraction("Römerberg",
                "The site of Frankfurt's city hall since 1405, this historic building remains the defining symbol of the city's historic past.",
                "Roemerberg",
                "27",
                "60311",
                "Frankfurt am Main"));
        attractions.add(new Attraction("Dom St. Bartolomaus",
                "This historic cathedral served for 300 years as the site of coronation for Holy Roman Emperors.",
                "Domplatz ",
                "1",
                "60311",
                "Frankfurt am Main"));
        attractions.add(new Attraction("Eiserne Steg",
                "The Eiserner Steg (Iron Bridge) is a footbridge spanning the river Main in the city of Frankfurt, Germany, which connects the centre of Frankfurt with the district of Sachsenhausen",
                "Mainkai",
                "39",
                "60311",
                "Frankfurt am Main"));
        attractions.add(new Attraction("Main Turm",
                "With 200 meter the Main Tower is one of the highest buildings in Frankfurt. Climb to the top for incomparable views of the city.",
                "Neue Mainzer Str.",
                "52 - 58",
                "60311",
                "Frankfurt am Main"));
        attractions.add(new Attraction("Hauptwache",
                "An outdoor shopping area amidst historic buildings in the city center of Frankfurt.",
                "An der Hauptwache",
                "",
                "60311",
                "Frankfurt am Main"));
        attractions.add(new Attraction("Kleinmarkthalle",
                "The Kleinmarkthalle is a covered market hall with 60+ vendors selling a variety of groceries, plus flowers, wine & prepared foods.",
                "Hasengasse",
                "5-7",
                "60311",
                "Frankfurt am Main"));
        attractions.add(new Attraction("SachsenHausen",
                "A historic cobble-stoned neighborhood in Frankfurt located along the south bank of the Main River.",
                "",
                "",
                "60596",
                "Frankfurt am Main"));
        attractions.add(new Attraction("Alte Oper",
                "Destroyed by Allied bombing in 1944, Frankfurt's beautifully reconstructed opera house was reopened in 1981. It's now a major venue for concerts and operas.",
                "Opernplatz",
                "1",
                "60311",
                "Frankfurt am Main"));
        attractions.add(new Attraction("Palmengarten",
                "Botanical garden with some 50 acres of tropical trees, orchids and ferns.",
                "Siesmayerstr.",
                " 61",
                "60323",
                "Frankfurt am Main"));
        attractions.add(new Attraction("Alte Nikolaikirche",
                "This historic cathedral served as the church for local leaders from the 15th century on and today serves as the home of a Lutheran congregation.",
                "Roemerberg",
                "11",
                "60311",
                "Frankfurt am Main"));
        attractions.add(new Attraction("Paulskirche",
                "This church is where Germany's kings and emperors have been crowned since 1253.",
                "Paulsplatz",
                "11",
                "60311",
                "Frankfurt am Main"));
        attractions.add(new Attraction("Goethe Hause",
                "The house in which the legendary German writer Johann Wolfgang von Goethe lived his early years.",
                "Grosser Hirschgraben",
                "23 - 25",
                "60311",
                "Frankfurt am Main"));


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