package etc;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventTest extends JFrame implements KeyListener {	
	
	
	private static final long serialVersionUID = 1L;
	
	JLabel label = new JLabel("press any key (wasd, arrows etc)");
	JLabel label2 = new JLabel("more info.. just press someting");
	
	public EventTest() {
		this.addKeyListener(this);		
		this.setTitle("Just for testing");
		
		JPanel panel = new JPanel(new BorderLayout());		
		panel.add(label, BorderLayout.NORTH);
		panel.add(label2, BorderLayout.CENTER);
		this.add(panel);
		
		setSize(300, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {		
		
		label2.setText("KEY PRESSED");
		int keyCode = e.getKeyCode();	
		
			
		//maybe function reference is a better choice than this massive switch:
		switch(keyCode) {
			case KeyEvent.VK_UP:
				label.setText("Up");
				System.out.println("UP");
				break;
			
			case KeyEvent.VK_DOWN:
				System.out.println("DOWN");
				label.setText("Down");
				break;
			
			case KeyEvent.VK_LEFT:
				label.setText("Left");
				System.out.println("LEFT");
				break;
				
			case KeyEvent.VK_RIGHT:
				label.setText("Right");
				System.out.println("RIGHT");
				break;
			
			case KeyEvent.VK_W:
				label.setText("Up");
				System.out.println("UP");
				break;
				
			case KeyEvent.VK_S:
				label.setText("Down");
				System.out.println("DOWN");
				break;
				
			case KeyEvent.VK_A:
				label.setText("Left");
				System.out.println("LEFT");
				break;
				
			case KeyEvent.VK_D:
				label.setText("Right");
				System.out.println("RIGHT");
				break;
				
			default:
				label.setText("INVALID CMD");
				System.out.println("INVALID CMD");
				break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {		
		System.out.println("KEY RELEASED");
		label2.setText("KEY RELEASED");
	}

	@Override
	public void keyTyped(KeyEvent e) {		
		System.out.println("KEY TYPED");		
	}
	
}
