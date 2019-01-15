package com.varsha.screenlocktimetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.varsha.screenlocktimetracker.Adapters.ScreenLockAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mItemsView;
    private RecyclerView.Adapter mItemsAdapter;
    private RecyclerView.LayoutManager mItemsLayoutManager;
    private ArrayList<String> mItemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mItemsView = (RecyclerView) findViewById(R.id.items_view);
        mItemsView.setHasFixedSize(true);
        mItemsLayoutManager = new LinearLayoutManager(this);
        mItemsView.setLayoutManager(mItemsLayoutManager);

        mItemsList = new ArrayList<>();

        mItemsAdapter = new ScreenLockAdapter(getApplicationContext(), mItemsList);
        mItemsView.setAdapter(mItemsAdapter);
    }
}
