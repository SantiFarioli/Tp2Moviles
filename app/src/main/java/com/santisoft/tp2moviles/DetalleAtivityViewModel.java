package com.santisoft.tp2moviles;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.santisoft.tp2moviles.modelo.Libro;

import java.util.ArrayList;

public class DetalleAtivityViewModel extends AndroidViewModel {
    private final ArrayList<Libro> listaLibros = new ArrayList<>();
    private final MutableLiveData<Libro> mLibro = new MutableLiveData<>();

    public DetalleAtivityViewModel(@NonNull Application application) {
        super(application);
        listaLibros.add(new Libro("Martin Fierro","José Hernández",1872,"Poesia","El libro “El Gaucho Martín Fierro” es un poema narrativo escrito en verso por José Hernández en 1872. Se considera una obra literaria ejemplar del género gauchesco y tiene 2316 versos distribuidos en 13 cantos.", R.drawable.martin_fierro));
        listaLibros.add(new Libro("Ficciones", "Jorge Luis Borges",1944,"ficcin literaria","El libro se divide en dos secciones llamadas El jardín de senderos que se bifurcan y Artificios. La división del libro en dos se debe a que la primera parte había sido publicada originalmente tres años antes, en 1941, como un libro individual.", R.drawable.ficciones));
        listaLibros.add(new Libro("El Aleph","Jorge Luis Borges",1945,"Cuento","El Aleph, escrito por Jorge Luis Borges en 1945, es una colección de diecisiete cuentos que exploran temas como la infinitud, la identidad, el tiempo y el espacio. El libro se considera uno de los más emblemáticos de la literatura fantástica latinoamericana y ha sido ampliamente analizado y estudiado.", R.drawable.aleph));
        listaLibros.add(new Libro("Rayuela", "Julio Cortázar",1963,"Ficción","Rayuela es una de las novelas más innovadoras y reconocidas de la literatura latinoamericana. Cortázar ofrece al lector la opción de leer la novela en varios órdenes, lo que permite múltiples interpretaciones y experiencias de la historia. Es un libro que explora la existencia humana, el amor, y la búsqueda de sentido en un mundo complejo.",R.drawable.rayuela));


    }

    public LiveData<Libro> getLibroLiveData() {
        return mLibro;
    }

    public void cargarLibro(Intent intent) {
        String libro = intent.getStringExtra("libro");
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
