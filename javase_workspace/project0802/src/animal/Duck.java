
package animal;
public class Duck {
	// �Ӽ�, �������
	String name = "������������";
	int age = 3;
	String color = yellow;

	public void quack() {
		System.out.println("�в�");
	}

	public static void main (String [] args) {
		// ������ ���̸� 5���� ���� �� �� ���̸� ����϶�.
		Duck duck = new Duck();
		duck.age = 5;
		System.out.println("age : " + duck.age);
	}
}