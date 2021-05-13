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
	
	// para1 = �ֹ��� �̸� / para2 = string[]{�޴��̸�, ������, ����, �ֹ��ð�, �ֹ���}
	HashMap<String, String[]> map = new HashMap<String, String[]>(){{
	}};

   
   // ������ ���� �ֹ� �ð� �ֹ���
   LocalDate to_date = LocalDate.now();
   LocalTime to_time = LocalTime.now();
   
   //�ֹ����
   public void input(String orderName,String itemName, String size, String price){
		SimpleDateFormat formater1 = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat formater2 = new SimpleDateFormat("yy-MM-dd");
		Date time = new Date();
		
		String orderTime = formater1.format(time);
		String orderDate = formater2.format(time);
		
		String[] info = {itemName,size,price,orderTime,orderDate};
		
		map.put(orderName,info);
		
		System.out.printf("%s���� �ֹ��� ��ϵǾ����ϴ�.\n",orderName);
		
		
   }
   
   //�ֹ���ȸ
   public void output(String name) {
	   String[] infoma = map.get(name);
	   System.out.printf("%s���� �ֹ�����\n",name);
	   
	   for(int i=0; i<infoma.length; i++) {
		   System.out.printf("%s ",infoma[i]);
	   }
	   System.out.printf("\n");
   }
}