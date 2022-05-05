/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_colecciones.entidades;

import java.util.Comparator;

/**
 *
 * @author JULI
 */
public class Pelicula {
    //atributos
    private String titulo;
    private String director;
    private Double horas;

    public Pelicula() {
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getHoras() {
        return horas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + titulo + ", dirigida por " + director + ", con una duracion de " + horas +" horas "+ '}';
    }
    
    public static Comparator<Pelicula> compararHorasDescendente=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p2, Pelicula p1) {
            return p1.getHoras().compareTo(p2.getHoras());
        }
    };
    
    public static Comparator<Pelicula> compararHorasAscendente=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p2, Pelicula p1) {
            return p2.getHoras().compareTo(p1.getHoras());
        }
    };
    
    public static Comparator<Pelicula> compararTitulos=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p2, Pelicula p1) {
            return p2.getTitulo().compareTo(p1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> compararDirector=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p2, Pelicula p1) {
            return p2.getDirector().compareTo(p1.getDirector());
        }
    };
    
  
    
    
    
}
