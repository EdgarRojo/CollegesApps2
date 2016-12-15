package com.example.csaper6.collegesapps2.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.csaper6.collegesapps2.Model.Profile;
import com.example.csaper6.collegesapps2.R;

/**
 * Created by csaper6 on 12/9/16.
 */
public class ProfileFragment extends Fragment {
    @Nullable //possible that the container could have a null
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        TextView firstName = (TextView) (rootView.findViewById(R.id.first_name));

        Profile f = new Profile("Samuel");
        firstName.setText(f.getFname());

        return rootView;

    }
}
