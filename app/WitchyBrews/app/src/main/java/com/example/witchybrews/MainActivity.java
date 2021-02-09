package com.example.witchybrews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView featuredRecycler;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        featuredRecycler = findViewById(R.id.featured_recycler);

        featuredRecycler();
    }

    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelper> featuredImages = new ArrayList<>();

        featuredImages.add(new FeaturedHelper(R.drawable.milky, "Thing"));
        featuredImages.add(new FeaturedHelper(R.drawable.fruity, "Thing"));
        featuredImages.add(new FeaturedHelper(R.drawable.witchy, "Thing"));

        adapter = new FeaturedAdapter(featuredImages);
        featuredRecycler.setAdapter(adapter);


    }
}