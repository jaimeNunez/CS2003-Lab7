package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

//import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;


public final class LinkedListLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> firstList = new LinkedList<String>();
		firstList.add("Tulsa");
		firstList.add("Ada");
		firstList.add("Broken Arrow");
		firstList.addLast("Owasso");
		firstList.add(1, "OKC");
		ListIterator<String> firstIter = firstList.listIterator();
		//String theFirstListNext;
		//String theNext = firstIter.next();
		//String theNextnext = firstIter.next();
		
		

		//System.out.println(theNext);
		//System.out.println(theNextnext);
		
		//Second Linked List
		LinkedList<String> secondList = new LinkedList<String>();
		secondList.add("74104");
		secondList.add("74135");
		secondList.add("foo");
		secondList.add("hello world");
		secondList.add("777");
		ListIterator<String> secondIter = secondList.listIterator();
		String theSecondListNext;
		//String theSecondListNext = secondIter.next();
		//String theSecondListNextnext = secondIter.next();
		
		//Print the first & second lists
		firstIter.hasNext();
		System.out.println(firstList);
		System.out.println(secondList);
		//Loop to merge the elements from second list to the first list
		for(int i = 0; secondIter.hasNext(); i++ ) {
			//if i is an even number
			if((i%2) == 0)
			{
				//don't merge items
			}
			else {
				theSecondListNext = secondIter.next();
				firstList.add(i, theSecondListNext);
			}
		}
		

		System.out.println("The merged lists are shown below.");		
		System.out.println(firstList);
		

		String theNext;
		//Loop to remove every second word from the merged list
		for(int i = 0; firstIter.hasNext(); i++ ) {
			//if i is an even number
			if((i%2) == 0)
			{
				//don't remove even numbered items
				theNext = firstIter.next();
			}
			//otherwise delete every second word from the first list
			else {
				firstList.remove(i);
				theNext = firstIter.next();
			}
		}

		System.out.println("Removing every second word from the first list is shown below");
		System.out.println(firstList);
		
		//I wasn't able to create the deep copy because I ran out of time during the lab. 
		LinkedList<String> secondListDeepCopy = new LinkedList<String>();
		
	}

}
