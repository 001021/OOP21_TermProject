package mall;

import java.util.Arrays;

//��ǰ�� �����ϱ� ���� Ŭ����
public class GoodsManager implements Manager {

	Goods[] goodsArray = new Goods[20]; //��ǰ�� ��� �ڷᱸ��, �迭 ũ��� 20 (�ӽ�)
	int count = 0;

	@Override
	//��ǰ�� �迭�� �߰�
	public void add(Object o) {
		if (count >= goodsArray.length) {
			throw new ArrayIndexOutOfBoundsException("���̻� �߰��� �� �����ϴ�.");
		}
		goodsArray[count++] = (Goods) o;
	}

	@Override
	//��ǰ�� �迭���� ����
	public void remove(int i) {
		// �迭���� ��ǰ ���̵� ���� �ε��� ���� deleteKey�� ����
		int deleteKey = Arrays.binarySearch(goodsArray, i);

		if (deleteKey < 0) // �迭�� �ش� ��ǰ�� ���� ���
		{
			throw new ArrayIndexOutOfBoundsException("�ش� ��ǰ�� ã�� �� �����ϴ�");
		} else {
			//deleteKey ��ġ�� �����͸� �����ϰ�, index ���� �����ʹ� ��ĭ�� �������.
			for (int k = deleteKey; k < count - 1; k++) {
				goodsArray[k] = goodsArray[k + 1];
			}
			count--;
			goodsArray[count] = null;
		}
	}

	@Override
	//��ǰ���� ����
	public void modify(int i, Object o) {

		// �迭���� ��ǰ ���̵� ���� �ε��� ���� searchKey�� ����
		int searchKey = Arrays.binarySearch(goodsArray, i);

		if (searchKey < 0) // �迭�� �ش� ��ǰ�� ���� ���
		{
			throw new ArrayIndexOutOfBoundsException("�ش� ��ǰ�� ã�� �� �����ϴ�");
		} else {
			goodsArray[searchKey] = (Goods) o;
		}
	}

	@Override
	//��ü ��ǰ ȭ�鿡 ���
	public void display() {
		System.out.println(Arrays.toString(goodsArray));
	}

}
