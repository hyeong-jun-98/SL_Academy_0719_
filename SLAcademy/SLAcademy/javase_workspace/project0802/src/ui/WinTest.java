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
		button = new JButton("��ư");
		textField = new JTextField(10);
		
		textField.addKeyListener(new MyKeyListener());
		frame.add(textField);
		frame.add(button); // �����ӿ� ��ư �߰�
		frame.setVisible(true);  // �������� �Ⱥ��̱� ������ ���̰� ����
		frame.setSize(300,400);  // ������ ũ�� ����
		frame.setLayout(new FlowLayout());

		//��ư�� �����ʶ� ����
		button.addActionListener(new MyListener());


	}
}
