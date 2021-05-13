package cafemanage;
import java.util.*;

public class Item {
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	
	//메뉴등록
	void input(String name, String price) {
		map.put(name, price);
		System.out.printf("%s 메뉴가 등록되었습니다.\n",name);
	}
	
	//메뉴출력
	void output() {
		System.out.println(map);
	}
}
