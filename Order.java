package cafemanage;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.*;

public class Order {
//	String item;
//	String size;
//	int price;
//	String orderTime;
//	String orderName;
//	String orderDate;
	String[] info = {};
	
	// para1 = 주문자 이름 / para2 = string[]{메뉴이름, 사이즈, 가격, 주문시간, 주문일}
	HashMap<String, String[]> map = new HashMap<String, String[]>(){{
	}};

   
   // 사이즈 가격 주문 시간 주문자
   LocalDate to_date = LocalDate.now();
   LocalTime to_time = LocalTime.now();
   
   //주문등록
   public void input(String orderName,String itemName, String size, String price){
		SimpleDateFormat formater1 = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat formater2 = new SimpleDateFormat("yy-MM-dd");
		Date time = new Date();
		
		String orderTime = formater1.format(time);
		String orderDate = formater2.format(time);
		
		String[] info = {itemName,size,price,orderTime,orderDate};
		
		map.put(orderName,info);
		
		System.out.printf("%s님의 주문이 등록되었습니다.\n",orderName);
		
		
   }
   
   //주문조회
   public void output(String name) {
	   String[] infoma = map.get(name);
	   System.out.printf("%s님의 주문내역\n",name);
	   
	   for(int i=0; i<infoma.length; i++) {
		   System.out.printf("%s ",infoma[i]);
	   }
	   System.out.printf("\n");
   }
}