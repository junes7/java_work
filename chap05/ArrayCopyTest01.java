package chap05;

public class ArrayCopyTest01 {
	public static void main(String[] args) {
		int[] firstArr = new int[5];
		//�迭�� ���� �Ҵ��ϱ� ���� for���̴�.
		for(int i=0;i<firstArr.length;i++) {
			firstArr[i] = 10+i;
		}
		//�迭�� ����� ���� ����ϱ� ���� for���̴�.
		for(int i=0;i<firstArr.length;i++) {
			System.out.print("firstArr["+i+"]:"+firstArr[i]+"\t");
		}
		System.out.println();
		//�迭�� ����� ����
		//1. ���ο� �迭�� �����Ѵ�.
		int[] secondArr = new int[firstArr.length*3];
		//2. �����迭�� ���ο� �迭�� copy
		for(int i=0;i<secondArr.length;i++) {
			if(i==firstArr.length) {
				break;
			}
			secondArr[i] = firstArr[i];
		}
		//3. ����� �迭 Ȯ���ϱ�
		for(int i=0;i<secondArr.length;i++) {
			System.out.print("secondArr["+i+"]:"+secondArr[i]+"\t");
		}
		System.out.println();
	}
}
