package com.example.android.frankfurtcityguide;

import android.graphics.Color;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TextCreditsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_credits);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textCreditsView = (TextView) findViewById(R.id.text_credits);
        textCreditsView.setText(R.string.text_credits);
        Linkify.addLinks(textCreditsView, Linkify.ALL);
        textCreditsView.setLinkTextColor(Color.parseColor("#757575"));

    }
}
