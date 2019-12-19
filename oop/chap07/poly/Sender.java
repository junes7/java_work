package oop.chap07.poly;
public abstract class Sender {
	String name;
	Sender(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void print();
	
}

