package linkedlist2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListClassroom {

public static void main(String args[]){
    Scanner giveName = new Scanner(System.in);
    System.out.println("Please enter name to add to list: ");

    LinkedList<String> classList = new LinkedList<String>();
    classList.add("Evan");
    classList.add("Brian");
    classList.add("Bob");
    classList.add("Mike");
    classList.add(giveName.next());
    System.out.println(classList);

    Scanner removeName = new Scanner(System.in);
    System.out.println("Please enter integer value for index position to remove: ");
    classList.remove(removeName.nextInt());

    System.out.println(classList);


}



}
