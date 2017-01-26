package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Class to understand PriorityQueue
 * 
 * Data can be removed only from head
 * Iterating over the data donot give output in the order of adding the elements
 * but removing the data will be in order
 * 
 * @author prithvi
 *
 */
public class PriorityQueue_Example {

    public static void main(String[] args) {
        PriorityQueue<String> data = new PriorityQueue<String>();

        data.add("Java");
        data.add("C");
        data.add("C++");
        data.add("HTML");
        data.add("CSS");
        data.add("PHP");
        data.add("JavaScript");
        data.add("JQuery");
        data.add("AJAX");
        data.add("Python");

        //Using an Iterator
        //You can see the output is not in given order.
        //This is because iterator may not iterate in the order.
        //but poll and remove will only remove elements from top
        Iterator<String> itr = data.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Removes the Head element
        data.poll();
        //Using for loop
        for(String language : data) {
            System.out.println(language);
        }

        //removes the head element of updated data
        data.remove();
        //Using Lambda Expressions
        data.forEach(language -> {
            System.out.println(language);
        });
    }
}
