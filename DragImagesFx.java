package dragImagesFx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class DragImagesFx extends JFrame {
	public Image img;

	 URL imageURL[] = {														//jar���Ͽ� �̹����� ���Խ�Ű�� ���� ���ҽ�
			 getClass().getClassLoader().getResource("festival.jpg"),
			 getClass().getClassLoader().getResource("capstone.jpg"),
			 getClass().getClassLoader().getResource("creative.jpg"),
			 getClass().getClassLoader().getResource("image.jpg"),
	 };
	
	public ImageIcon imageIcon [] = {new ImageIcon(imageURL[0]),
									 new ImageIcon(imageURL[1]),
									 new ImageIcon(imageURL[2]),
									 new ImageIcon(imageURL[3])};
	
	//---------- ������ ----------
	public DragImagesFx() {
		setTitle("������� �̹��� ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		creatMenu();
		setContentPane(new MyPanel());
		setSize(1024, 768);
		setVisible(true);
	}
	
	//---------- �޴� ���� ----------
		public void creatMenu() {
			JMenuBar mb = new JMenuBar();											//�޴���
			mb.setBackground(Color.CYAN);											//�޴��� ������
			JMenu selectPaintMenu = new JMenu("�׸�����");								//�޴�
			
			//�׸� �޴� ������
			JMenuItem [] menuItem = new JMenuItem [4];								//�׸� �޴� ������
			String itemTitle[] = {"�����佺Ƽ��", "ĸ����", "â�ǰ���", "����"};				//�޴� �������� Ÿ��Ʋ
			
			MenuActionListener menuListener = new MenuActionListener();				//ActionListener
			
			for (int i = 0; i < menuItem.length; i++) {
				menuItem[i] = new JMenuItem(itemTitle[i]);
				menuItem[i].addActionListener(menuListener);
				selectPaintMenu.add(menuItem[i]);
				menuItem[i].setBackground(Color.YELLOW);							//�޴������� ������
			}
			
			//���� �޴� ������ (���ο� ������ �߰��� ��쿡�� �׻� ���� �޴��� ���� �Ʒ��� ��ġ��Ű�� ���Ͽ� ���� �����ҽ��ϴ�)
			ExitActionListener exitListener = new ExitActionListener();
			JMenuItem exitItem = new JMenuItem("����");
			exitItem.setBackground(Color.YELLOW);
			exitItem.addActionListener(exitListener);
			
			selectPaintMenu.addSeparator();
			selectPaintMenu.add(exitItem);		
			
			//�޴��� ���
			mb.add(selectPaintMenu);
			setJMenuBar(mb);
		}
		
		//---------- �׸����� ActionListener ----------
		class MenuActionListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				switch(cmd) {
					case "�����佺Ƽ��" :
						img = imageIcon[0].getImage();			//�޴� ���ý� �������� img�� �� ���� ����
						break;
					case "ĸ����" :
						img = imageIcon[1].getImage();
						break;
					case "â�ǰ���" :
						img = imageIcon[2].getImage();
						break;
					case "����" :
						img = imageIcon[3].getImage();
						break;
				}
			}
			
		}
		
		//---------- ���� ActionListener ----------
		class ExitActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
	
	
	//---------- ���� �̹����� ��� ���� JPanel ----------
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
				repaint(); // �г��� �׸��� ��û �ָ�
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
