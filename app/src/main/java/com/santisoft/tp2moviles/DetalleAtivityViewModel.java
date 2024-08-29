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
        listaLibros.add(new Libro("Martin Fierro","José Hernández",1872,"Poesia","El libro “El Gaucho Martín Fierro” es un poema narrativo escrito en verso por José Hernández en 1872. Se considera una obra literaria ejemplar del género gauchesco y tiene 2316 versos distribuidos en 13 cantos.", R.drawable.martin_fierro_1894));
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
           // mLibro.setValue
        }
    }




}
