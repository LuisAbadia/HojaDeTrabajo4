/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuisEstuardo
 */

import java.util.Iterator;

/**
 * @author Julio
 *
 * @param <E>
 */

public class Doble<E> extends ListaAbstract <E>{
    
	protected DobleNodo<E> head;
	protected DobleNodo<E> tail;

	/**
	 * Instantiates a new doblemente enlazada.
	 */
	public Doble() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
		cont = 0;
	}


	/**
	 * @see InterfazLista#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		head = new DobleNodo<E>(value,head,null);	
		
		if (tail == null){
			tail = head;
		}
		cont ++;
	}


	/**
	 * @see InterfazLista#removeFirst()
	 */
	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		DobleNodo<E> temp = head;
		head = head.next();
		cont--;
		return temp.value();
	}


	/**
	 * @see InterfazLista#removeLast()
	 */
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		DobleNodo<E> temp = tail;
		tail = tail.previous();
		if(tail == null){
			head = null;
		}
		else{
			tail.setNext(null);
		}
		cont--;
		return temp.value();
	}


	/**
	 * @see InterfazLista#addLast(java.lang.Object)
	 */
	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		
		tail = new DobleNodo<E>(value,null,tail);
		
		if(head == null){
			head = tail;
		}
		cont++;
		
	}


	/**
	 * @see InterfazLista#getFirst()
	 */
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return head.value();
	}


	/**
	 * @see InterfazLista#getLast()
	 */
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return tail.value();
	}


	/**
	 * @see InterfazLista#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		DobleNodo<E> finger = head;
		while(finger != null && !finger.value().equals(value)){
			finger.next();
		}
		return finger != null;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public E remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int lastIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public E set(int i, E o) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(int i, E o) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
