import java.util.Hashtable;
import java.util.Map;

public class HashTable_Creation 
{
 public static void main(String args[])
 {
	 Hashtable<Integer, String> ht = new Hashtable<>();
	 ht.put(1, "Vara");
	 ht.put(2, "Ravi");
	 ht.put(3, "Sujatha");
	 ht.put(4, "Bindu");
	 
	 
//	 Get Method
	 
	 System.out.println(ht.get(1));

//	getOrDefault
	 
	 System.out.println(ht.getOrDefault(10, "No such Index"));
	 
	 
//get Keys and Values 
	 for(Map.Entry m : ht.entrySet())
	 {
		 System.out.println(m.getKey()+" "+m.getValue());
	 }

// Remove from Hash Table
	 
	 ht.remove(1);
	 
	 for(Map.Entry m : ht.entrySet())
	 {
		 System.out.print(m.getKey()+" "+m.getValue());
	 }
	 
//putIfAbsent
	 ht.putIfAbsent(10, "Unnava");
	 
	 for(Map.Entry m : ht.entrySet())
	 {
		 System.out.println(m.getKey()+" "+m.getValue());
	 
 }
}
}
