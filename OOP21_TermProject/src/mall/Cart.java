package mall;

//Cart Ŭ����
public class Cart {
int id; //���� �ѹ�
String gName; //�̸�
int stockNum; //���
int buyNum; //�� ����
int gPrice; //���簡��
int totalPrice; //�Ѱ���   
Goods goods;

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
  
  // �� ���� ���ϱ� 
  int totalPrice() {
     return buyNum *gPrice;
  }
  
  public int getId() {
     return id;
     }
  public int getStockNum() {
     return stockNum;
     }
  public int getBuyNum() {
     return buyNum;
     }
  public int getTotalPrice() {
     return totalPrice;
     }
  public String getName() {
     return gName;
     }
  public int getPrice() {
     return gPrice;
     }
  Cart(int id_code,String name, int num, int buyNumber,int perPrice,int tolPrice){  // ������ 
        id = id_code;                 
        gName=name;
        stockNum = num;
        buyNum =buyNumber;
        gPrice = perPrice;
        totalPrice = tolPrice;
    }     

/*  public String toString(){
     return  goods.id+"\t"+ goods.gName+"\t"+goods.stockNum+"\t"+
           buyNum+"\t"+goods.gPrice+"\t"+totalPrice();
     }
*/

}
