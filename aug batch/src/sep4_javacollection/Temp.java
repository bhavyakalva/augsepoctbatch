package sep4_javacollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Temp {

	public static void main(String[] args) {
	HashMap<Integer ,String> t1 =new HashMap<Integer ,String>();
	t1.put(11, null);
	t1.put(22, " ");
	t1.put(99, "rrr");
	t1.put(99, "jjj");
	t1.put(66, "jjj");
	t1.put(null, "hh");
	t1.put(222, null);
	
	Set shp=t1.entrySet();
	Iterator itr= shp.iterator();
	while(itr.hasNext()) {
		Map.Entry mp=(Map.Entry)itr.next();
		System.out.println(mp.getKey()+" "+mp.getValue());
	}
	
	
	

}
	


}