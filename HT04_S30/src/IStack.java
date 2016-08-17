/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoiceAndrea
 * @param <E>
 */
public interface IStack <E> {
    public void Push(E Element);
    public E Pop();
    public boolean isEmpty();
    public int Size();
    public E get();
}
