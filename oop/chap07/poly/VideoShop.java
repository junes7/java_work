package oop.chap07.poly;
public class VideoShop {
	public static void main(String[] args) {
		Content[] content = new Content[3];
		content[0] = new Video("�����","new");
		content[1] = new Video("Ž��","comic");
		content[2] = new Video("���ī��","child");
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}
