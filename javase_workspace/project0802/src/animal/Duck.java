
package animal;
public class Duck {
	// 속성, 멤버변수
	String name = "오리오리오리";
	int age = 3;
	String color = yellow;

	public void quack() {
		System.out.println("꽥꽥");
	}

	public static void main (String [] args) {
		// 오리의 나이를 5세로 변경 후 그 나이를 출력하라.
		Duck duck = new Duck();
		duck.age = 5;
		System.out.println("age : " + duck.age);
	}
}