package cap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MateriaNueva {
    
    public void claseCollections(){
        List<Integer> myList = new ArrayList<>();
        myList.add(6);
        myList.add(2);
        myList.add(-5);
        myList.add(66);
        myList.add(22);
        myList.add(12);
        
        for (Integer i : myList){
            System.out.print(i + " ");
        }
        System.out.println("");
        
        // Ordenar
        Collections.sort(myList);
        for (Integer i : myList){
            System.out.print(i + " ");
        }
        System.out.println("");
        
        // "Barajar" aleatoriamente
        Collections.shuffle(myList);
        for (Integer i : myList){
            System.out.print(i + " ");
        }
        System.out.println("");
        
        // Invertir el orden
        Collections.reverse(myList);
        for (Integer i : myList){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
