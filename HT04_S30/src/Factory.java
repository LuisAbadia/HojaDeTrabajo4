/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoiceAndrea
 */
public class Factory {
    /**
     * @param opcion
     * @param opcion1
     * the command line arguments
     */
    public Factory(){
        
    }
    public StackAbstract getStack(int opcion, int opcion1){
        if (opcion==1){
            return new StackVector<Integer>();
        }
        else if (opcion==2){
            return new StackArrayList<Integer>();
        }
        else{
            return new StackLista<Integer>(opcion1);
        }
    }
    
    public ListaAbstract getLista(int opcion1){
        if (opcion1==1){
            return new Simple();
        }
        else if (opcion1==2){
            return new Circular();
        }
        else{
            return new Doble();
        }
    }
}
