package com.android.jokesandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;


/**
 * Created by kamalshree on 9/6/2018.
 */

public class MyJokesActivityFragment extends Fragment {


    public MyJokesActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout
        View v = inflater.inflate(R.layout.fragment_myjokes_activity, container, false);
        Intent i = getActivity().getIntent();

       /* String joke = i.getStringExtra("jokes");
        TextView textView = v.findViewById(R.id.tv_jokes);
        textView.setText(joke);*/

        String endpointJokes = getActivity().getIntent().getStringExtra("endpointJokes");
        TextView result_jokes = (TextView) v.findViewById(R.id.tv_jokes);
        result_jokes.setText(endpointJokes);

        return v;
    }
}