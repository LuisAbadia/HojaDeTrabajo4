/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoiceAndrea
 */
public abstract class ListaAbstract <E> implements ILista<E> {
    protected int cont;
    
    public int getSize(){
        return cont;
    }
    
}
