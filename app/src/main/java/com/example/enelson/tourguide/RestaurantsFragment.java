package com.example.enelson.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment(){
        //Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
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


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
