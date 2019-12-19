package workbook_week2;

public class Test07 {
	public static void main(String[] args) {
		System.out.println("명령행매개변수->"+args[0]);
		int num = Integer.parseInt(args[0]);
		int sum = num;
		System.out.print(num);
		for(int i=num+1;i<=100;i++) {		
			if(i%num==0) {
				sum+=i;
				System.out.print("+"+i);
			}
		}
		System.out.print(" = "+sum+"\n");
	}
}
