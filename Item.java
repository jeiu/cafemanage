package cafemanage;
import java.util.*;

public class Item {
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	
	//�޴����
	void input(String name, String price) {
		map.put(name, price);
		System.out.printf("%s �޴��� ��ϵǾ����ϴ�.\n",name);
	}
	
	//�޴����
	void output() {
		System.out.println(map);
	}
}
