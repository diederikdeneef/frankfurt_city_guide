package com.example.android.frankfurtcityguide;

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

        // Find textView and set text credit text
        TextView textCreditsView = (TextView) findViewById(R.id.text_credits);
        textCreditsView.setText(R.string.text_credits);

        // Make links clickable
        Linkify.addLinks(textCreditsView, Linkify.ALL);

        // Set link text color
        textCreditsView.setLinkTextColor(getResources().getColorStateList(R.color.textColor));
    }
}
