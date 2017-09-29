/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayRepresentation;

import java.lang.reflect.Array;

/**
 *
 * @author AFauziS
 */
public class ChangeArrayLength2 {
    public static Object [][] changeLength2D(Object [][] a, int n, int o, int newLength, int newlength) {
        if(n > newLength){
            throw new IllegalArgumentException("new length too small");
        }
        if(o > newlength){
            throw new IllegalArgumentException("new length too small");
        }
        if(a!= null){
        Object [][] newArray = new Object[newLength][newlength];
            for(int i=0; a.length > i; i++){
                Object[] isi = a[i];
                newArray[i] = new Object[newlength];
                System.arraycopy(isi, 0, newArray[i], 0, isi.length);
            }
        return newArray;
        }
        return null;
    }
    
    public static Object [][] changeLength2D(Object [][] a, int newLength, int newlength) {
        return changeLength2D(a, a.length, a[0].length, newLength, newlength);
    }
}