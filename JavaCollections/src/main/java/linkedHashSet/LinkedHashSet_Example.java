package linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Class to understand LinkedHashSet
 * 
 * Order of insertion is maintained in LinkedHashSet
 * Duplicate items are not stored separately
 * Follows Hash algorithm
 * 
 * @author prithvi
 */
public class LinkedHashSet_Example {

    public static void main(String[] args) {
        LinkedHashSet<Integer> dataSet = new LinkedHashSet<Integer>();

        dataSet.add(12);
        dataSet.add(47);
        dataSet.add(54);
        dataSet.add(81);
        dataSet.add(22);
        dataSet.add(61);
        dataSet.add(4);
        dataSet.add(42);
        dataSet.add(12);
        dataSet.add(9);

        //Using an Iterator
        Iterator<Integer> itr = dataSet.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Using for loop
        for(Integer data : dataSet) {
            System.out.println(data);
        }

        //Using Lambda Expressions
        dataSet.forEach(data -> {
            System.out.println(data);
        });
    }
}
