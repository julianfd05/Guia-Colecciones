/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_colecciones.entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author JULI
 */
public class Alumno {
    
    //atributos
    private String nombre;
    ArrayList<Integer> notas=new ArrayList();

    public Alumno() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    public void ingresarNotas(Alumno a){
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> lista=new ArrayList();
        System.out.println("Ingrese las 3 notas del alumno:");
        System.out.println("Nota 1:");
        lista.add(read.nextInt());
        System.out.println("Nota 2:");
        lista.add(read.nextInt());
        System.out.println("Nota 3:");
        lista.add(read.nextInt());
        
        a.setNotas(lista);
        
    }
    
    public double notaFinal(Alumno a){
        //guardo las notas en el array "lista"
        ArrayList<Integer> lista=a.getNotas();
        //creo un iterador para las notas
        Iterator<Integer> i=lista.iterator();
        //while para iterar y sumar las 3 notas en el acumulador sum
        double sum=0;
        while (i.hasNext()){
            sum=sum+i.next();
        }
        double nota_final=sum/3;
        
        return nota_final;
    }
    
    
}
