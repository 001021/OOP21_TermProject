package mall;

import java.util.Scanner; //scanner import
//Goods Class
public class Goods {
 int id; //Goods number
 int stockNum; //stock
 String gName; //name
 int gPrice; //price
 
//Delete Quantity
   int subStock(int amount){  
         if(stockNum < amount)  
             return 0;  
         stockNum -= amount;  
         return amount;  
     }  
 //Plus Quantity
   int addStock(int amount){  
         stockNum += amount;  
         return amount;  
     }  
   
   public int getId() {
      return id;
      }
   public int getStockNum() {
      return stockNum;
      }
   public String getName() {
      return gName;
      }
   public int getPrice() {
      return gPrice;
      }
   
   Goods(int id_code, int num,String name,int price){  // ������ 
         id = id_code;                 
         stockNum = num;
         gName=name;
         gPrice = price;
     }     

   /*
   public void add_goods() {
	   Scanner keyboard = new Scanner(System.in); // Receive keyboard value
	 
	   System.out.println("�߰��� ��ǰ�� �ڵ带 �Է��ϼ��� : ");
	   int new_id=keyboard.nextInt();
	   System.out.println("�߰��� ��ǰ�� �̸��� �Է��ϼ��� : ");
	   String new_gname=keyboard.nextLine();
	   System.out.println("�߰��� ��ǰ�� �ʱ� ������ �Է��ϼ��� : ");
	   int new_stockNum=keyboard.nextInt();
	   System.out.println("�߰��� ��ǰ�� ������ �Է��ϼ��� : ");
	   int new_gPrice=keyboard.nextInt();
	   
		
	}
*/
}