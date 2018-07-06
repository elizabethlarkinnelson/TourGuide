package com.example.enelson.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NeighborhoodsFragment extends Fragment {

    public NeighborhoodsFragment(){
        //Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.ponsonby, R.string.ponsonby_des, R.drawable.family_daughter));
        locations.add(new Location(R.string.parnell, R.string.parnell_des, R.drawable.family_grandmother));
        locations.add(new Location(R.string.britomart, R.string.britomart_des, R.drawable.family_mother));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}