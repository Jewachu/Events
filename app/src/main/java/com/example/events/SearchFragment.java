package com.example.events;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.events.adapters.EventListAdapter;
import com.example.events.models.Event;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;

public class SearchFragment extends Fragment {
    public static final String TAG = SearchFragment.class.getSimpleName();
    @BindView(R.id.recyclerView) RecyclerView mRecycleview;
    private EventListAdapter mAdapter;
    public static final String EXTRA_LOCATION = "com.example.events.location";
    public ArrayList<Event> eventSa = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Events");
        if (getArguments() != null) {
            String theLocation = (String) getArguments().getSerializable(EXTRA_LOCATION);
            getEvents(theLocation);
            Log.i(TAG, theLocation);
        }
            View thisView = inflater.inflate(R.layout.fragment_search,container,false);
            ButterKnife.bind(this,thisView);
        return thisView;
    }
    public static SearchFragment newFragmentInstance(String location){
        Bundle bundle = new Bundle();
        bundle.putSerializable(EXTRA_LOCATION, location);
        SearchFragment searchFragment = new SearchFragment();
        searchFragment.setArguments(bundle);
        return searchFragment;
    }
    private void getEvents(String location){
        final EventService eventService = new EventService();
        eventService.findEvents(location, new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
               eventSa = eventService.processResults(response);
               getActivity().runOnUiThread(new Runnable() {
                   @Override
                   public void run() {
                       mAdapter = new EventListAdapter(getContext(),eventSa);
                       mRecycleview.setAdapter(mAdapter);
                       RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
                       mRecycleview.setLayoutManager(layoutManager);
                       mRecycleview.setHasFixedSize(true);
                   }
               });
            }
        });
    }
}
