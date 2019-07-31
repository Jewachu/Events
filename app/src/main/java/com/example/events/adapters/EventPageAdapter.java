package com.example.events.adapters;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.events.DetailFragment;
import com.example.events.models.Event;

import java.util.ArrayList;

public class EventPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Event> mEvents;

    public EventPageAdapter(FragmentManager fm,ArrayList<Event> mEvents){
        super(fm);
        mEvents = mEvents;
    }

    @Override
    public Fragment getItem(int position) {
        return DetailFragment.newInstance(mEvents.get(position));
    }

    @Override
    public int getCount() {
        return mEvents.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mEvents.get(position).getName().getText();
    }
}
