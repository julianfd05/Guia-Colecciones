/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
        
        int sel=0;
        
        
        while (sel!=2) {
            System.out.println("Ingrese el nombre de una raza de perros:");
            razas.add(read.next());
            sel=0;
            while (sel!=1&&sel!=2){
                System.out.println("¿Desea agregar otra raza de perros?(1.Si/2.No)");
                sel=read.nextInt();
                switch (sel) {
                    case 1:
                        continue;
                    case 2:
                        sel=2;
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
        
        
    }
    
}
