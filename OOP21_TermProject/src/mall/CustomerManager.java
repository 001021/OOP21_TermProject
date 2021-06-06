package mall;

import java.util.Arrays;

//���� �����ϱ� ���� Ŭ����
public class CustomerManager implements Manager {
	
	Customer[] customerArray = new Customer[20]; //�� ������ ��� �ڷᱸ��, �迭 ũ��� 20 (�ӽ�)
	int count = 0;

	@Override
	//���ο� ���� �迭�� �߰�
	public void add(Object o) {
		if (count >= customerArray.length) {
			throw new ArrayIndexOutOfBoundsException("���̻� �߰��� �� �����ϴ�.");
		}
		customerArray[count++] = (Customer) o;
	}

	@Override
	//�� ���� ����
	public void remove(int i) {
		// �迭���� �� ���̵� ���� �ε��� ���� deleteKey�� ����
		int deleteKey = Arrays.binarySearch(customerArray, i);

		if (deleteKey < 0) // �迭�� �ش� ���� ���� ���
		{
			throw new ArrayIndexOutOfBoundsException("�ش� ���� ã�� �� �����ϴ�");
		} else {
			//deleteKey ��ġ�� �����͸� �����ϰ�, index ���� �����ʹ� ��ĭ�� �������.
			for (int k = deleteKey; k < count - 1; k++) {
				customerArray[k] = customerArray[k + 1];
			}
			count--;
			customerArray[count] = null;
		}
	}

	@Override
	//�� ���� ����
	public void modify(int i, Object o) {

		// �迭���� �� ���̵� ���� �ε��� ���� searchKey�� ����
		int searchKey = Arrays.binarySearch(customerArray, i);

		if (searchKey < 0) // �迭�� �ش� ���� ���� ���
		{
			throw new ArrayIndexOutOfBoundsException("�ش� ���� ã�� �� �����ϴ�");
		} else {
			customerArray[searchKey] = (Customer) o;
		}
	}

	@Override
	//��ü �� ���� ȭ�鿡 ���
	public void display() {
		System.out.println(Arrays.toString(customerArray));
	}

}
