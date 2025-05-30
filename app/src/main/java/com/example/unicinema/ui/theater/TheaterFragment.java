package com.example.unicinema.ui.theater;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.unicinema.R;
import com.example.unicinema.databinding.FragmentTheaterBinding;

public class TheaterFragment extends Fragment {
    private FragmentTheaterBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TheaterViewModel theaterViewModel =
                new ViewModelProvider(this).get(TheaterViewModel.class);

        binding = FragmentTheaterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    };

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}