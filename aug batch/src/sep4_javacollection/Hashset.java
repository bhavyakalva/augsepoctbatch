package sep4_javacollection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset { //we dont use much this hashset

	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(10);
		hash.add(20);
		hash.add(60);
		hash.add(90);

		for (int name : hash) {
			System.out.println(name); //one way for printing value 
		}

		hash.add(null);// we can give null value only once in hashset

		System.out.println("after adding null and removing");
		System.out.println(hash);                    //one way to print all values in one line
		System.out.println(hash.size());            //to print size of the numbers 

	}
}
