package arrayList;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Class explaining the usage of ArrayList
 * 
 * ArrayList supports dynamic arrays that can grow as needed.
 * Entries in Array list will be stored sequentially in the memory
 * Not good if list needs to be manipulated many times
 * Access each entry directly without iterating through the entire list
 * ArrayLis is used for Storing and accessing
 * 
 * @author prithviMandula
 */
public class ArrayList_Example {

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();

        data.add("Adding");
        data.add("Elements");
        data.add("to");
        data.add("ArrayList");

        // Using an Iterator
        System.out.println("Printing Array List using Iterator");
        Iterator<String> itr = data.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Using advanced for loop
        System.out.println("Printing Array List using For loop");
        for(String word : data) {
            System.out.println(word);
        }

        // Using Java 8 Lambda Expression
        System.out.println("Printing Array List using Java 8 Lambda Expressions");
        data.forEach((word)-> {
            System.out.println(word);
        });

        //Accessing an Entry through Index
        System.out.println("Entry at index one is " + data.get(1));
    }
}
