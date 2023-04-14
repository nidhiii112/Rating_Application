package com.nidhi.rating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
    }

    public void submit(View view) {
        float ratingvalue = ratingBar.getRating();

        if (ratingvalue < 2) {
            textView.setText("Rating " + ratingvalue + "\n\n we will try better next time");

        } else if (ratingvalue <= 3 && ratingvalue >= 2) {
            textView.setText("Rating " + ratingvalue + "\n\n  we are constantly improving");

        } else if (ratingvalue <= 4 && ratingvalue >= 3) {
            textView.setText("Rating " + ratingvalue + "\n\n Hoping for better improvment ");
        } else if (ratingvalue <= 5 && ratingvalue >= 4) {
            textView.setText("Rating " + ratingvalue + "\n\n Thank you for the feedback");
        }
    }
}