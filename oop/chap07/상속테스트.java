package oop.chap07;

//일반화작업 완료
public class 상속테스트{
	public static void main() {
		뱀after obj = new 뱀after();
		obj.이름 = "보아";
		obj.이동방법 = "기어서";
		obj.이동하다();
	}
}

class 동물after {
	String 이름;
	String 이동방법;
	public void 이동하다() {
		System.out.println("이동방법" + "으로 이동함");
	}
}

class 뱀after extends 동물after {
	int 몸길이;
	public void set몸길이(int 몸길이) {
		this.몸길이 = 몸길이;
	}
}

class 독수리after extends 동물after {
	int 날개길이;
	public void set날개길이(int 날개길이) {
		this.날개길이 = 날개길이;
	}
}

class 코끼리after extends 동물after {
	int 귀크기;
	public void set귀크기(int 귀크기) {
		this.귀크기 = 귀크기;
	}
}

class 고래after extends 동물after {
	int 지느러미길이;
	public void set지느러미길이(int 지느러미길이) {
		this.지느러미길이 = 지느러미길이;
	}
}
