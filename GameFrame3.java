import java.awt.*;
import javax.swing.*;
public class GameFrame3 extends JFrame{

	twoPlayer panel;
	
	GameFrame3(){
		panel = new twoPlayer();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
}