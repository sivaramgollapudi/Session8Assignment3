package com.sivaram.session8assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Create Object of GridView And Array List Holds Image Enums
    GridView imageHolderGridView;
    ArrayList<Integer> androidVersionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Type Cast GridView From Activity
        imageHolderGridView = (GridView) findViewById(R.id.imageHolderGridView);

        // Add Android Version Images to Array List.

        androidVersionList = new ArrayList<Integer>();
        androidVersionList.add(R.drawable.gingerbread);
        androidVersionList.add(R.drawable.honeycomb);
        androidVersionList.add(R.drawable.icecreamsandwich);
        androidVersionList.add(R.drawable.jellybean);
        androidVersionList.add(R.drawable.kitkat);
        androidVersionList.add(R.drawable.lollipop);

        // Create Object of Image Adapter and Set Adapter to GridView
        ImageAdapter androidVersionsAdapter = new ImageAdapter(MainActivity.this,androidVersionList);
        imageHolderGridView.setAdapter(androidVersionsAdapter);

    }
}
