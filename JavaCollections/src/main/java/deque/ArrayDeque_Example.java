package deque;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * Class to understand ArrayDeque
 * 
 * Elements can be removed from both ends
 * Iterating over the data will give elements in order unlike PriorityQueue
 * @author prithvi
 *
 */
public class ArrayDeque_Example {

    public static void main(String[] args) {
        ArrayDeque<String> data = new ArrayDeque<String>();

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
        //You can see the output is in given order. Remember it is Array implementation
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

        //removes the last element of updated data
        data.removeLast();
        //Using Lambda Expressions
        data.forEach(language -> {
            System.out.println(language);
        });
    }
}
