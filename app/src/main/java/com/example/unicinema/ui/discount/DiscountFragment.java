package com.example.unicinema.ui.discount;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.unicinema.R;
import com.example.unicinema.databinding.FragmentDiscountBinding;
import com.example.unicinema.databinding.FragmentGiftBinding;
import com.example.unicinema.ui.gift.GiftViewModel;

public class DiscountFragment extends Fragment {

    private FragmentDiscountBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DiscountViewModel discountViewModel =
                new ViewModelProvider(this).get(DiscountViewModel.class);

        binding = FragmentDiscountBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    };

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}