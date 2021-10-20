package sep4_javacollection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable2 {

	public static void main(String[] args) {
		Hashtable<Integer , String> ht=new 	Hashtable<Integer , String>();
		ht.put(22, "class");
		ht.put(33 , "");   // we can give empty value like this but we cannot give nullkey and null value 
	    ht.put(44, "sony");
	    ht.put(55, "sony");//we can give same values again but have to provide unique key
	    ht.put(225,"nani");
	    ht.put(143,"nani");
		
	Set hp=ht.entrySet();
	Iterator itr=hp.iterator();
	while(itr.hasNext()) {
		Map.Entry mp=(Map.Entry)itr.next();
		System.out.println(mp.getKey()+" "+mp.getValue());
		
	}
	
		
		
		
		
		
		
		
	}

}
