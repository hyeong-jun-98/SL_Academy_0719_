package ui;
import java.awt.event.*;
class  MyKeyListener implements KeyListener {
	
	public void keyPressed(KeyEvent e) {
			System.out.println("keyPressed");

		}
	public void keyReleased(KeyEvent e) {
		System.out.println("KeyRealesed");

		}
		public void keyTyped(KeyEvent e) {
		System.out.println("KeyTyped");

		}
}
