/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuisEstuardo
 */
public class StackLista<E> extends StackAbstract<E> {
    protected ListaAbstract<E> miStackLista;
    protected int tipo;
    protected Factory FactoryLista = new Factory();
    
    /**
     * @param type
     */
    public StackLista(int type){
    	tipo=type;
    	miStackLista= FactoryLista.getLista(tipo);
    	
    }

	/**
	 * @see ADTStack#push(java.lang.Object)
	 */

	public void Push(E Elemento) {
		// TODO Auto-generated method stub
		miStackLista.addLast(Elemento);
	}

	/**
	 * @see ADTStack#pop()
	 */
	@Override
	public E Pop() {
		// TODO Auto-generated method stub
		return miStackLista.removeLast();
	}

	/**
	 * @see ADTStack#size()
	 */
	@Override
	public int Size() {
		// TODO Auto-generated method stub
        return miStackLista.size();
	}


	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
