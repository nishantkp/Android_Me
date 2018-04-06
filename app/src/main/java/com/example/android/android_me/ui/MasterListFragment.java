package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

public class MasterListFragment extends Fragment {

    public MasterListFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // inflate the fragment
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);
        List<Integer> mImageIds = AndroidImageAssets.getAll();

        // Create a new MasterListAdapter and set it on GridView
        MasterListAdapter adapter = new MasterListAdapter(getContext(), mImageIds);
        GridView masterGridView = (GridView) rootView.findViewById(R.id.master_grid_view);
        masterGridView.setAdapter(adapter);

        return rootView;
    }
}
