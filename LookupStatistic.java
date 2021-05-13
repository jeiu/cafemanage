package cafemanage;
import java.util.*;

public class LookupStatistic {
	String a;
	
	Order order = new Order();
	
	void get(String name) {
		String[] date = order.map.get(name);
		System.out.println(date[3]);
	}
}
