package com.example.events;

import android.content.Intent;
import android.os.Bundle;

import com.example.events.adapters.EventPageAdapter;
import com.example.events.models.Event;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.view.View;
import android.widget.TextView;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AllDetail extends AppCompatActivity {
    @BindView(R.id.viewPager) ViewPager mViewPager;
    private EventPageAdapter eventPageAdapter;
    ArrayList<Event> mEvents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Details");
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ButterKnife.bind(this);
        mEvents = Parcels.unwrap(getIntent().getParcelableExtra("events"));
        int startingPosition = getIntent().getIntExtra("position",0);
        eventPageAdapter = new EventPageAdapter(getSupportFragmentManager(),mEvents);
        mViewPager.setAdapter(eventPageAdapter);
        mViewPager.setCurrentItem(startingPosition);





    }

}
