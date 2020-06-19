package objectFinalApp;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ObjectFinalApp extends JFrame {
	
	 URL imageURL[] = {														//jar파일에 이미지를 포함시키기 위한 리소스
			 getClass().getClassLoader().getResource("festival.jpg"),
			 getClass().getClassLoader().getResource("capstone.jpg"),
			 getClass().getClassLoader().getResource("creative.jpg"),
			 getClass().getClassLoader().getResource("image.jpg"),
	 };
	 
	 public Image img[] = {
			 new ImageIcon(imageURL[0]).getImage(),
			 new ImageIcon(imageURL[1]).getImage(),
			 new ImageIcon(imageURL[2]).getImage(),
			 new ImageIcon(imageURL[3]).getImage(),
	 };
	 
	public ObjectFinalApp() {
		
		
		setTitle("기말과제 전자공학과 김동현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//JPanel basicPanel = makeBasic();
		//c.add(basicPanel, BorderLayout.NORTH);
		
		
		//setContentPane(new MovePanel());
		//setContentPane(new GamePanel());
		
		setSize(800,600);
		setVisible(true);
	
	}
	
//	public JPanel makeBasic() {
//		JPanel basicPanel = new JPanel();
//		basicPanel.setBackground(Color.YELLOW);
//		
//		GridLayout gl = new GridLayout(1, 4);
//		basicPanel.setLayout(gl);
//		
//		return basicPanel;
//		
//	}
	
	
	
	public static void main(String args[]) {
		new ObjectFinalApp();
	}
	
}