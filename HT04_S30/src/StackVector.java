
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoiceAndrea
 */
public class StackVector<E> extends StackAbstract<E> {
protected Vector<E> miStackVector;

public StackVector(){
    miStackVector= new Vector<E>();
}
    @Override
    public void Push(E Element) {
        miStackVector.add(Element);
    }

    @Override
    public E Pop() {
        E num = (E)miStackVector.lastElement();
        miStackVector.remove(num);
        return num;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
