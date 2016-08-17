/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoiceAndrea
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Calculadora implements ICalculadora {
    
    private String caracter;
    private Factory miFactory;
    private StackAbstract <Integer> StackFinal;
    
    
    
    public Calculadora(int opcion, int opcion1){
        miFactory= new Factory();
        StackFinal= miFactory.getStack(opcion, opcion1);
    }

    @Override
    public int Calcular(String Vector) {
        int res=0;
        String [] arreglo = Vector.split(" ");
        for(String chain: arreglo){
            try{StackFinal.Push(Integer.parseInt(chain));}
            catch(Exception e) {
                switch(chain){
                    case "+":
                        res=(int)StackFinal.Pop()+(int)StackFinal.Pop();
                        StackFinal.Push(res);
                    break;
                    case "-":
                        res=(int)StackFinal.Pop()-(int)StackFinal.Pop();
                        StackFinal.Push(res);
                    break;
                    case "*":
                        res=(int)StackFinal.Pop()*(int)StackFinal.Pop();
                        StackFinal.Push(res);
                    break;
                    case "/":
                        res=(int)StackFinal.Pop()/(int)StackFinal.Pop();
                        StackFinal.Push(res);
                    break;
                }
                
                
            }
        }
        
    return StackFinal.Pop();    
    }

    @Override
    public String LeerArchivo(String direccion) {
         String resultado="";
        try{
            BufferedReader br = new BufferedReader(new FileReader (direccion)); //BufferedReader es un objeto que puede leer archivos de texto y guardarlos en Strings
            String linea;   
        //Se repite un ciclo hasta que ya no hayan más lineas que leer
            while ((linea = br.readLine()) !=null){
           resultado = resultado + linea;
            }
        }    
       catch (Exception e) {
            System.out.println("NA");
        }
        return resultado;     
    }
    
}
