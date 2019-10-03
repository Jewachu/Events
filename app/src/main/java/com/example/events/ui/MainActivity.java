package com.example.events.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.events.BaseDetailActivity;
import com.example.events.FavouriteFragment;
import com.example.events.HomeFragment;
import com.example.events.R;
import com.example.events.SignActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.Menu;
import android.view.MenuItem;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,new HomeFragment()).commit();

//        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
//                .setDefaultFontPath("fonts/FFF_Tusj.ttf")
//                .setFontAttrId(R.attr.fontPath)
//                .build()
//        );

    }

//    @Override
//    protected void attachBaseContext(Context newBase) {
//        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
//
//    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;
            switch (menuItem.getItemId()){
                case R.id.navigation_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.favourite_this:
                    selectedFragment = new FavouriteFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,selectedFragment).commit();
            return true;
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout:
                FirebaseAuth.getInstance().signOut();
                Intent thiz = new Intent(this, SignActivity.class);
                startActivity(thiz);
                break;
            case R.id.action_events:
                Intent calvince = new Intent(this, BaseDetailActivity.class);
                startActivity(calvince);
                break;

            case R.id.action_about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            case R.id.action_share:
                String packageName = getPackageName();
                String shareURL = "https://play.google.com/store/apps/details?id=" + packageName;
                Intent txtIntent = new Intent(Intent.ACTION_SEND);
                txtIntent.setType("text/plain");
                txtIntent.putExtra(Intent.EXTRA_TEXT,shareURL);
                startActivity(Intent.createChooser(txtIntent,"Events "));
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
