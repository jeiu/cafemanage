package cafemanage;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      int choose;
      
      //생성자
      Item item = new Item();
      Order order = new Order();
      
      Scanner scan = new Scanner(System.in);
      
      while(true) {
         System.out.println("------------------");
         System.out.println("카페 상품 관리 프로그램");
         System.out.println("------------------");
         System.out.println("1. 상품등록 및 조회\n2. 주문등록 및 조회\n3. 매출 조회");
         choose = scan.nextInt();
         
         switch(choose) {
            // 상품 등록 및 조회
            case 1:
               int item_choose;
               String name, price;
               
               System.out.println("1. 등록\n2. 조회");
               item_choose = scan.nextInt();
               
               if(item_choose == 1) {
                  System.out.println("상품 명을 입력하세요.");
                  name = scan.next();
                  
                  System.out.println("상품 가격을 입력하세요.");
                  price = scan.next();
                  
                  item.input(name, price);
               } else if(item_choose == 2) {
                  item.output();
               } else {
                  break;
               }
            
            // 주문 조회   
            case 2:
               int order_choose;
               String ordername, smenu, ssize, sprice;
               
               System.out.println("1. 등록\n2. 조회");
               order_choose = scan.nextInt();
               
               if(order_choose == 1) {
            	   System.out.println("이름을 입력해주세요.");
            	   ordername = scan.next();
            	   
            	   System.out.println("제품 명을 입력해주세요");
            	   smenu = scan.next();
            	   System.out.println("사이즈 입력해주세요");
            	   ssize = scan.next();
            	   System.out.println("가격을 입력해주세요");
            	   sprice = scan.next();
            	   
            	   order.input(ordername, smenu, ssize, sprice);
               } else if(order_choose == 2) {
            	   System.out.println("이름을 입력해주세요.");
            	   ordername = scan.next();
            	   
            	   order.output(ordername);
               } else {
            	   break;
               }
         }      
      }
   }
}