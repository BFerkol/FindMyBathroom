package com.example.findmybathroom;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    // For the activity to implement
    public interface OnBathroomSelectedListener {
        void onBathroomSelected(int bathroomId);
    }


    // Reference to the activity
    private OnBathroomSelectedListener mListener;


    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);


        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnBathroomSelectedListener) {
            mListener = (OnBathroomSelectedListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnCitySelectedListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Notify activity of city selection
            String bathroomId = (String) view.getTag();
            mListener.onBathroomSelected(Integer.parseInt(bathroomId));
        }
    };

}
