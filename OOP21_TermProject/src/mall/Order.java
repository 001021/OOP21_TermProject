package mall;

public class Order {
	   int orderNum; // �ֹ���ȣ
	   int id; // ���� �ѹ�
	   String gName; // �̸�
	   int buyNum; // �� ����
	   int gPrice; // ���簡��
	   int totalPrice; // �Ѱ���

	   int totalPrice() {
	      return buyNum * gPrice;
	   }

	   public int getOrderNum() {
	      return orderNum;
	   }

	   public int getId() {
	      return id;
	   }

	   public String getName() {
	      return gName;
	   }

	   public int getBuyNum() {
	      return buyNum;
	   }

	   public int getTotalPrice() {
	      return totalPrice;
	   }

	   public int getPrice() {
	      return gPrice;
	   }

	   Order(int orderNumber, int id_code, String name, int num, int buyNumber, int perPrice, int tolPrice) { // ������
	      orderNum = orderNumber;
	      id = id_code;
	      gName = name;
	      buyNum = buyNumber;
	      gPrice = perPrice;
	      totalPrice = tolPrice;
	   }

	}