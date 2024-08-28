package com.santisoft.tp2moviles.modelo;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private String genero;
    private String prologo;
    private int foto;

    public Libro(String titulo, String autor, int anio, String genero, String prologo, int foto) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
        this.prologo = prologo;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPrologo() {
        return prologo;
    }

    public void setPrologo(String prologo) {
        this.prologo = prologo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
