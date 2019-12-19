package oop.chap07.poly;

public class Video extends Content{
	//클래스 멤버변수 선언
	String genre;
	//title과 genre 매개변수 생성자 생성
	public Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}
	//setter와 getter선언
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	//오버라이딩 -> 내용 수정
	@Override
	public void totalPrice() {
		if(genre.equals("new")) {
			super.setPrice(2000);
		} else if(genre.equals("comic")) {
			super.setPrice(1500);
		} else if(genre.equals("child")) {
			super.setPrice(1000);
		} else {
			super.setPrice(500);
		}
	}

}
