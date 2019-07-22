package com.example.events;

import android.content.Context;
import android.widget.ArrayAdapter;

public class EventAdapter  extends ArrayAdapter {
    private String[] mEventNames;
    private String[] mDate;
    private String[] mVenue;
    private Context mContext;
    public EventAdapter(Context mContext, int resource, String[] names, String[] date, String[] venue){
        super(mContext,resource);
        this.mContext = mContext;
        this.mEventNames = names;
        this.mDate = date;
        this.mVenue = venue;
    }
    @Override
    public Object getItem(int position){
        String eventName = mEventNames[position];
        String date = mDate[position];
        String venue = mVenue[position];
        return String.format("%s by %s in the database %s \n Duration : %s", eventName,date, venue);
    }

    @Override
    public int getCount(){
        return mEventNames.length;
    }
}
