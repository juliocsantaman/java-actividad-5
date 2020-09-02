/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Main {
    public static void main(String[] args) {
        
        /* 
            Creamos un objeto de la clase Operaciones
            y le pasamos dos valores para los atributos
            por medio del método constructor.
        */
        Operaciones ope = new Operaciones(9, 3);
        float x, y;
        x = ope.getX();
        y = ope.getY();
        
        /*
            Imprimimos por consola los resultados
            que nos dan las diferentes operaciones,
            son suma, resta, multiplicación, división
            y módulo.
        */
        System.out.println("***** Actividad 5 *****");
        System.out.println("Julio Cesar Santaman Cruz");
        System.out.println("Mostrando resultados de las siguientes operaciones:");
        System.out.println("La suma de "+ x + " + " + y + " es: " + ope.suma());
        System.out.println("La resta de "+ x + " - " + y + " es: " + ope.resta());
        System.out.println("La multiplicación de "+ x + " * " + y + " es: " + ope.multiplicacion());
        System.out.println("La división de "+ x + " / " + y + " es: " + ope.division());
        System.out.println("El módulo de "+ x + " % " + y + " es: " + ope.modulo());
        
    }
}
