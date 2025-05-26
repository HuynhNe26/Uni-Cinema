package com.example.unicinema.ui.gift;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.unicinema.R;
import com.example.unicinema.databinding.FragmentGiftBinding;
import com.example.unicinema.databinding.FragmentMovieBinding;
import com.example.unicinema.ui.movie.MovieViewModel;

public class GiftFragment extends Fragment {

    private FragmentGiftBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GiftViewModel giftViewModel =
                new ViewModelProvider(this).get(GiftViewModel.class);

        binding = FragmentGiftBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    };

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}