package cafemanage;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      int choose;
      
      //������
      Item item = new Item();
      Order order = new Order();
      
      Scanner scan = new Scanner(System.in);
      
      while(true) {
         System.out.println("------------------");
         System.out.println("ī�� ��ǰ ���� ���α׷�");
         System.out.println("------------------");
         System.out.println("1. ��ǰ��� �� ��ȸ\n2. �ֹ���� �� ��ȸ\n3. ���� ��ȸ");
         choose = scan.nextInt();
         
         switch(choose) {
            // ��ǰ ��� �� ��ȸ
            case 1:
               int item_choose;
               String name, price;
               
               System.out.println("1. ���\n2. ��ȸ");
               item_choose = scan.nextInt();
               
               if(item_choose == 1) {
                  System.out.println("��ǰ ���� �Է��ϼ���.");
                  name = scan.next();
                  
                  System.out.println("��ǰ ������ �Է��ϼ���.");
                  price = scan.next();
                  
                  item.input(name, price);
               } else if(item_choose == 2) {
                  item.output();
               } else {
                  break;
               }
            
            // �ֹ� ��ȸ   
            case 2:
               int order_choose;
               String ordername, smenu, ssize, sprice;
               
               System.out.println("1. ���\n2. ��ȸ");
               order_choose = scan.nextInt();
               
               if(order_choose == 1) {
            	   System.out.println("�̸��� �Է����ּ���.");
            	   ordername = scan.next();
            	   
            	   System.out.println("��ǰ ���� �Է����ּ���");
            	   smenu = scan.next();
            	   System.out.println("������ �Է����ּ���");
            	   ssize = scan.next();
            	   System.out.println("������ �Է����ּ���");
            	   sprice = scan.next();
            	   
            	   order.input(ordername, smenu, ssize, sprice);
               } else if(order_choose == 2) {
            	   System.out.println("�̸��� �Է����ּ���.");
            	   ordername = scan.next();
            	   
            	   order.output(ordername);
               } else {
            	   break;
               }
         }      
      }
   }
}