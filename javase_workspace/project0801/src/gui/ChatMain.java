package gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.CheckboxGroup;
import java.awt.TextArea;
public class  ChatMain
{
	public static void main(String[] args) 
	{
		// ��ư ����
		Button bt = new Button("�� ��ư�̾�~");
		Frame frame = new Frame();
		TextField t = new TextField(10);
		Checkbox ch = new Checkbox("����");
		Checkbox ch2 = new Checkbox("���α׷���");
		Choice choice = new Choice();
		CheckboxGroup g = new CheckboxGroup();
		Checkbox c1 = new Checkbox("��", g, false);
		Checkbox c2 = new Checkbox("��", g, false);
		Checkbox c3 = new Checkbox("Ʈ����", g, false);

		TextArea area = new TextArea(20, 10);  // row, column
		
		choice.add("Red");
		choice.add("Green");
		choice.add("Blue");
		
		frame.setSize(300, 400);
		frame.setLayout(new FlowLayout());
		frame.add(bt); // �����ӿ� ��ư ����!
		frame.add(t);
		frame.add(ch);
		frame.add(ch2);
		frame.add(choice);
		frame.add(c1);
		frame.add(c2);
		frame.add(c3);
		frame.add(area);
		
		
		
		frame.setVisible(true);
	}
}
