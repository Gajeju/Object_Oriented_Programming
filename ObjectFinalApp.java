package objectFinalApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Random;

//2015108223 전자공학과 김동현

public class ObjectFinalApp extends JFrame {
	
	//-------------------전역변수-------------------
	 URL imageURL[] = {														//jar파일에 이미지를 포함시키기 위한 리소스
			 getClass().getClassLoader().getResource("bono.jpg"),
			 getClass().getClassLoader().getResource("porori.jpg"),
			 getClass().getClassLoader().getResource("nubri.jpg"),
			 getClass().getClassLoader().getResource("image.jpg"),
	 };
	 
	 public Image img [] = {												//랜덤위치 이미지에 사용
			 (new ImageIcon(imageURL[0]).getImage()),
			 (new ImageIcon(imageURL[1]).getImage()),
			 (new ImageIcon(imageURL[2]).getImage()),
			 (new ImageIcon(imageURL[3]).getImage()),
	 };
	
	public JLabel imgLabel[] = new JLabel[4];								//초기위치의 이미지, 클릭리스너 구현
	public JLabel startLabel = new JLabel();								//"시 작 화 면" 을 띄우는 JLabel
	public JLabel gameLabel = new JLabel();
	
	Thread bonoTh	 = new ImageThread(0);									//스레드 목록
	Thread pororiTh	 = new ImageThread(1);
	Thread nubriTh	 = new ImageThread(2);
	Thread imageTh	 = new ImageThread(3);
	
	int imgX[] = new int[4];												//각 이미지의 좌표저장
	int imgY[] = new int[4];
	
	public int threadNum = 0;
	
	//-------------------생성자-------------------
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
	
	//-------------------이미지의 초기위치 패널-------------------
	class BasicPanel extends JPanel {
		public BasicPanel() {
			this.setBackground(Color.YELLOW);			
			GridLayout gl = new GridLayout(1, imgLabel.length, 10, 5);			//GridLayout 은 이미지를 비활성화해도 다른 이미지의 위치가 바뀌지 않는다
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
				
				e.getComponent().setVisible(false);							//해당 이미지를 지운다
				
				JLabel comp = (JLabel)e.getComponent();						//해당 이미지에 해당하는 스레드를 시작한다.
					
				if (comp.equals(imgLabel[0])) {
						bonoTh = new ImageThread(0);
						bonoTh.start();
						threadNum++;
				} else if (comp.equals(imgLabel[1])) {
						pororiTh = new ImageThread(1);
						pororiTh.start();
						threadNum++;
				} else if (comp.equals(imgLabel[2])) {
						nubriTh = new ImageThread(2);
						nubriTh.start();
						threadNum++;
				} else if (comp.equals(imgLabel[3])) {
						imageTh = new ImageThread(3);
						imageTh.start();
						threadNum++;
				}

			}
		}
	}
	
	//-------------------랜덤위치 패널-------------------
	class MovePanel extends JPanel {
		public MovePanel() {
			this.setLayout(null);
			startLabel.setText("시 작 화 면");
			startLabel.setFont(new Font("고딕", Font.PLAIN, 50));
			startLabel.setLocation(270,100);
			startLabel.setSize(300,200);
			this.add(startLabel);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Image caveImg = new ImageIcon(getClass().getClassLoader().getResource("cave.jpg")).getImage();
			
			if (threadNum > 0) {
				startLabel.setVisible(false);
				g.drawImage(caveImg,350,200,100,100, this);
			}
	
			if (bonoTh.isAlive()) {
				g.drawImage(img[0], imgX[0], imgY[0], this);
			}
			if (pororiTh.isAlive()) {
				g.drawImage(img[1], imgX[1], imgY[1], this);
			}
			if (nubriTh.isAlive()) {
				g.drawImage(img[2], imgX[2], imgY[2], this);
			}
			if (imageTh.isAlive()) {
				g.drawImage(img[3], imgX[3], imgY[3], this);
			}
			
		}		
	}
	
	//-------------------개임상황 패널-------------------
	class GamePanel extends JPanel {
		public GamePanel() {
			this.setBackground(Color.YELLOW);
			this.add(gameLabel);
			gameLabel.setFont(new Font("고딕", Font.PLAIN, 20));
			gameLabel.setText("동굴아저씨에게 잡히면 처음 위치로 되돌아갑니다");	
		}
	}
	
	//-------------------스래드-------------------

	class ImageThread extends Thread {
		int state;
		
		public ImageThread(int state) {
			this.state = state;
		}
		
		public void run() {	
			while (true) {
				try {
					synchronized(this) {							//위치 변경
						Random rand = new Random();
						imgX[state] = rand.nextInt(800-60)	;		//이미지의 가로크기를 뺀 공간
						imgY[state] = rand.nextInt(600-200);		//위 아래의 패널을 재외한 공간
						foldCatch(state);
					}
					repaint();
					sleep(1000);
				} catch (InterruptedException e) {
					imgLabel[state].setVisible(true);
					return;
				}
			}
		}
		public void foldCatch(int state) {
			if (imgX[state] > 290 && imgX[state] < 450 && imgY[state] > 120 && imgY[state] < 300) {
				try {
					sleep(2000);
					switch (state) {
					case 0:
						gameLabel.setText("보노보노가 잡혔습니다");
						bonoTh.interrupt();
						break;
					case 1:
						gameLabel.setText("포로리가 잡혔습니다");
						pororiTh.interrupt();
						break;
					case 2:
						gameLabel.setText("너부리가 잡혔습니다");
						nubriTh.interrupt();
						break;
					case 3:
						gameLabel.setText("김동현이 잡혔습니다");
						imageTh.interrupt();
						break;
					}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
		
	
	public static void main(String args[]) {
		new ObjectFinalApp();
	}
	
}
