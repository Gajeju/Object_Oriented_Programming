package menuWithAcntionFx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//2015108223 ���ڰ��а� �赿��

public class MenuWithAcntionFx extends JFrame {

	//������ ���� JLebel�� ImageIcon�� ��ü
	public JLabel imgLabel = new JLabel();
	public ImageIcon imageIcon [] = {new ImageIcon("images/festival.jpg"),
									 new ImageIcon("images/capstone.jpg"),
									 new ImageIcon("images/creative.jpg"),
									 new ImageIcon("images/image.jpg")};
	//---------- ������ ----------
	public MenuWithAcntionFx() {
		this.setTitle("Menu�� ACtion ������ ����� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		setSize(1024, 768);
		this.setVisible(true);
		
		creatMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
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
					imgLabel.setIcon(imageIcon[0]);
					break;
				case "ĸ����" :
					imgLabel.setIcon(imageIcon[1]);
					break;
				case "â�ǰ���" :
					imgLabel.setIcon(imageIcon[2]);
					break;
				case "����" :
					imgLabel.setIcon(imageIcon[3]);
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
	
	//---------- main ----------
	public static void main(String[] args) {
		new MenuWithAcntionFx();
	}

}
