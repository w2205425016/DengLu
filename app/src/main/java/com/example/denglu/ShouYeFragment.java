package com.example.denglu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShouYeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShouYeFragment extends Fragment {
    private Button bt1;
    private ImageView bt2;
    private ViewFlipper mFilpper;
    private GestureDetector mDetector;
    private ImageView bt3;
    private ImageView bt4;
    ViewFlipper flipper;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shou_ye, container, false);

    }
}