/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_colecciones;

import ejercicio3_colecciones.entidades.Alumno;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author JULI
 */
public class Ejercicio3_colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> alumnos=new ArrayList();
        
        String sel="";
        
        while (!sel.equals("2")){
            Alumno a=new Alumno();
            System.out.println("Ingrese el nombre del alumno:");
            a.setNombre(read.next());
            a.ingresarNotas(a);
            alumnos.add(a);
            sel="";
            
            while (!sel.equals("1")&&!sel.equals("2")){
                
                System.out.println("¿Desea agregar otro alumno?(1.Si/2.No)");
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
        
        sel="";
        
        while (!sel.equals("2")){
            
            System.out.println("Ingrese el nombre de un alumno para calcular la nota final:");
            String nombre=read.next().toLowerCase();
            sel="";
            double nota_final=0;
            int sum=0;
            
            for (Alumno al:alumnos){
                if (al.getNombre().toLowerCase().equals(nombre)){
                    nota_final=al.notaFinal(al);
                    System.out.println("La nota final de "+al.getNombre()+" es "+ nota_final);
                    sum=sum+1;
                }
            }
            if (sum==0){
                System.out.println("El alumno no fue encontrado en la lista");
            }
           
            while (!sel.equals("1")&&!sel.equals("2")){
                
                System.out.println("¿Desea calcular la nota final de otro alumno?(1.Si/2.No)");
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
    }
    
}
