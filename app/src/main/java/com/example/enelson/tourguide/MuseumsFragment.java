package com.example.enelson.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment(){
        //Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create a list of restaurants
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.maritime_museum, R.string.maritime_des));
        locations.add(new Location(R.string.war_memorial, R.string.war_memorial_des));
        locations.add(new Location(R.string.transport_technology, R.string.transport_technology_des));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}