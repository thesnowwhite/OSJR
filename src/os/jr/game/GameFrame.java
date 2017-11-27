package os.jr.game;

import javax.swing.JFrame;

import os.jr.boot.Boot;
import os.jr.hooks.Client;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GameFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static JFrame gameFrame = new JFrame();

	public GameFrame() {
		gameFrame.setTitle("OS-JR");
		gameFrame.setSize(781, 543);
		gameFrame.setResizable(true);
		gameFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		while (Reflector.applet==null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Boot.rootReference = Reflector.applet;
		gameFrame.add(Reflector.applet);
		gameFrame.setVisible(true);
	}

	public static void changeName(String name) {
		if (name==null) {
			gameFrame.setTitle("OS-JR");
		} else {
			gameFrame.setTitle("OS-JR [" + name + "]");
		}

	}

}
