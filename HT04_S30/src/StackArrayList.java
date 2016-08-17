
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoiceAndrea
 */
public class StackArrayList<E> extends StackAbstract <E>{
protected ArrayList<E> miStackArrayList;
public StackArrayList(){
    miStackArrayList= new ArrayList();
    
}
    @Override
    public void Push(E Element) {
        miStackArrayList.add(Element);
    }

    @Override
    public E Pop() {
        int pos= miStackArrayList.size(); 
        return miStackArrayList.remove(pos-1); 
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
