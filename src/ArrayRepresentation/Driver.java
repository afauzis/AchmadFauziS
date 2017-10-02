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
public class Driver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayLinearList x = new ArrayLinearList();
        Object[] data = new Object[2];
        x.add(0, new Integer(4));
        x.add(0, new Integer(3));
        x.add(0, new Integer(2));
        x.add(0, new Integer(1));
        x.add(0, new Integer(0));
        
//        Iterator y = x.iterator();
//        while (y.hasNext()) 
//            System.out.println(y.next()+"");
        System.out.println(x.toString());
        x.removedrange(1, 3);
        System.out.println("Setelah remove range " +x.toString());
        x.clone((Object[]) x.element[x.size]);
        System.out.println("");
        x.setSize(5);
        x.clear();
        x.trimToSize();
        System.out.println(x.toString());
//        System.out.println(x.element.length);


//Untuk array 2D
        Object[][] name ={
            {"1","aku","manusia"},{"2","kau","juga"}
        }; 
        System.out.println("Panjang Array (Baris)= "+name.length);
        System.out.println("Panjang Array (Kolom) = "+name[0].length);
        
        //ganti array
        
        Object[][] change = ChangeArrayLength2.changeLength2D(name, 3, 3);
        
        System.out.println("Panjang Array Baris (ubah) = "+change.length);
        System.out.println("Panjang Array Kolom (ubah) = "+change[0].length);
        
        for (Object[] change2 : change) {
            for (int i = 0; i < change[0].length; i++) {
                System.out.println(change2[i]);
            }
        }
    }
    
}
