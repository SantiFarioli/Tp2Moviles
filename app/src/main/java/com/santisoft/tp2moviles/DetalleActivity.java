package com.santisoft.tp2moviles;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.santisoft.tp2moviles.databinding.ActivityDetalleBinding;
import com.santisoft.tp2moviles.modelo.Libro;

public class DetalleActivity extends AppCompatActivity {
private ActivityDetalleBinding binding;
private DetalleAtivityViewModel vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(DetalleAtivityViewModel.class);

        vm.getLibroLiveData().observe(this, new Observer<Libro>() {
            @Override
            public void onChanged(Libro libro) {
                binding.tvTitulo.setText(libro.getTitulo());
                binding.tvAnio.setText(libro.getAnio() + "");

            }
        });
    }
}