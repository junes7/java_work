package chap05;

public class ArrayCopyTest02 {
	public static void main(String[] args) {
		int[] firstArr = new int[5];
		//�迭�� ���� �Ҵ��ϱ� ���� for���̴�.
		for(int i=0;i<firstArr.length;i++) {
			firstArr[i] = 10+i;
		}
		//firstArr�� ������ �迭�� ����
		int[] secondArr = new int[firstArr.length*2];
		//firstArr�迭�� 0������ firstArr�� ��� ��Ҹ� secondArr�� 0�� ��ġ����
		//copy�ؼ� �����ϱ�
		//System.arraycopy(src, srcPos, dest, destPos, length);
/*		System.arraycopy(firstArr, 0, secondArr, 0, firstArr.length);*/
		System.arraycopy(firstArr, 3, secondArr, 2, 2);
		for(int i=0;i<secondArr.length;i++) {
			System.out.print("secondArr["+i+"]:"+secondArr[i]+"\t");
		}
		System.out.println();		
		
	}
}
