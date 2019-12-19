package oop.chap07.poly;
public class VideoShop {
	public static void main(String[] args) {
		Content[] content = new Content[3];
		content[0] = new Video("±â»ýÃæ","new");
		content[1] = new Video("Å½Á¤","comic");
		content[2] = new Video("Çï·ÎÄ«º¿","child");
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}
