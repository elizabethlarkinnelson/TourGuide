package com.example.enelson.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Override tells the compiler that the following method overrides a method of its superclass
    // In this case, it would be the superclass of AppCompat Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the restaurants category in Main Activity
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

    }
}
