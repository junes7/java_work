package oop.chap06.constructor;

import java.io.File;
import java.io.FileInputStream;

//API�� Ŭ������ ���ǵ� �����ڸ޼ҵ� Ȯ���ϱ�
public class APIConsturctorTest {
	public static void main(String[] args) throws Exception {
		//String���� � Ÿ���� ���ڿ��� ������ �������� �����Ǿ� ����
		//�ʱ� ������ �����ڸ� ���Ͽ� Ÿ���� �������ְ� ��Ʈ�� Ŭ������ �������ش�.
		String str = new String(); //String str = "";
		String str1 = new String("java");
		//string(byte[] bytes) ���� ���
		byte[] data1 = {65,66,67,68,69};
		String str2 = new String(data1);
		//string(byte[] bytes, int offset, int length) ���� ���
		//int offset : ������ġ, int length : ����
		//�� ������ġ���� ��� ������ ��Ʈ���� ������ �������� �����Ѵ�.
		//�����ε�ó�� Ŭ���� �̸��� ���������� �Ű������μ� ���� ������ Ÿ���� �� �� �ִٴ� ���� �ٽ�!!
		//�׷��� �� ������ Ÿ���� �ƹ��ų� �� �� ���� API Ŭ���� ������ ��õ� �͸� �� �� �ִ�.
		String str3 = new String(data1,2,3);
		//string(char[] value) ���� ���
		char[] data2 = {'a','b','c','d','e'};
		String str4 = new String(data2);
		//System.out.println(str1);
		System.out.println(str1+"\tstr1����:"+str1.length());
		System.out.println(str2+"\tstr2����:"+str2.length());
		System.out.println(str3+"\tstr3����:"+str3.length());
		System.out.println(str4+"\tstr4����:"+str4.length());
		//File(string pathname)
		File f = new File("test.txt");
		System.out.println(f.getName());
		//FileInputStream(File file)
		FileInputStream fs = new FileInputStream("test.txt");
		//test.txt�� ������ �о�鿩 ù ���ڸ� ������ش�.
		System.out.println((char)fs.read());
	}

}
