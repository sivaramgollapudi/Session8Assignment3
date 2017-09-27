package com.sivaram.session8assignment3;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by User on 27/09/2017.
 */

public class ImageAdapter extends BaseAdapter {

    // Private Variables for Application Context And List of Versions Object.
    private Context context;
    private List<Integer> imageList;

    // Context Custom Image Constructor
    public ImageAdapter(Context context, List<Integer> imageList) {
        this.context = context;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Object getItem(int position) {
        return imageList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        // Construct view By Inflating the Activity. This will allow the class to access
        // Views which are created in the Activity.
        View customView = view.inflate(context, R.layout.image_activity,null);

        // Type Cast Image View To Assign Android Version Image
        ImageView imgAndroidVersion = (ImageView) customView.findViewById(R.id.imgAndroidVersion);

        // Set Android Version Image to Image View By Row
        imgAndroidVersion.setImageResource(imageList.get(position));

        return customView;
    }
}
