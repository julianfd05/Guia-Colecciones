/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_colecciones;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author JULI
 */
public class Ejercicio5_colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        TreeSet<String> paises=new TreeSet();
        
        String sel="";
        
        while (!sel.equals("2")){
            System.out.println("Ingrese un pais a la lista: ");
            paises.add(read.next());
            
            sel="";
            
            while (!sel.equals("1")&&!sel.equals("2")){
                
                System.out.println("¿Desea agregar otro pais?(1.Si/2.No)");
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
        
        System.out.println("Los paises ingresados son: ");
        for (String pais:paises){
            System.out.println(pais);
        }
        
        Iterator<String> i=paises.iterator();
        
        System.out.println("¿Que país desea eliminar de la lista?");
        String eliminar=read.next();
        eliminar=eliminar.toLowerCase();
        int sum=0;
        while (i.hasNext()){
            if (i.next().toLowerCase().equals(eliminar.toLowerCase())){
                i.remove();
                sum=sum+1;
            }
        }
        if (sum==0){
            System.out.println("El pais ingresado no fue encontrado");
        }
        System.out.println("Ahora la lista de paises queda de la siguiente manera:");
        for (String pais:paises){
            System.out.println(pais);
        }
        
        
    }
    
}
