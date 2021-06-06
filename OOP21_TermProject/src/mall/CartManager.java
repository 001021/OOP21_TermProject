package mall;

import java.util.Arrays;

//��ٱ��ϸ� �����ϱ� ���� Ŭ����
public class CartManager implements Manager {
	Cart[] cartArray = new Cart[20]; // �ٱ��ϸ� ��� �ڷᱸ��, �迭 ũ��� 20 (�ӽ�)
	int count = 0;

	@Override
	// ��ٱ��ϸ� �迭�� �߰�
	public void add(Object o) {
		// �迭 ũ�⸦ �Ѿ ��� �߰� ����
		if (count >= cartArray.length) {
			throw new ArrayIndexOutOfBoundsException("���̻� �߰��� �� �����ϴ�.");
		}
		cartArray[count++] = (Cart) o;
	}

	@Override
	// ��ٱ��Ͽ��� ��ǰ ����
	public void remove(int i) {
		// �迭���� ��ǰ ���̵� ���� �ε��� ���� deleteKey�� ����
		int deleteKey = Arrays.binarySearch(cartArray, i);

		if (deleteKey < 0) // �迭�� �ش� ��ǰ�� ���� ���
		{
			throw new ArrayIndexOutOfBoundsException("�ش� ��ǰ�� ã�� �� �����ϴ�");
		} else {
			// deleteKey ��ġ�� �����͸� �����ϰ�, index ���� �����ʹ� ��ĭ�� �������.
			for (int k = deleteKey; k < count - 1; k++) {
				cartArray[k] = cartArray[k + 1];
			}
			count--;
			cartArray[count] = null;
		}
	}

	@Override
	// ��ٱ��� ���� ����
	public void modify(int i, Object o) {

		// �迭���� ��ǰ ���̵� ���� �ε��� ���� searchKey�� ����
		int searchKey = Arrays.binarySearch(cartArray, i);

		if (searchKey < 0) // �迭�� �ش� ��ǰ�� ���� ���
		{
			throw new ArrayIndexOutOfBoundsException("�ش� ��ǰ�� ã�� �� �����ϴ�");
		} else {
			cartArray[searchKey] = (Cart) o;
		}
	}

	@Override
	// ��ü ��ٱ��� ���� ȭ�� ���
	public void display() {
		System.out.println(Arrays.toString(cartArray));
	}
}
