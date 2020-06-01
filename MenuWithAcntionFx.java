package menuWithAcntionFx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//2015108223 전자공학과 김동현

public class MenuWithAcntionFx extends JFrame {

	//사진을 담을 JLebel과 ImageIcon의 객체
	public JLabel imgLabel = new JLabel();
	public ImageIcon imageIcon [] = {new ImageIcon("images/festival.jpg"),
									 new ImageIcon("images/capstone.jpg"),
									 new ImageIcon("images/creative.jpg"),
									 new ImageIcon("images/image.jpg")};
	//---------- 생성자 ----------
	public MenuWithAcntionFx() {
		this.setTitle("Menu에 ACtion 리스너 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		setSize(1024, 768);
		this.setVisible(true);
		
		creatMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
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
					imgLabel.setIcon(imageIcon[0]);
					break;
				case "캡스톤" :
					imgLabel.setIcon(imageIcon[1]);
					break;
				case "창의경진" :
					imgLabel.setIcon(imageIcon[2]);
					break;
				case "사진" :
					imgLabel.setIcon(imageIcon[3]);
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
	
	//---------- main ----------
	public static void main(String[] args) {
		new MenuWithAcntionFx();
	}

}
