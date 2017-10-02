/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayRepresentation;

/**
 *
 * @author AFauziS
 */

public class ArrayLinearList implements LinearList {

    protected Object [] element, data;
    protected int size;

    //edit constructor no 4
    public ArrayLinearList (int initialCapacity){
        if(initialCapacity < 1){
            System.out.println("false");
            throw new IllegalArgumentException("panjang array harus lebih dari 1");
        }
        
        element = new Object[initialCapacity];
        
        if(initialCapacity == element.length){
        element = ChangeArrayLength.changeLength1D(element, 2*initialCapacity);
        }
    }

    public ArrayLinearList(){
        this(10);
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
 
    public int size() {
        return size;
    }

    void checkIndex(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return element[index];
    }

    @Override
    public int indexOf(Object theElement) {
        for (int i = 0; i < size; i++){
            if(element[i].equals(theElement))
                return i;
        }
        return -1;
    }

    public Object remove(int index) {
        checkIndex(index);
        Object removedElement = element[index];
        for(int i = index + 1; i < size; i++){
            element[i-1] = element[i];
        }
        element[--size] = null;  
        return removedElement;
    }
    
    public void add(int index, Object theElement) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
        }

        if (size == element.length){
            ArrayLinearList news =  new ArrayLinearList(size);
        }

        if(element.length > size){
        for (int i = size - 1; i>= index; i--){
            element[i+1]= element[i];
        }
        
        element[index] = theElement;
        
        size++;}
    }
    
   
    public String toString(){
        
        StringBuffer s = new StringBuffer("[");
        

        for (int i = 0; i < size; i++){
            if (element[i] == null)
                s.append("null, ");
            else 
                s.append(element[i].toString() + ", ");
        }
        if (size > 0){
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        
        return new String(s);            
    }
    
    //no 5
    public void trimToSize(){
        data = new Object[size];
        if (size < element.length) {
           System.arraycopy(element, 0, data, 0, size);
                 
           element = data;
        }
    }
    
    //soal no 6
    public Object setSize(int in){
        if(size>in){
            int index = size - in;
            Object removed = element[in];
            for(int i=0; i<index;i++){
                for(int j = index + 1; j < size; j++)
                element[j-1] = element[j];

            element[--size] = null;
            }
            return removed;
        }
        else{
            data = new Object[in];
            System.arraycopy(element, 0, data, 0, size);
            element = data;
            
        }
        return size;
    }
    
    //no 8   
    public Object clear(){
        for(int i = 0; i<size; i++){
            element[i] = null;
        }
        return element;
    }
    
    
    //no9
    public Object removedrange(int index, int index2) {
        checkIndex(index);
        checkIndex(index2);
        
        if(index2 > index){
            for(int i = index2; i > index; i--){
            remove(i);
            }
        }
        
        else{
            System.out.println("Inputan index pertama harus lebih kecil dari yang kedua ");
        }
        
        return remove(index);
    }
    
    // no12
    public Object clone(Object[] copy){
        copy = new Object[size];
        copy = element.clone();
        return toString();
    }
}
