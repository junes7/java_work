package workbook_week2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//Scanner key = new Scanner(System.in);
/*		System.out.print("출력하고 싶은 값을 입력해주세요:");
		int num = key.nextInt();
		int count = 1;*/
		int count =0;
		for(int k=0; k<=3; k++) {
			for(int i=1; i<=3; i++) {		
				for(int j=2+3*k; j<=4+3*k; j++) {
					if(j>9) {
						break;
					}
					System.out.print(j+"*"+i+"="+i*j+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
