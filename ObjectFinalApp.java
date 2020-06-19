package objectFinalApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;


/*
 * 맨 윗줄 이미지 추가					완
 * 맨 윗줄 이미지에 리스너 달기
 * 가운데 움직이는 스레드 구현
 * 겹치는거 판단하는 스레드
 * 가위바위보 구현
 * 돌아가는거 구현
 */

public class ObjectFinalApp extends JFrame {
	
	 URL imageURL[] = {														//jar파일에 이미지를 포함시키기 위한 리소스
			 getClass().getClassLoader().getResource("bono.jpg"),
			 getClass().getClassLoader().getResource("porori.jpg"),
			 getClass().getClassLoader().getResource("nubri.jpg"),
			 getClass().getClassLoader().getResource("image.jpg"),
	 };
	 
	 public Image img [] = {												//랜덤으로 움직일 이미지
			 new ImageIcon(imageURL[0]).getImage(),
			 new ImageIcon(imageURL[1]).getImage(),
			 new ImageIcon(imageURL[2]).getImage(),
			 new ImageIcon(imageURL[3]).getImage()
	};
	 
	 
	public JLabel imgLabel[] = new JLabel[4];								//이미지 컴포넌트\
	
	public JLabel test = new JLabel();

	public ObjectFinalApp() {
		
		
		setTitle("기말과제 전자공학과 김동현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		BasicPanel basicPanel = new BasicPanel();
		c.add(basicPanel, BorderLayout.NORTH);
		
		MovePanel movePanel = new MovePanel();
		c.add(movePanel, BorderLayout.CENTER);
		
		GamePanel gamePanel = new GamePanel();
		c.add(gamePanel, BorderLayout.SOUTH);
		
		setSize(800,600);
		setVisible(true);
		
	}
	
	class BasicPanel extends JPanel {
		public BasicPanel() {
			this.setBackground(Color.YELLOW);
			this.setSize(1000,600);
			
			GridLayout gl = new GridLayout(1, imgLabel.length, 10, 5);			//이미지 외의 부분 클릭시도 실행되는 문제 있음
			this.setLayout(gl);
			
			ClickListener clistener = new ClickListener();
			
			for (int i = 0; i < imgLabel.length; i++) {
				imgLabel[i] = new JLabel(new ImageIcon(imageURL[i]));
				this.add(imgLabel[i]);
				imgLabel[i].addMouseListener(clistener);
			}
			
		}
		
		//클릭리스너 구현
		class ClickListener extends MouseAdapter {
			public void mousePressed(MouseEvent e) {
				//해당 이미지를 지운다
				//e.getComponent().setVisible(false);
				//해당 이미지에 해당하는 스레드를 시작한다.
				String imgName = e.get;
				test.setText(imgName);

			}
		}
	}
	
	class MovePanel extends JPanel {
		public MovePanel() {
			this.add(test);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
		}
		
	}
	
	class GamePanel extends JPanel {
		public GamePanel() {
			
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
		}
		
	}
	
	class ChangePosition {					//위치변경 (Synchronized)
		
	}
	
	
	// 스레드 목록
	class BonoThread extends Thread {
		public void run() {
			
		}
	}
	

	
	
	public static void main(String args[]) {
		new ObjectFinalApp();
	}
	
}
