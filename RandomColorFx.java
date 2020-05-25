package randomColorFx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//2015108223 ���ڰ��а� �赿��

public class RandomColorFx extends JFrame {
	public RandomColorFx() {
		this.setTitle("java");									//������ �̹����� ���� ��������� Ÿ��Ʋ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());						//���������߰� ���
		
		this.setSize(300, 300);
		this.setVisible(true);
		
		//------------�г� ����------------
		JButton Up = new JButton("��");
		JButton Down = new JButton("�Ʒ�");
		JButton Left = new JButton("����");
		JButton Right = new JButton("������");
		JButton Center = new JButton("���ڰ��а�_�赿��");
		
		c.add(Up, BorderLayout.NORTH);
		c.add(Down, BorderLayout.SOUTH);
		c.add(Left, BorderLayout.WEST);
		c.add(Right, BorderLayout.EAST);
		c.add(Center, BorderLayout.CENTER);
		
		Up.setBackground(randomColor());
		Down.setBackground(randomColor());
		Left.setBackground(randomColor());
		Right.setBackground(randomColor());
		Center.setBackground(randomColor());
		
		//------------�̺�Ʈ------------
		Up.addMouseListener(new CCMouseListener());
		Down.addMouseListener(new CCMouseListener());
		Left.addMouseListener(new CCMouseListener());
		Right.addMouseListener(new CCMouseListener());
		Center.addMouseListener(new CCMouseListener());
		
		Center.addMouseListener(new EnteredMouseListener());
		Center.addMouseListener(new ExitedMouseListener());
		
	}
	
	//���콺�� �÷����� ���� ���ϴ� �̺�Ʈ ������
	class CCMouseListener extends MouseAdapter {			//Change Color MouseListener
		public void mouseClicked(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			b.setBackground(randomColor());
			
		}
	}
	
	//��� ���콺�� �ø��� ���ڿ��� ����Ǵ� �̺�Ʈ ������
	class EnteredMouseListener extends MouseAdapter {		
		public void mouseEntered(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			b.setText("��ü�������α׷���");
		}
	}
	
	//��� ���콺�� ������ ���ڿ��� ����Ǵ� �̺�Ʈ ������
		class ExitedMouseListener extends MouseAdapter {	
			public void mouseExited(MouseEvent e) {
				JButton b = (JButton)e.getSource();
				b.setText("���ڰ��а�_�赿��");
			}
		}
	
	
	//���� �Լ�
	public static void main(String[] args) {
		new RandomColorFx();	
	}
	
	//������ ���� ��������� �޼ҵ�
	public Color randomColor() {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		
		return new Color(r, g, b);
	}

}
