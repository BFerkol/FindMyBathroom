package com.example.findmybathroom;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {


    private Bathroom mBathroom;

    public static DetailsFragment newInstance(int bathroomId) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putInt("bathroomId", bathroomId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the city ID from the intent that started DetailsActivity
        int bathroomId = 1;
        if (getArguments() != null) {
            bathroomId = getArguments().getInt("bathroomId");
        }

        mBathroom = BathroomDatabase.getInstance(getContext()).getBathroom(bathroomId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        TextView nameTextView = view.findViewById(R.id.bathroomDescription);
        nameTextView.setText(mBathroom.getName());

        TextView descriptionTextView = view.findViewById(R.id.bathroomDescription);
        // setBathroom function in Bathroom Class that will need to be completed instead of setWeather!!!!!!!!!!!!!
        /*
        mBathroom.setWeather(getActivity(), descriptionTextView);
        */

        return view;
    }

}
