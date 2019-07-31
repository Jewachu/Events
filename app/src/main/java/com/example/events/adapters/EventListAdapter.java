package com.example.events.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.events.AllDetail;
import com.example.events.R;
import com.example.events.models.Event;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventViewHolder> {
    private ArrayList<Event> mEvents = new ArrayList<>();
    private Context mContext;

    public EventListAdapter(Context context,ArrayList<Event> eventS){
        mContext = context;
        mEvents = eventS;
    }

    @NonNull
    @Override
    public EventListAdapter.EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list_item,parent,false);
        EventViewHolder viewHolder = new EventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventListAdapter.EventViewHolder holder, int position) {
        holder.bindEvent(mEvents.get(position));
    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.eventImageView) ImageView mEventImageView;
        @BindView(R.id.eventNameTextView) TextView mNTameTextView;
        @BindView(R.id.eventDateTextView) TextView  mDateEventView;
        @BindView(R.id.vneTextView) TextView mVenueTextView;
        @BindView(R.id.monTextView) TextView mMonth;

        private Context mContent;

        public EventViewHolder(View view){
            super(view);
            ButterKnife.bind(this,view);
            mContent = view.getContext();
            itemView.setOnClickListener(this);
        }
        public void bindEvent(Event event){
            Picasso.get().load(event.getLogo().getUrl()).into(mEventImageView);
            mNTameTextView.setText(event.getName().getText());
            mDateEventView.setText(event.getPublished());
            mVenueTextView.setText(event.getVenueId());
            mMonth.setText(event.getStatus());
        }

        @Override
        public void onClick(View view) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContent, AllDetail.class);
            intent.putExtra("position",itemPosition);
            intent.putExtra("event", Parcels.wrap(mEvents));
            mContent.startActivity(intent);
        }
    }
}
