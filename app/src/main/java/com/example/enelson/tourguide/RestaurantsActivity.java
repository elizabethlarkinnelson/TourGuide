package com.example.enelson.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Sets content view of xml file word_list
        setContentView(R.layout.word_list);

        //Create a list of restaurants
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.grove, R.string.grove_des));
        locations.add(new Location(R.string.depot, R.string.depot_des));
        locations.add(new Location(R.string.one_tree_grill, R.string.tree_grill_des));
        locations.add(new Location(R.string.french_cafe, R.string.french_cafe_des));
        locations.add(new Location(R.string.sugar_club, R.string.sugar_des));
        locations.add(new Location(R.string.baduzzi, R.string.baduzzi_des));
        locations.add(new Location(R.string.azabu, R.string.azabu_des));
        locations.add(new Location(R.string.amano, R.string.amano_des));
        locations.add(new Location(R.string.midnight_express, R.string.midnight_des));
        locations.add(new Location(R.string.oh_calcutta, R.string.calcutta_des));


        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
