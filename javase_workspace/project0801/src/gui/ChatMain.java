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
		// 버튼 생성
		Button bt = new Button("나 버튼이야~");
		Frame frame = new Frame();
		TextField t = new TextField(10);
		Checkbox ch = new Checkbox("게임");
		Checkbox ch2 = new Checkbox("프로그래밍");
		Choice choice = new Choice();
		CheckboxGroup g = new CheckboxGroup();
		Checkbox c1 = new Checkbox("남", g, false);
		Checkbox c2 = new Checkbox("여", g, false);
		Checkbox c3 = new Checkbox("트랜스", g, false);

		TextArea area = new TextArea(20, 10);  // row, column
		
		choice.add("Red");
		choice.add("Green");
		choice.add("Blue");
		
		frame.setSize(300, 400);
		frame.setLayout(new FlowLayout());
		frame.add(bt); // 프레임에 버튼 부착!
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
