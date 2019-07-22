package com.example.events;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AllDetail extends AppCompatActivity {
    @BindView(R.id.textView5) TextView txtEvent;
    @BindView(R.id.textView6) TextView txtDate;
    @BindView(R.id.textView7) TextView txtVenue;

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

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        Intent intent = getIntent();
      String event= intent.getStringExtra("event");
      String date = intent.getStringExtra("date");
      String venue = intent.getStringExtra("venue");
       txtEvent.setText(event);
        txtDate.setText(date);
        txtVenue.setText(venue);


    }

}
