/**
 * 
 */
package basic.collectionFramework.vector;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author welcome
 *
 */
public class VectorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vectorExample = new Vector<>();
		vectorExample.add("vasam");
		vectorExample.add("veeraiah");
		vectorExample.add("naveen");
		vectorExample.add(1,"sarojana");
		Vector<String> vectorCustomer = new Vector<String>();
		vectorCustomer.add("vamshi");
		vectorCustomer.add("praveen");
		vectorCustomer.add("praveen");
		vectorCustomer.addAll(vectorCustomer);
		vectorCustomer.addAll(2,vectorCustomer);
		vectorCustomer.add("gani");
	Boolean avalible=vectorExample.contains("naveen");
	System.out.println(avalible);
	Boolean avaliblelist=vectorExample.containsAll(vectorCustomer);
	System.out.println(avaliblelist);
	Boolean comparelist=vectorExample.equals(vectorCustomer);
	System.out.println(comparelist);
	//arrayListNames.remove("naveen");
	
	System.out.println("VectorNames");
	if(!vectorCustomer.isEmpty()) {
	
		for(int i =0;i<vectorExample.size();i++)
		{
			System.out.println("name is::"+vectorExample.get(i));
	}

	}

	}

}
