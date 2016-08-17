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
 * @author Estructura de Datos
 * @version 0.0
 * @date 24/07/2016
 * @file SinglyLinkedList.java
 * Implementa una lista enlazada
 * 
 */
public class Simple<E> extends ListaAbstract <E> {
    protected int count; // list size
	protected Nodo<E> head; // ref. to first element

	public Simple()
	// post: generates an empty list
	{
		head = null;
		count = 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFirst(E value){
		// post: value is added to beginning of list
		// note order that things happen:
		// head is parameter, then assigned
		// TODO Auto-generated method stub
		head = new Nodo<E>(value,head);
		count++;
		
	}

	@Override
	public void addLast(E value) {
		// post: adds value to end of list
		Nodo<E> temp = new Nodo<E>(value,null);
		if (head != null){
			Nodo<E> finger = head;
			while(finger.next() != null){
				finger = finger.next();
			}
			finger.setNext(temp);
		}
		else{
			head = temp;
		}
		count++;
	}

	@Override
	public E getFirst() {
		// pre: list is not empty
		// post: returns first value in list
		return head.value();
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		Nodo<E> newNode = new Nodo<E>(null); //creates the new node
		if (head != null){
			Nodo<E> finger = head;
			while (finger.next() != null){
				finger = finger.next();
			}
			return (E) finger;
		}else{
			return null;	
		}
		
	}

	@Override
	public E removeFirst() {
		// pre: list is not empty
		// post: removes and returns value from beginning of list
		Nodo<E> temp = head;
		head = head.next();
		count--;
		return temp.value();
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		Nodo<E> finger = head;
		Nodo<E> previous = null;
		while(finger.next() != null){
			previous = finger;
			finger = finger.next();
			}
		if(previous == null){
			head = null;
		}
		else{
			previous.setNext(null);
		}
		count--;
		return finger.value();
	}

	@Override
	public E remove(E value) {
		// post: removes and returns element equal to value
		// otherwise returns null
		Nodo<E> finger = head;
		Nodo<E> previous = null;
		
		while (finger.next() != null && !finger.value().equals(value)){
			previous = finger;
			finger = finger.next();
		}
		
		if (finger != null){
			if (previous == null){
				head = finger.next();
			}
			else{
				previous.setNext(finger.next());
			}
			count--;
			return finger.value();
		}
		else
			return null; //didn't find it
	}

	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() {
		
		return null;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(E value) {
		// pre: value is not null
		// post: returns true iff value is found in list
		Nodo<E> finger = head;
		while (finger != null && !finger.value().equals(value))
			finger = finger.next();
		return finger != null;
	}

	
	/* (non-Javadoc)
	 * @see IList#indexOf(java.lang.Object)
	 */
	@Override
	public int indexOf(E value) {
		  int indexOF = 0;
		  Nodo<E> finger = head;
		  
		  while (finger !=null)
		  { 
		    if (finger.equals(value))
		    {
		      return indexOF;
		    }
		    
		    indexOF++;
		    finger = finger.next();
		  }
		 return -1;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		Nodo<E> finger = head;
		String cadena = "";
		while (finger.next() != null){
			cadena += finger.value()+" ";
			finger = finger.next();
		}
		return cadena;
	}
	
	

    
}
