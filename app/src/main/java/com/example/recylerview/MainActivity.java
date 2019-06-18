package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recylerview.adapter.MovieAdapter;
import com.example.recylerview.model.Movie;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList<Movie> moviesList = new LinkedList<>();
        // Put initial data into the word list.
        for (int i = 0; i < 20; i++) {
            if (i%2 == 0) {
                moviesList.add(new Movie(R.mipmap.image, "title "+i, "desc "+i));
            } else {
                moviesList.add(new Movie(R.mipmap.image2, "title "+i, "desc "+i));
            }

        }

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        MovieAdapter movieAdapter = new MovieAdapter(this, moviesList);
        recyclerView.setAdapter(movieAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
