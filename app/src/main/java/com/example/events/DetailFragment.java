package com.example.events;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.events.models.Event;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {
    @BindView(R.id.eventImageView) ImageView mImageLabel;
    @BindView(R.id.eventNameTextView) TextView mNameLabel;
    @BindView(R.id.eventDateTextView) TextView mDateLabel;
    @BindView(R.id.vneTextView) TextView mVenueLabel;
    @BindView(R.id.monTextView) TextView mMonthLabel;
    @BindView(R.id.descrTextView) TextView mDescriptionLabel;
    @BindView(R.id.saveEventButton) Button mSaveEventButton;

    private Event mThisEvent;
    public static DetailFragment newInstance(Event event){
        DetailFragment detailFragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("event", Parcels.wrap(event));
        detailFragment.setArguments(args);
        return detailFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mThisEvent = Parcels.unwrap(getArguments().getParcelable("event"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View thisView = inflater.inflate(R.layout.fragment_detail, container, false);
        ButterKnife.bind(this,thisView);
        Picasso.get().load(mThisEvent.getLogo().getUrl()).into(mImageLabel);
        mNameLabel.setText(mThisEvent.getName().getText());
        mDateLabel.setText(mThisEvent.getPublished());
        mVenueLabel.setText(mThisEvent.getVenueId());
        mMonthLabel.setText(mThisEvent.getStatus());
        mDescriptionLabel.setText(mThisEvent.getSummary());
        return thisView;
    }

}
