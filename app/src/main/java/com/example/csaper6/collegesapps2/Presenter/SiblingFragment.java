package com.example.csaper6.collegesapps2.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.csaper6.collegesapps2.Model.Sibling;
import com.example.csaper6.collegesapps2.R;


/**
 * Created by csaper6 on 12/13/16.
 */
public class SiblingFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_sibling, container, false);
        TextView firstName = (TextView) (rootView.findViewById(R.id.first_name2));

        Sibling g = new Sibling("Samuel", "Ng", 12, "brother");
        firstName.setText(g.getFirstName());

        return rootView;

    }
}
