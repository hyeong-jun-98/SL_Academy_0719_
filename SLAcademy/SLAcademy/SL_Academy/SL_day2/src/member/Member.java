package member;

import java.util.Scanner;

public class Member {//

	private String name, id, pass, phone;

	public void setMemberInfo() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ���");
		this.name = sc.nextLine();
		System.out.print("���̵� �Է��ϼ���");
		this.id = sc.nextLine();
		System.out.print("��й�ȣ�� �Է��ϼ���");
		this.pass = sc.nextLine();
		System.out.print("�ڵ�����ȣ �Է��ϼ���");
		this.phone = sc.nextLine();
		
	}

	public void putMemberInfo() {
		System.out.println("name :" + name + " ID :" + id + " ��й�ȣ :" + pass + " �ڵ��� :" + phone);
	}

	public String getMemberName() {
		return name;
	}

	public String getMemberId() {
		return id;
	}

	public String getMemberPass() {
		return pass;
	}

	public String getMemberPhone() {
		return phone;
	}
}