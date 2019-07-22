package com.example.events;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FavouriteFragment extends Fragment{
    @BindView(R.id.textView5) TextView txtEvent;
    @BindView(R.id.textView6) TextView txtDate;
    @BindView(R.id.textView7) TextView txtVenue;
//    @BindView(R.id.lst_view) ListView  thisList;
    private static final String TAG = FavouriteFragment.class.getSimpleName();
//    private String[] events ;
//    private String[] dates ;
//    private String[] venue ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Favourite");
        View v =inflater.inflate(R.layout.fragment_favourite,container,false);
//        ButterKnife.bind(this,v);

//        EventAdapter adapter = new EventAdapter(getActivity(),android.R.layout.simple_list_item_1,events,dates,venue);
//        thisList.setAdapter(adapter);
        return v;
    }

//    @Override
//    public void applyTexts(String event, String date, String venue) {
//        txtEvent.setText(event);
//        txtDate.setText(date);
//        txtVenue.setText(venue);
//
//    }
}
