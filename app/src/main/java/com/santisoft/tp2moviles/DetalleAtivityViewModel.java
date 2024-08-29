package com.santisoft.tp2moviles;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.santisoft.tp2moviles.modelo.Libro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DetalleAtivityViewModel extends AndroidViewModel {
    private final ArrayList<Libro> listaLibros = new ArrayList<>();
    private final MutableLiveData<Libro> mLibro = new MutableLiveData<>();

    public DetalleAtivityViewModel(@NonNull Application application, MutableLiveData<Libro> mLibro) {
        super(application);

    }

    public LiveData<Libro> getLibroLiveData() {
        return mLibro;
    }

    public void cargarLibro(Intent intent) {
        String libro = intent.getStringExtra("Libro");
        if(libro!=null){
            for (Libro li : listaLibros) {
                if (li.getTitulo().equalsIgnoreCase(libro)){
                    mLibro.setValue(li);
                    return;
                }
            }
            mLibro.setValue(new Libro("No encontrado", "No encontrado", 0,"No encontrado","No encontrado", R.drawable.error));
        }
    }




}
