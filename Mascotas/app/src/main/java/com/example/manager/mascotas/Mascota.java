package com.example.manager.mascotas;

/**
 * Created by manager on 27/05/16.
 */
public class Mascota
{
    private int foto;
    private int huesoBlanco;
    private String nombre;
    private String likes;
    private String fondo;

    public Mascota(int foto, String nombre, String likes) {
        this.foto = foto;
        this.nombre = nombre;
        this.likes = likes;
        //this.fondo = fondo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }

    public int getHuesoBlanco() {
        return huesoBlanco;
    }

    public void setHuesoBlanco(int huesoBlanco) {
        this.huesoBlanco = huesoBlanco;
    }
}
