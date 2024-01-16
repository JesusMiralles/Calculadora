/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Calculadora {

    
    public static void main(String[] args) {
        int numeros;
        int numero1;
        int numero2; 
        
    System.out.println("Introduce su primer Numero :");
    Scanner teclado = new Scanner (System.in);
    numero1 = teclado.nextInt();
    
    System.out.println("Introduzca otro numero :");
    numero2 = teclado.nextInt();
    
    System.out.println("Eliga que operacion quiera hacer con sus numeros :");
        System.out.println("(1) SUMAR"); 
        System.out.println("(2) Restar");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
    
        numeros = teclado.nextInt();
    
    switch (numeros) {
        case 1:
         System.out.println ("Esta es la SUMA de sus Dos Numeros : " + (numero1+numero2));
         break;
     case 2:
         System.out.println ("Esta es la RESTA de sus Dos Numeros : " + (numero1-numero2));
         break;
     case 3:
         System. out.println ("Esta es la MULTIPLICACION de sus Dos Numeros : "+ (numero1*numero2));
         break;
     case 4 :
         System.out.println ("Esta es la DIVISION de sus Dos Numeros : " + (numero1/numero2));
         break; 
           default:
         System.out.println ("Esa Operacion no esta disponible");
    teclado.close ();

    }
    }
    
}
