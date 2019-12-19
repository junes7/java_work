package chap03_Prac;
// 3-2
public class prac01 {
	public static void main(String []args) {
		int numOfApples=123;
		int sizeOfBucket=10;
		int numOfBucket = (numOfApples % sizeOfBucket) == 0 ? (numOfApples/sizeOfBucket):(numOfApples/sizeOfBucket)+1;
		System.out.println("필요한 바구니의 수: "+numOfBucket);
	}
}