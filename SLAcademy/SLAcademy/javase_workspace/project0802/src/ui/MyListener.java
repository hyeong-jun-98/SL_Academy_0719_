// 사용자가 gui 상에서 어떠한 행동을 했을 때 제일 먼저 OS가 감지하여 JVM에게 전달하고
// jvm은 이벤트 정보를 이용하여 이벤트 객체의 인그턴스를 생성
//이때 인스턴스는 개발자에게 전잘될 수 있는데 이 인스턴스를 개발자가 전달받으려면 전담리스너를 활용해야한다
// 하지만 이 리스너는 몸체가 없눈 불완전한 객체로 되어있다. 그 이유는 몸체를 완성시킹 의무를 개발자에게 부여하기 위함이다.
package ui;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class MyListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		System.out.println("hi");

	}
}
