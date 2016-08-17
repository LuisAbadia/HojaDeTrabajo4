/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoiceAndrea
 */
import java.util.Scanner;
import java.io.*;
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
        int opcion1=0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Que desea utilizar?(ingrese el numero de la opcion) \n 1. Vector \n 2. ArrayList \n 3. Lista ");
        opcion = scan.nextInt();
        if (opcion==3){
            System.out.print("Que lista desea utilizar?(ingrese el numero de la opcion) \n 1. Doble \n 2. Simple \n 3. Doblemente Encadenada ");
            opcion1 = scan.nextInt();
        }
		
        Calculadora miCalculadora= new Calculadora(opcion, opcion1);
    }
    
}
