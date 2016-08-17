/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoiceAndrea
 */
public class DobleNodo <E> {
    protected E data; 
	protected DobleNodo<E> nextElement; 
	protected DobleNodo<E> previousElement;
	
	/**
	 * @param v
	 * @param next
	 * @param previous
	 */
	public DobleNodo(E v, DobleNodo<E> next, DobleNodo<E> previous) { 
		data = v; 
		nextElement = next; 
		previousElement = previous;
		if (nextElement != null){ 
			nextElement.previousElement = this; 
			previousElement = previous;
		}
		if (previousElement != null) {
			previousElement.nextElement = this;
		}
	}
	/**
	 * @param v
	 */
	public DobleNodo(E v){  
		// post: constructs a single element 
		this(v,null,null);
	}
	/**
	 * @return
	 */
	public DobleNodo<E> next() {
		// TODO Auto-generated method stub
		return nextElement;
	}
	/**
	 * @return
	 */
	public E value() {
		// TODO Auto-generated method stub
		return data;
	}
	/**
	 * @return
	 */
	public DobleNodo<E> previous() {
		// TODO Auto-generated method stub
		return previousElement;
	}
	
	/**
	 * @param next
	 */
	public void setNext(DobleNodo<E> next) {
	// post: sets reference to new next value  
		nextElement = next; 
	}

    
}
