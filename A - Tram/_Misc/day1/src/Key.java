import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

class KeyInput extends KeyAdapter {
	public void keyPressed(KeyEvent evt) {
		while (true) {
			System.out.println("You pressed: " + evt.getKeyChar());
			break;
		}

	}
}

public class Key {
	public static void main(String[] argv) throws Exception {
		JTextField foo = new JTextField();
		foo.addKeyListener(new KeyInput());

		JFrame f = new JFrame();

		f.add(foo);
		f.setSize(300, 300);
		f.setVisible(true);

	}
}
