/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayRepresentation;

import java.util.NoSuchElementException;

/**
 *
 * @author AFauziS
 */
class ArrayLinearListIterator implements Iterator {
    private ArrayLinearList list;
    private int nextIndex;
    
    //constructor
    public ArrayLinearListIterator(ArrayLinearList theList){
        list = theList;
        nextIndex = 0;
    }
    public boolean hasNext(){
        return nextIndex < list.size;
    }
    public Object next(){
        if (nextIndex < list.size)
            return list.element[nextIndex++];
        else
            throw new NoSuchElementException("");
    }
    public void remove(){
        throw new UnsupportedOperationException("remove not supported");
    }
}

