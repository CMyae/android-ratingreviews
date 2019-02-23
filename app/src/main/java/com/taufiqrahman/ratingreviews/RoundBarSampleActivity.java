package com.taufiqrahman.ratingreviews;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.taufiqrahman.reviewratings.BarLabels;
import com.taufiqrahman.reviewratings.RatingReviews;
import java.util.Random;

public class RoundBarSampleActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_round_bar_sample);

    RatingReviews ratingReviews = (RatingReviews) findViewById(R.id.rating_reviews);

    int colors[] = new int[]{
        Color.parseColor("#0e9d58"),
        Color.parseColor("#bfd047"),
        Color.parseColor("#ffc105"),
        Color.parseColor("#ef7e14"),
        Color.parseColor("#d36259")};

    int raters[] = new int[]{
        new Random().nextInt(100),
        new Random().nextInt(100),
        new Random().nextInt(100),
        new Random().nextInt(100),
        new Random().nextInt(100)
    };

    ratingReviews.createRatingBars(100, BarLabels.STYPE1, colors, raters);
  }
}
