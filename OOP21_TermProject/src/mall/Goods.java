package mall;

//���� Ŭ����
public class Goods {
 int id; //��ǰ ��ȣ
 int stockNum; //���
 String gName; //�̸�
 int gPrice; //����
 
 //���� ���̳ʽ�
   int subStock(int amount){  
         if(stockNum < amount)  
             return 0;  
         stockNum -= amount;  
         return amount;  
     }  
   //���� �÷���
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



}