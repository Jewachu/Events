package com.example.events;

import android.app.LauncherActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {
    @BindView(R.id.txt_ename)
    TextView txtText1;
    @BindView(R.id.btn_one)
    Button button;
    @BindView(R.id.edtLocation)
    EditText mLocationEditText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Home");
        View thisHome = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, thisHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = mLocationEditText.getText().toString();
                if (TextUtils.isEmpty(mLocationEditText.getText())){
                    mLocationEditText.setError("Input field");
                    Toast.makeText(getActivity(),"Please input this field",Toast.LENGTH_SHORT).show();
                }else {
                    FragmentManager manager = getFragmentManager();
                    SearchFragment searchFragment = SearchFragment.newFragmentInstance(location);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, searchFragment, "Details")
                            .addToBackStack(null).commit();
                }
            }
        });
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/FFF_Tusj.ttf");
        txtText1.setTypeface(typeface);
        return thisHome;
    }
}
