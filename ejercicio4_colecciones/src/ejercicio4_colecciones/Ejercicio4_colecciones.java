/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_colecciones;

import ejercicio4_colecciones.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author JULI
 */
public class Ejercicio4_colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> peliculas=new ArrayList();
        
        String sel="";
        
        while (!sel.equals("2")){
            Pelicula p=new Pelicula();
            System.out.println("Ingrese el titulo de la película: ");
            p.setTitulo(read.next());
            System.out.println("Ingrese el director de la película: ");
            p.setDirector(read.next());
            System.out.println("Ingrese la duración de la película en horas: ");
            p.setHoras(read.nextDouble());
            
            peliculas.add(p);
            sel="";
            
            while (!sel.equals("1")&&!sel.equals("2")){
                
                System.out.println("¿Desea agregar otra pelicula?(1.Si/2.No)");
                sel=read.next();
                
                switch (sel) {
                        case "1":
                            continue;
                        case "2":
                            sel="2";
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                }
            }
        }
        System.out.println("");
        System.out.println("Las películas ingresadas son:");
        for(Pelicula peli: peliculas){
            System.out.println(peli);
        }
        
        System.out.println("");
        System.out.println("Las películas ingresadas con una duracion mayor a una hora son:");
        for(Pelicula peli: peliculas){
            if (peli.getHoras()>1){
                System.out.println(peli);
            }    
        }
        
        System.out.println("");
        System.out.println("Las películas ordenadas de mayor a menor duracion son: ");
        peliculas.sort(Pelicula.compararHorasDescendente);
        for(Pelicula peli:peliculas){
            System.out.println(peli);
        }
        
        System.out.println("");
        System.out.println("Las películas ordenadas de menor a mayor duracion son: ");
        peliculas.sort(Pelicula.compararHorasAscendente);
        for(Pelicula peli:peliculas){
            System.out.println(peli);
        }
        
        System.out.println("");
        System.out.println("Las películas ordenadas alfabeticamente con respecto a su titulo son: ");
        peliculas.sort(Pelicula.compararTitulos);
        for(Pelicula peli:peliculas){
            System.out.println(peli);
        }
        
        System.out.println("");
        System.out.println("Las películas ordenadas alfabeticamente con respecto a su director son: ");
        peliculas.sort(Pelicula.compararDirector);
        for(Pelicula peli:peliculas){
            System.out.println(peli);
        }
       
    }
    
}
