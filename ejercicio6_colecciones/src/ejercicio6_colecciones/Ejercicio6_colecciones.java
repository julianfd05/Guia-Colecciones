/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author JULI
 */
public class Ejercicio6_colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        HashMap<String,Double> productos=new HashMap();
        String nombre;
        Double precio;
        int sum;
        
        System.out.println("MENU DE OPCIONES");
        System.out.println("1.Ingresar producto");
        System.out.println("2.Modificar precio");
        System.out.println("3.Eliminar producto");
        System.out.println("4.Ver listado de productos");
        System.out.println("5.Salir del sistema");
        String sel="";
        while (!sel.equals("5")){
            System.out.println("");
            System.out.println("Seleccione número de opcion: ");
            sel=read.next();
            switch (sel){
                case "1":
                    System.out.println("Ingrese nombre del nuevo producto:");
                    nombre=read.next();
                    System.out.print("Ingrese precio del producto: $");
                    precio=read.nextDouble();
                    productos.put(nombre,precio);
                    break;
                case"2":
                    System.out.println("Ingrese el nombre del producto para modificar su precio");
                    nombre=read.next();
                    sum=0;
                    for(Map.Entry<String,Double> entry: productos.entrySet()){
                        if (entry.getKey().equals(nombre)){
                            System.out.println("Ingrese el nuevo precio del producto");
                            precio=read.nextDouble();
                            entry.setValue(precio);
                            sum++;
                        }
                    }
                    if (sum==0){
                        System.out.println("El producto ingresado no se encuentra dentro del listado");
                    }
                    break;
                case "3":
                    System.out.println("Ingrese el nombre del producto que desea eliminar:");
                    nombre=read.next();
                    productos.remove(nombre);
                    break;
                case "4":
                    System.out.println("Los productos en el listado son:");
                    for (Map.Entry<String,Double> entry: productos.entrySet()){
                        System.out.println(entry.getKey()+"     $"+entry.getValue());
                    }
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Seleccion incorrecta");
            }
        }
    }
    
}
