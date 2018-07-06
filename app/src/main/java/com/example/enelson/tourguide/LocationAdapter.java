package com.example.enelson.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link android.widget.ArrayAdapter} that can provide
 * the list item layout based on the data source, which is a list of {@link Location} objects.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locations){
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);

        nameTextView.setText(currentLocation.getLocationNameId());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);

        descriptionTextView.setText(currentLocation.getLocationDescriptionId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.picture_image_view);

        if (currentLocation.hasImage()){
            imageView.setImageResource(currentLocation.getImageResourceId());

            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

