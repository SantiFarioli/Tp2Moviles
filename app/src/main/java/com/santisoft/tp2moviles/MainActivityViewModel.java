package com.santisoft.tp2moviles;

import android.app.Application;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public void buscarLibro(String libro) {
        if (libro.isEmpty()) {
            Toast.makeText(getApplication(), "Por Favor Ingrese un Libro", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(getApplication(),DetalleActivity.class);
            intent.putExtra("libro",libro);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            getApplication().startActivity(intent);
        }
    }

}
