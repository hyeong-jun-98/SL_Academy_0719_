package ui;
import javax.swing.*;
import java.awt.*;

public class  WinTest
{
	JFrame frame;
	JButton button;
	JTextField textField;
	public WinTest() {
		frame = new JFrame();
		button = new JButton("버튼");
		textField = new JTextField(10);
		
		textField.addKeyListener(new MyKeyListener());
		frame.add(textField);
		frame.add(button); // 프레임에 버튼 추가
		frame.setVisible(true);  // 프레임이 안보이기 때문에 보이게 설정
		frame.setSize(300,400);  // 프레임 크기 설정
		frame.setLayout(new FlowLayout());

		//버튼과 리스너랑 연결
		button.addActionListener(new MyListener());


	}
}
