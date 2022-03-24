package com.example.lab3.ui.pedidos;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.lab3.MainActivity;
import com.example.lab3.R;
import com.example.lab3.databinding.FragmentHomeBinding;
import com.example.lab3.databinding.PedidosFragmentBinding;
import com.example.lab3.ui.home.HomeViewModel;

public class PedidosFragment extends Fragment {

    private PedidosViewModel mViewModel;
    private PedidosFragmentBinding binding;

    public static PedidosFragment newInstance() {
        return new PedidosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        PedidosViewModel pedidosViewModel =
                new ViewModelProvider(this).get(PedidosViewModel.class);

        binding = PedidosFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button b1 = root.findViewById(R.id.button);
        b1.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), MainActivity.class));
        });

        return root;
    }
}