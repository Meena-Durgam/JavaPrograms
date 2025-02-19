package anudip.ANPD0453;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		m.put(1, "Mango");
		m.put(2, "Kiwi");
		m.put(3,"Banana");

		m.put (4, "Grapse");

		m.put(5,"Apple");

		m.put(5, "Mango");

		m.put (5, "pinapple");
		System.out.println(m);
		

		Set s=m.entrySet(); //convert map to set traverse

		Iterator it=s.iterator();

		/*while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		while(it.hasNext())
		{
			Map. Entry e=(Map. Entry)it.next();

			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
