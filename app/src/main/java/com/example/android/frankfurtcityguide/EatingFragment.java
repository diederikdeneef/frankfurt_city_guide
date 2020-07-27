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
                "Frankfurter Würstchen",
                "A Frankfurter sausage is a thin parboiled sausage made of pure pork in a casing of sheep's intestine. The special taste is acquired by a special method of low temperature smoking. For consumption, Frankfurters are not cooked; they are only heated in hot water for about eight minutes which prevents the skin from bursting. They are traditionally served with bread, mustard, horseradish and/or potato salad.",
                R.drawable.frankfurter_wuerstchen));
        localCuisine.add(new Attraction(
                "Grüne Soße",
                "Frankfurt Green Sauce is a cold sauce similar to a green sauce that is made with finely chopped herbs of certain types, origins and compositions. This fresh herb composition has been a special product with a protected geographical indication since 2016, while the preparation of the actual sauce varies.",
                R.drawable.gruene_sosse));
        localCuisine.add(new Attraction(
                "Frankfurter Rippchen mit Sauerkraut",
                "Frankfurter Rippchen mit Kraut (hot cured cutlet with sauerkraut) is a traditional dish served in and around Frankfurt am Main, Germany. It consists of cured pork cutlets, slowly heated in sauerkraut or meat broth, and usually served with sauerkraut, mashed potatoes and yellow mustard.",
                R.drawable.frankfurter_rippchen));
        localCuisine.add(new Attraction(
                "Handkäs' mit Musik",
                "Handkäs is a regional sour milk cheese and a culinary speciality of Frankfurt and other parts of Hessen. It is often served as an appetizer or as a snack with Apfelwein and is traditionally topped with chopped onions, locally known as \"Handkäse mit Musik\" (literally: hand cheese with music).",
                R.drawable.handkaese_mit_musik));
        localCuisine.add(new Attraction(
                "Apfelwein - Ebbelwei, Schoppe oder Stöffche",
                "Apple wine has been Frankfurt's most popular beverage for over 250 years. Locals traditionally enjoy it at the city's rustic apple wine pubs, where it is served in an earthenware jug, commonly referred to as the \"bembel\", and drunk from a special ribbed glass, known as the \"gerippte\".",
                R.drawable.apfelwein));
        localCuisine.add(new Attraction(
                "Frankfurter Kranz",
                "The Frankfurter Kranz is a sweet dessert made of a sponge cake in a ring shape covered in thick layers of buttercream and topped with caramel-covered brittle nuts, called Krokant.",
                R.drawable.frankfurter_kranz));

        // Create the recycler view
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        // Set a layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(layoutManager);

        // Set the adapter
        rvAdapter adapter = new rvAdapter(getContext(),localCuisine);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}