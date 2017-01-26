package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Class explaining the usage of LinkedList
 * 
 * In Linked list, each data entry will be stored randomly.
 * Each Entry contains data and also a pointer to the next entry.
 * Linked list is useful if the list is to be manipulated extensively
 * Cannot access entry directly, instead needs to be iterated to get an entry.
 * 
 * @author prithvi
 *
 */
public class LinkedList_Example {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Linked");
        list.add("List");
        list.add("Example");

        Iterator<String> itr = list.iterator();

        //Accessing data Using iterators
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Accessing data using for loop
        for(String word : list) {
            System.out.println(word);
        }

        //Accessing data using Lambda expressions
        list.forEach((word) -> {
            System.out.println(word);
        });
    }
}
