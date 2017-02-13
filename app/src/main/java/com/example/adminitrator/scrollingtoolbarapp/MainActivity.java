package com.example.adminitrator.scrollingtoolbarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private ImageButton mFabButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
        mFabButton = (ImageButton) findViewById(R.id.fabButton);
        initRecyclerView();
    }
    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        setTitle(getString(R.string.app_name));
        mToolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(createItemList());
        recyclerView.setAdapter(recyclerAdapter);
    }

}
