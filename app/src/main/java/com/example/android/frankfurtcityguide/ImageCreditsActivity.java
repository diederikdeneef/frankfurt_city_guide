package com.example.android.frankfurtcityguide;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ImageCreditsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_credits);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Image Credit data to populate the recycler view
        ArrayList<ImageCredits> imageCredits = new ArrayList<>();
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.romer_title),
                getApplicationContext().getString(R.string.romer_source),
                getApplicationContext().getString(R.string.romer_author),
                getApplicationContext().getString(R.string.romer_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.dom_title),
                getApplicationContext().getString(R.string.dom_source),
                getApplicationContext().getString(R.string.dom_author),
                getApplicationContext().getString(R.string.dom_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.eiserne_steg_title),
                getApplicationContext().getString(R.string.eiserne_steg_source),
                getApplicationContext().getString(R.string.eiserne_steg_author),
                getApplicationContext().getString(R.string.eiserne_steg_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_NC_ND_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_NC_ND_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.hauptwache_title),
                getApplicationContext().getString(R.string.hauptwache_source),
                getApplicationContext().getString(R.string.hauptwache_author),
                getApplicationContext().getString(R.string.hauptwache_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_NC_ND_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_NC_ND_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.kleinmarkthalle_title),
                getApplicationContext().getString(R.string.kleinmarkthalle_source),
                getApplicationContext().getString(R.string.kleinmarkthalle_author),
                getApplicationContext().getString(R.string.kleinmarkthalle_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_2_5),
                getApplicationContext().getString(R.string.license_CC_BY_SA_2_5_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.sachsenhausen_title),
                getApplicationContext().getString(R.string.sachsenhausen_source),
                getApplicationContext().getString(R.string.sachsenhausen_author),
                getApplicationContext().getString(R.string.sachsenhausen_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.alte_oper_title),
                getApplicationContext().getString(R.string.alte_oper_source),
                getApplicationContext().getString(R.string.alte_oper_author),
                getApplicationContext().getString(R.string.alte_oper_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.palmengarten_title),
                getApplicationContext().getString(R.string.palmengarten_source),
                getApplicationContext().getString(R.string.palmengarten_author),
                getApplicationContext().getString(R.string.palmengarten_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.nikolaikirche_title),
                getApplicationContext().getString(R.string.nikolaikirche_source),
                getApplicationContext().getString(R.string.nikolaikirche_author),
                getApplicationContext().getString(R.string.nikolaikirche_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.paulskirche_title),
                getApplicationContext().getString(R.string.paulskirche_source),
                getApplicationContext().getString(R.string.paulskirche_author),
                getApplicationContext().getString(R.string.paulskirche_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.goethe_haus_title),
                getApplicationContext().getString(R.string.goethe_haus_source),
                getApplicationContext().getString(R.string.goethe_haus_author),
                getApplicationContext().getString(R.string.goethe_haus_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.museum_ufer_title),
                getApplicationContext().getString(R.string.museum_ufer_source),
                getApplicationContext().getString(R.string.museum_ufer_author),
                getApplicationContext().getString(R.string.museum_ufer_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.stadel_museum_title),
                getApplicationContext().getString(R.string.stadel_museum_source),
                getApplicationContext().getString(R.string.stadel_museum_author),
                getApplicationContext().getString(R.string.stadel_museum_author_url),
                getApplicationContext().getString(R.string.license_public_domain),
                getApplicationContext().getString(R.string.license_public_domain_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.senckenberg_title),
                getApplicationContext().getString(R.string.senckenberg_source),
                getApplicationContext().getString(R.string.senckenberg_author),
                getApplicationContext().getString(R.string.senckenberg_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.history_museum_title),
                getApplicationContext().getString(R.string.history_museum_source),
                getApplicationContext().getString(R.string.history_museum_author),
                getApplicationContext().getString(R.string.history_museum_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.architecture_museum_title),
                getApplicationContext().getString(R.string.architecture_museum_source),
                getApplicationContext().getString(R.string.architecture_museum_author),
                getApplicationContext().getString(R.string.architecture_museum_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.archeology_museum_title),
                getApplicationContext().getString(R.string.archeology_museum_source),
                getApplicationContext().getString(R.string.archeology_museum_author),
                getApplicationContext().getString(R.string.archeology_museum_author_url),
                getApplicationContext().getString(R.string.license_public_domain),
                getApplicationContext().getString(R.string.license_public_domain_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.struwel_peter_museum_title),
                getApplicationContext().getString(R.string.struwel_peter_museum_source),
                getApplicationContext().getString(R.string.struwel_peter_museum_author),
                getApplicationContext().getString(R.string.struwel_peter_museum_author_url),
                getApplicationContext().getString(R.string.license_public_domain),
                getApplicationContext().getString(R.string.license_public_domain_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.junges_museum_title),
                getApplicationContext().getString(R.string.junges_museum_source),
                getApplicationContext().getString(R.string.junges_museum_author),
                getApplicationContext().getString(R.string.junges_museum_author_url),
                getApplicationContext().getString(R.string.license_pixabay),
                getApplicationContext().getString(R.string.license_pixabay_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.jewish_museum_title),
                getApplicationContext().getString(R.string.jewish_museum_source),
                getApplicationContext().getString(R.string.jewish_museum_author),
                getApplicationContext().getString(R.string.jewish_museum_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_NC_ND_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_NC_ND_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.english_theatre_title),
                getApplicationContext().getString(R.string.english_theatre_source),
                getApplicationContext().getString(R.string.english_theatre_author),
                getApplicationContext().getString(R.string.english_theatre_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_NC_ND_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_NC_ND_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.oper_title),
                getApplicationContext().getString(R.string.oper_source),
                getApplicationContext().getString(R.string.oper_author),
                getApplicationContext().getString(R.string.oper_author_url),
                getApplicationContext().getString(R.string.license_public_domain),
                getApplicationContext().getString(R.string.license_public_domain_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.jazzkeller_title),
                getApplicationContext().getString(R.string.jazzkeller_source),
                getApplicationContext().getString(R.string.jazzkeller_author),
                getApplicationContext().getString(R.string.jazzkeller_author_url),
                getApplicationContext().getString(R.string.license_pixabay),
                getApplicationContext().getString(R.string.license_pixabay_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.international_theatre_title),
                getApplicationContext().getString(R.string.international_theatre_source),
                getApplicationContext().getString(R.string.international_theatre_author),
                getApplicationContext().getString(R.string.international_theatre_author_url),
                getApplicationContext().getString(R.string.license_pixabay),
                getApplicationContext().getString(R.string.license_pixabay_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.alter_flugplatz_title),
                getApplicationContext().getString(R.string.alter_flugplatz_source),
                getApplicationContext().getString(R.string.alter_flugplatz_author),
                getApplicationContext().getString(R.string.alter_flugplatz_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_2_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_2_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.grueneburgpark_title),
                getApplicationContext().getString(R.string.grueneburgpark_source),
                getApplicationContext().getString(R.string.grueneburgpark_author),
                getApplicationContext().getString(R.string.grueneburgpark_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.guenthersburgpark_title),
                getApplicationContext().getString(R.string.guenthersburgpark_source),
                getApplicationContext().getString(R.string.guenthersburgpark_author),
                getApplicationContext().getString(R.string.guenthersburgpark_author_url),
                getApplicationContext().getString(R.string.license_public_domain),
                getApplicationContext().getString(R.string.license_public_domain_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.gruenguertel_title),
                getApplicationContext().getString(R.string.gruenguertel_source),
                getApplicationContext().getString(R.string.gruenguertel_author),
                getApplicationContext().getString(R.string.gruenguertel_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.zoo_title),
                getApplicationContext().getString(R.string.zoo_source),
                getApplicationContext().getString(R.string.zoo_author),
                getApplicationContext().getString(R.string.zoo_author_url),
                getApplicationContext().getString(R.string.license_pixabay),
                getApplicationContext().getString(R.string.license_pixabay_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.pool_title),
                getApplicationContext().getString(R.string.pool_source),
                getApplicationContext().getString(R.string.pool_author),
                getApplicationContext().getString(R.string.pool_author_url),
                getApplicationContext().getString(R.string.license_pixabay),
                getApplicationContext().getString(R.string.license_pixabay_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.frankfurter_wuerstchen_title),
                getApplicationContext().getString(R.string.frankfurter_wuerstchen_source),
                getApplicationContext().getString(R.string.frankfurter_wuerstchen_author),
                getApplicationContext().getString(R.string.frankfurter_wuerstchen_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_2_0),
                getApplicationContext().getString(R.string.license_CC_BY_2_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.gruene_sosse_title),
                getApplicationContext().getString(R.string.gruene_sosse_source),
                getApplicationContext().getString(R.string.gruene_sosse_author),
                getApplicationContext().getString(R.string.gruene_sosse_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.rippchen_title),
                getApplicationContext().getString(R.string.rippchen_source),
                getApplicationContext().getString(R.string.rippchen_author),
                getApplicationContext().getString(R.string.rippchen_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.handkaes_title),
                getApplicationContext().getString(R.string.handkaes_source),
                getApplicationContext().getString(R.string.handkaes_author),
                getApplicationContext().getString(R.string.handkaes_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_2_5),
                getApplicationContext().getString(R.string.license_CC_BY_SA_2_5_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.apfelwein_title),
                getApplicationContext().getString(R.string.apfelwein_source),
                getApplicationContext().getString(R.string.apfelwein_author),
                getApplicationContext().getString(R.string.apfelwein_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_2_5),
                getApplicationContext().getString(R.string.license_CC_BY_SA_2_5_URL),
                getApplicationContext().getString(R.string.image_modifications)));
        imageCredits.add(new ImageCredits(
                getApplicationContext().getString(R.string.frankfurter_kranz_title),
                getApplicationContext().getString(R.string.frankfurter_kranz_source),
                getApplicationContext().getString(R.string.frankfurter_kranz_author),
                getApplicationContext().getString(R.string.frankfurter_kranz_author_url),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0),
                getApplicationContext().getString(R.string.license_CC_BY_SA_3_0_URL),
                getApplicationContext().getString(R.string.image_modifications)));


        // Find the recycler view in the xml layout
        RecyclerView recyclerView = findViewById(R.id.image_credits_recyclerview);

        // Set a layout manager for the recycler view
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Set the recycler view adapter
        icAdapter adapter = new icAdapter(this, imageCredits);
        recyclerView.setAdapter(adapter);

        // Set a divider between the recyclerview items
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(
                recyclerView.getContext(), layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
    }
}
