package com.example.android.frankfurtcityguide;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ImageCreditsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_credits);

        // Data to populate the recycler view
        ArrayList<ImageCredits> imageCredits = new ArrayList<>();
        imageCredits.add(new ImageCredits(
                "Römerberg Frankfurt abends",
                "https://de.wikipedia.org/wiki/Datei:R%C3%B6merberg_Frankfurt_abends.jpg",
                "Thomas Wolf",
                "https://foto-tw.de/",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Frankfurter Dom Eiserner Steg",
                "https://commons.wikimedia.org/wiki/File:Frankfurter_Dom_Eiserner_Steg.jpg",
                "rupp.de",
                "https://commons.wikimedia.org/wiki/User:Rupp.de~commonswiki",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Frankfurt Am Main-Eiserner Steg-Ansicht vom Domturm-20101024",
                "https://commons.wikimedia.org/wiki/File:Frankfurt_Am_Main-Eiserner_Steg-Ansicht_vom_Domturm-20101024.jpg",
                "Mylius",
                "https://commons.wikimedia.org/wiki/User:Mylius",
                "CC BY-NC-ND 3.0",
                "https://creativecommons.org/licenses/by-nc-nd/3.0/",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Hauptwache Ffm April 2010 DSC 9367",
                "https://commons.wikimedia.org/wiki/File:Hauptwache_Ffm_April_2010_DSC_9367.jpg",
                "Eva K.",
                "https://commons.wikimedia.org/wiki/User:EvaK",
                "CC BY-NC-ND 3.0",
                "https://creativecommons.org/licenses/by-nc-nd/3.0/",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Kleinmarkthalle Frankfurt Einblick",
                "https://commons.wikimedia.org/wiki/File:Kleinmarkthalle_Frankfurt_Einblick.jpg",
                "Eva K.",
                "https://commons.wikimedia.org/wiki/User:EvaK",
                "CC BY-SA 2.5",
                "https://creativecommons.org/licenses/by-sa/2.5/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Apfelweinviertel",
                "https://commons.wikimedia.org/wiki/File:Apfelweinviertel.jpg",
                "Popie",
                "https://de.wikipedia.org/wiki/Benutzer_Diskussion:Popie",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Alte Oper Frankfurt abends 2011-07",
                "https://commons.wikimedia.org/wiki/File:Alte_Oper_Frankfurt_abends_2011-07.jpg",
                "Thomas Wolf",
                "https://foto-tw.de/",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Eingang Palmengarten Frankfurt",
                "https://commons.wikimedia.org/wiki/File:Eingang_Palmengarten_Frankfurt.JPG",
                "Anna16",
                "https://commons.wikimedia.org/wiki/User:Anna16",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Frankfurt Am Main-Alte Nikolaikirche-Detail der Dachgalerie-20081230",
                "https://commons.wikimedia.org/wiki/File:Frankfurt_Am_Main-Alte_Nikolaikirche-Detail_der_Dachgalerie-20081230.jpg",
                "Mylius",
                "https://commons.wikimedia.org/wiki/User:Mylius",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Paulskirche from Frankfurter Dom during Weihnachtsmarkt 2012",
                "https://commons.wikimedia.org/wiki/File:Paulskirche_from_Frankfurter_Dom_during_Weihnachtsmarkt_2012.jpg",
                "Julie Anne Workman",
                "https://commons.wikimedia.org/wiki/User:Julia_W",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Bildergalerie@Goethe-Haus Frankfurt a.M.20170819",
                "https://commons.wikimedia.org/wiki/File:Bildergalerie@Goethe-Haus_Frankfurt_a.M.20170819.jpg",
                "Hajotthu",
                "https://commons.wikimedia.org/wiki/User:Hajotthu",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Museumsufer-teil3-ffm001",
                "https://commons.wikimedia.org/wiki/File:Museumsufer-teil3-ffm001.jpg",
                "dontworry",
                "https://commons.wikimedia.org/wiki/User:Dontworry",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Rembrandt - The Blinding of Samson - WGA19097",
                "https://commons.wikimedia.org/wiki/File:Rembrandt_-_The_Blinding_of_Samson_-_WGA19097.jpg",
                "Web Gallery of Art",
                "https://en.wikipedia.org/wiki/Web_Gallery_of_Art",
                "Public Domain",
                "https://en.wikipedia.org/wiki/Public_domain",
                "crop "));
        imageCredits.add(new ImageCredits(
                "LA-Triceratops mount-2",
                "https://commons.wikimedia.org/wiki/File:LA-Triceratops_mount-2.jpg",
                "Allie_Caulfield",
                "",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Frankfurt Am Main-Saalhof-Ansicht vom Eisernen Steg",
                "https://commons.wikimedia.org/wiki/File:Frankfurt_Am_Main-Saalhof-Ansicht_vom_Eisernen_Steg.jpg",
                "Mylius",
                "https://commons.wikimedia.org/wiki/User:Mylius",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Frankfurt Deutsches Architektur Museum.20130603",
                "https://commons.wikimedia.org/wiki/File:Frankfurt_Deutsches_Architektur_Museum.20130603.jpg",
                "Epizentrum",
                "https://commons.wikimedia.org/wiki/User:Epizentrum",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "National park stone tools",
                "https://commons.wikimedia.org/wiki/File:National_park_stone_tools.jpg",
                "U.S. National Park Service",
                "https://en.wikipedia.org/wiki/National_Park_Service",
                "Public Domain",
                "https://www.nps.gov/aboutus/disclaimer.htm",
                "crop "));
        imageCredits.add(new ImageCredits(
                "H Hoffmann Struwwel 03",
                "https://commons.wikimedia.org/wiki/File:H_Hoffmann_Struwwel_03.jpg",
                "Heinrich Hoffmann",
                "https://en.wikipedia.org/wiki/Heinrich_Hoffmann_(author)",
                "Public Domain",
                "https://en.wikipedia.org/wiki/Public_domain",
                "crop "));
        imageCredits.add(new ImageCredits(
                "boy children drawing female girl kids male",
                "https://pixabay.com/vectors/boy-children-drawing-female-girl-1298788/",
                "OpenClipart-Vectors",
                "https://pixabay.com/users/openclipart-vectors-30363/?utm_source=link-attribution&utm_medium=referral&utm_campaign=image&utm_content=1298788",
                "Pixabay License",
                "https://pixabay.com/service/license/",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Frankfurt Am Main-Untermainkai 15 von Suedwesten-20100808",
                "https://commons.wikimedia.org/wiki/File:Frankfurt_Am_Main-Untermainkai_15_von_Suedwesten-20100808.jpg",
                "Mylius",
                "https://commons.wikimedia.org/wiki/User:Mylius",
                "CC BY-NC-ND 3.0",
                "https://creativecommons.org/licenses/by-nc-nd/3.0/",
                "crop "));
        imageCredits.add(new ImageCredits(
                "The English Theatre Ffm DSC 0808",
                "https://commons.wikimedia.org/wiki/File:The_English_Theatre_Ffm_DSC_0808.jpg",
                "Eva K.",
                "https://commons.wikimedia.org/wiki/User:EvaK",
                "CC BY-NC-ND 3.0",
                "https://creativecommons.org/licenses/by-nc-nd/3.0/",
                "crop "));
        imageCredits.add(new ImageCredits(
                "OperFrankfurtZuschauerraum.jpg",
                "https://commons.wikimedia.org/wiki/File:OperFrankfurtZuschauerraum.jpg",
                "Marcimarc",
                "",
                "Public Domain",
                "https://en.wikipedia.org/wiki/Public_domain",
                "crop "));
        imageCredits.add(new ImageCredits(
                "piano music black keyboard musical instrument",
                "https://pixabay.com/photos/piano-music-black-keyboard-musical-2222955/",
                "Jazzael Rod",
                "https://pixabay.com/users/jazz_rodv-1185914/?utm_source=link-attribution&utm_medium=referral&utm_campaign=image&utm_content=2222955",
                "Pixabay License",
                "https://pixabay.com/service/license/",
                "crop "));
        imageCredits.add(new ImageCredits(
                "drama comedy and tragedy theater performance",
                "https://pixabay.com/vectors/drama-comedy-and-tragedy-theater-312318/",
                "Clker-Free-Vector-Images",
                "https://pixabay.com/users/clker-free-vector-images-3736/?utm_source=link-attribution&utm_medium=referral&utm_campaign=image&utm_content=312318",
                "Pixabay License",
                "https://pixabay.com/service/license/",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Hubschrauberabstellplätze am Alten Flugplatz",
                "https://commons.wikimedia.org/wiki/File:Hubschrauberabstellpl%C3%A4tze_am_Alten_Flugplatz.jpg",
                "Nicolas17",
                "https://de.wikipedia.org/wiki/Benutzer:Nicolas17",
                "CC BY-SA 2.0 DE",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "FFM Grueneburgpark Rosskastanienbaum",
                "https://commons.wikimedia.org/wiki/File:FFM_Grueneburgpark_Rosskastanienbaum.jpg",
                "Frank Behnsen",
                "https://commons.wikimedia.org/wiki/User:Frank_Behnsen",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Frankfurt, Günthersburgpark, Wasserspiele",
                "https://commons.wikimedia.org/wiki/File:Frankfurt,_G%C3%BCnthersburgpark,_Wasserspiele.JPG",
                "Karsten11",
                "https://commons.wikimedia.org/wiki/User:Karsten11",
                "Public Domain",
                "https://en.wikipedia.org/wiki/Public_domain",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Enkheimer Ried",
                "https://commons.wikimedia.org/wiki/File:Enkheimer_Ried.jpg",
                "S. Kasten",
                "https://commons.wikimedia.org/wiki/User:Melkom",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "giraffe animal facial expression mimic neck mammal",
                "https://pixabay.com/photos/giraffe-animal-facial-expression-614141/",
                "Christine Sponchia",
                "https://pixabay.com/users/sponchia-443272/?utm_source=link-attribution&utm_medium=referral&utm_campaign=image&utm_content=614141",
                "Pixabay License",
                "https://pixabay.com/service/license/",
                "crop "));
        imageCredits.add(new ImageCredits(
                "woman sitting poolside swimming pool female girl",
                "https://pixabay.com/photos/woman-sitting-poolside-swimming-918532/",
                "Free-Photos from Pixabay",
                "https://pixabay.com/photos/?utm_source=link-attribution&utm_medium=referral&utm_campaign=image&utm_content=918532",
                "Pixabay License",
                "https://pixabay.com/service/license/",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Frankfurter wuerstchen",
                "https://commons.wikimedia.org/wiki/File:Frankfurter_wuerstchen.jpg",
                "WordRidden / Jessica Spengler",
                "https://www.flickr.com/photos/wordridden/3456404501/",
                "CC BY 2.0",
                "https://creativecommons.org/licenses/by/2.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Grüne Soße Ei kartoffeln",
                "https://commons.wikimedia.org/wiki/File:Gr%C3%BCne_So%C3%9Fe_Ei_kartoffeln.JPG",
                "Benreis",
                "https://commons.wikimedia.org/wiki/User:Benreis",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Frankfurter-rippchen-mit-kraut-kpl.001-1",
                "https://commons.wikimedia.org/wiki/File:Frankfurter-rippchen-mit-kraut-kpl.001-1.jpg",
                "Dontworry",
                "https://commons.wikimedia.org/wiki/User:Dontworry",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Handkäse mit Musik 004ok",
                "https://commons.wikimedia.org/wiki/File:Handk%C3%A4se_mit_Musik_004ok.jpg",
                "Dominic Schwöbel",
                "",
                "CC BY-SA 2.5",
                "https://creativecommons.org/licenses/by-sa/2.5/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Apfelwein Geripptes Bembel",
                "https://commons.wikimedia.org/wiki/File:Apfelwein_Geripptes_Bembel.jpg",
                "Eva K.",
                "https://commons.wikimedia.org/wiki/User:EvaK",
                "CC BY-SA 2.5",
                "https://creativecommons.org/licenses/by-sa/2.5/deed.en",
                "crop "));
        imageCredits.add(new ImageCredits(
                "Frankfurter Kranz",
                "https://commons.wikimedia.org/wiki/File:Frankfurter_Kranz.JPG",
                "Claus Ableiter",
                "https://commons.wikimedia.org/wiki/User:Claus_Ableiter",
                "CC BY-SA 3.0",
                "https://creativecommons.org/licenses/by-sa/3.0/deed.en",
                "crop "));


        // Find the recycler view in the xml layout
        RecyclerView recyclerView = findViewById(R.id.image_credits_recyclerview);

        // Set a layout manager for the recycler view
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Set the recycler view adapter
        icAdapter adapter = new icAdapter(this, imageCredits);
        recyclerView.setAdapter(adapter);





    }
}
