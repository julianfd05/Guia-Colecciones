/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author JULI
 */
public class Ejercicio1_colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 1
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas=new ArrayList();
        
        String sel="";
        
        
        while (!sel.equals("2")) {
            System.out.println("Ingrese el nombre de una raza de perros:");
            razas.add(read.next());
            sel="";
            while (!sel.equals("1")&&!sel.equals("2")){
                System.out.println("¿Desea agregar otra raza de perros?(1.Si/2.No)");
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
        System.out.println("Las razas de perros ingresadas son:");
        for (String raza:razas){
            System.out.println(raza);
        }
        
        ///EJERCICIO 2
        //creo el iterator
        Iterator<String> i= razas.iterator();
        
        
        System.out.println("¿Que raza desea eliminar de la lista?");
        String eliminar=read.next();
        int sum=0;
        
        while (i.hasNext()){
            //busco la raza para eliminarla de la lista
            if (i.next().equals(eliminar)){
                i.remove();
                sum++;
            }   
        }
        
        if (sum==0) {
            System.out.println("La raza ingresada no se encontro en la lista");
        }
        Collections.sort(razas);
        System.out.println("Ahora la lista ordenada es:");
        for (String raza:razas){
            System.out.println(raza);
        }
    }
    
}
