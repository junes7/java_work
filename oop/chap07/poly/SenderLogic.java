package oop.chap07.poly;
public class SenderLogic {
	public void run(Sender obj) {
		//Sender클래스의 클래스들을 활용하는 메소드
		//이 베이스가 다형성이다.
		//다형성이 녹아져 있는 대표가 API이다.
		System.out.println("실행완료");
		obj.print();
	}
	//Sender Test에서 Sender sender = null을 하지 않는다면
	//다형성과 클래스 상속 관계를 잘 해 놓으면 유지보수가 용이하다.
	// 상위클래스 타입으로 상속하면 되기 때문이다.
}