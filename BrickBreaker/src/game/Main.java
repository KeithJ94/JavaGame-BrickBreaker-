package game;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj1 = new JFrame();
		Gameplay game1 = new Gameplay();
		obj1.setBounds(10, 10, 700, 600);
		obj1.setTitle("Brick Breaker");
		obj1.setResizable(false);
		obj1.setVisible(true);
		obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj1.add(game1);
		
	}

}
