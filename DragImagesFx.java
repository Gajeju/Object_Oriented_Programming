package dragImagesFx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class DragImagesFx extends JFrame {
	public Image img;

	 URL imageURL[] = {														//jar파일에 이미지를 포함시키기 위한 리소스
			 getClass().getClassLoader().getResource("festival.jpg"),
			 getClass().getClassLoader().getResource("capstone.jpg"),
			 getClass().getClassLoader().getResource("creative.jpg"),
			 getClass().getClassLoader().getResource("image.jpg"),
	 };
	
	public ImageIcon imageIcon [] = {new ImageIcon(imageURL[0]),
									 new ImageIcon(imageURL[1]),
									 new ImageIcon(imageURL[2]),
									 new ImageIcon(imageURL[3])};
	
	//---------- 생성자 ----------
	public DragImagesFx() {
		setTitle("내맘대로 이미지 크기 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		creatMenu();
		setContentPane(new MyPanel());
		setSize(1024, 768);
		setVisible(true);
	}
	
	//---------- 메뉴 생성 ----------
		public void creatMenu() {
			JMenuBar mb = new JMenuBar();											//메뉴바
			mb.setBackground(Color.CYAN);											//메뉴바 색지정
			JMenu selectPaintMenu = new JMenu("그림선택");								//메뉴
			
			//그림 메뉴 아이탬
			JMenuItem [] menuItem = new JMenuItem [4];								//그림 메뉴 아이탬
			String itemTitle[] = {"공학페스티벌", "캡스톤", "창의경진", "사진"};				//메뉴 아이탬의 타이틀
			
			MenuActionListener menuListener = new MenuActionListener();				//ActionListener
			
			for (int i = 0; i < menuItem.length; i++) {
				menuItem[i] = new JMenuItem(itemTitle[i]);
				menuItem[i].addActionListener(menuListener);
				selectPaintMenu.add(menuItem[i]);
				menuItem[i].setBackground(Color.YELLOW);							//메뉴아이탬 색지정
			}
			
			//종료 메뉴 아이탬 (새로운 사진이 추가될 경우에도 항상 종료 메뉴를 가장 아래에 위치시키기 위하여 따로 빼놓았습니다)
			ExitActionListener exitListener = new ExitActionListener();
			JMenuItem exitItem = new JMenuItem("종료");
			exitItem.setBackground(Color.YELLOW);
			exitItem.addActionListener(exitListener);
			
			selectPaintMenu.addSeparator();
			selectPaintMenu.add(exitItem);		
			
			//메뉴바 등록
			mb.add(selectPaintMenu);
			setJMenuBar(mb);
		}
		
		//---------- 그림선택 ActionListener ----------
		class MenuActionListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				switch(cmd) {
					case "공학페스티벌" :
						img = imageIcon[0].getImage();			//메뉴 선택시 전역변수 img에 들어갈 사진 선택
						break;
					case "캡스톤" :
						img = imageIcon[1].getImage();
						break;
					case "창의경진" :
						img = imageIcon[2].getImage();
						break;
					case "사진" :
						img = imageIcon[3].getImage();
						break;
				}
			}
			
		}
		
		//---------- 종료 ActionListener ----------
		class ExitActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
	
	
	//---------- 가변 이미지를 담기 위한 JPanel ----------
	class MyPanel extends JPanel {
		private Point start = null, end = null; 

		public MyPanel() {
			MyMouseListener listener = new MyMouseListener();

			addMouseListener(listener);
			addMouseMotionListener(listener);
		}

		class MyMouseListener extends MouseAdapter {
			public void mousePressed(MouseEvent e) {
				start = e.getPoint();
			}

			public void mouseDragged(MouseEvent e) {
				end = e.getPoint();
				repaint(); // 패널의 그리기 요청 주목
			}
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (start == null)
				return;
			int x = Math.min(start.x, end.x);
			int y = Math.min(start.y, end.y);
			int width = Math.abs(start.x - end.x);
			int height = Math.abs(start.y - end.y);
			g.drawImage(img, x, y, width, height, this);
		}
	}
	
	//---------- main ----------
	public static void main(String[] args) {
		new DragImagesFx();
	}

}
