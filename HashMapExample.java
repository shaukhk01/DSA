package demo.inner;
import java.util.*;
import java.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.IdentityHashMap;
//import java.util.*;

public class HashMapExample {

	WeakHashMap<Integer,String> emp = new WeakHashMap<Integer,String>();
	public void hashMap(){

		emp.put(111,"hector");
		emp.put(222,"annie");
		emp.put(333,"bridget");
		emp.put(444,"nic");

		System.out.println(emp);
	}

}
/*


	public static void main(String[]args)throws InterruptedException {


		//System.gc();
	//	Thread.sleep(5000);
	//	System.out.println(emp);
		/*

	 	IdentityHashMap im = new IdentityHashMap();
			Integer i1 = new Integer(10);
			Integer i2 = new Integer(10);
			im.put(i1,"hector");
			im.put(i2,"annie");
			System.out.println(im);
	Set s =	emp.keySet();
//	System.out.println(s);
	Collection v = emp.values();
//	System.out.println(v);

		Set s1 = emp.entrySet();
		Iterator itr = s1.iterator();

		while(itr.hasNext()){

			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+"   "+m.getValue());
	*///	}
/*

	}

}*/



