package oop.chap07;

//�Ϲ�ȭ�۾� �Ϸ�
public class ����׽�Ʈ{
	public static void main() {
		��after obj = new ��after();
		obj.�̸� = "����";
		obj.�̵���� = "��";
		obj.�̵��ϴ�();
	}
}

class ����after {
	String �̸�;
	String �̵����;
	public void �̵��ϴ�() {
		System.out.println("�̵����" + "���� �̵���");
	}
}

class ��after extends ����after {
	int ������;
	public void set������(int ������) {
		this.������ = ������;
	}
}

class ������after extends ����after {
	int ��������;
	public void set��������(int ��������) {
		this.�������� = ��������;
	}
}

class �ڳ���after extends ����after {
	int ��ũ��;
	public void set��ũ��(int ��ũ��) {
		this.��ũ�� = ��ũ��;
	}
}

class ��after extends ����after {
	int �������̱���;
	public void set�������̱���(int �������̱���) {
		this.�������̱��� = �������̱���;
	}
}
