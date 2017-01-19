/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Денис
 */
public class CollectionTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = { 1,2,3,4,3,2,3,4,5,5,3,4,3,5,6,4,2,3};
        Map<Integer , Integer> repeatsCount = new HashMap<>();
        for( int a : array){
            Integer value = repeatsCount.get(a);

            if(value == null){
                repeatsCount.put(a, 1);
            }else{
                repeatsCount.put(a, value+1);
            }
        }
        System.out.println(repeatsCount);
        //  rep count
        Map<Integer,  List<Integer>> sortedByRepeats = new TreeMap<>();
        for( Map.Entry<Integer, Integer> entry : repeatsCount.entrySet() ){
            int repeats = entry.getValue();
            int value = entry.getKey();
            List<Integer> values = sortedByRepeats.get(repeats);
            if( values != null ){
                values.add(value);
            }else{
                sortedByRepeats.put(repeats, new LinkedList<Integer>(){
                    {
                        add(value);
                    }
                });
            }
        }
        System.out.println(sortedByRepeats);
        int index = 0;
        for( int repeats : sortedByRepeats.keySet() ){
            for(int value : sortedByRepeats.get(repeats) ){
                for(int i=0; i<repeats ;i++){
                    array[index++] = value;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    
}
