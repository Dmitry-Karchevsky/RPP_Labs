package com.example.rpp_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SecondActivity extends AppCompatActivity {
    private static final int NUMBER = 1000000;
    private RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myRecyclerView = new RecyclerView(this);

        myRecyclerView.setAdapter(new myAdapter(this, NUMBER));
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myRecyclerView.setHasFixedSize(true);
        setContentView(myRecyclerView);
    }
}
