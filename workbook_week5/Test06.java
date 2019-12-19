package workbook_week5;

public class Test06 {
	public static void main(String[] args) {
		//String str = args[0];
		int index;
		String str = "LGcns";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		index = str.indexOf("cn");
		System.out.println(str.substring(index,4));
		
		System.out.println(str.substring(2,5));
	}
}
