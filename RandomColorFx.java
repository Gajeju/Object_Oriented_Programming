package randomColorFx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//2015108223 전자공학과 김동현

public class RandomColorFx extends JFrame {
	public RandomColorFx() {
		this.setTitle("java");									//제공된 이미지와 같게 만들기위한 타이틀
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());						//동서남북중간 사용
		
		this.setSize(300, 300);
		this.setVisible(true);
		
		//------------패널 생성------------
		JButton Up = new JButton("위");
		JButton Down = new JButton("아래");
		JButton Left = new JButton("왼쪽");
		JButton Right = new JButton("오른쪽");
		JButton Center = new JButton("전자공학과_김동현");
		
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
		
		//------------이벤트------------
		Up.addMouseListener(new CCMouseListener());
		Down.addMouseListener(new CCMouseListener());
		Left.addMouseListener(new CCMouseListener());
		Right.addMouseListener(new CCMouseListener());
		Center.addMouseListener(new CCMouseListener());
		
		Center.addMouseListener(new EnteredMouseListener());
		Center.addMouseListener(new ExitedMouseListener());
		
	}
	
	//마우스르 올렸을때 색이 변하는 이벤트 리스너
	class CCMouseListener extends MouseAdapter {			//Change Color MouseListener
		public void mouseClicked(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			b.setBackground(randomColor());
			
		}
	}
	
	//가운데 마우스를 올리면 문자열이 변경되는 이벤트 리스너
	class EnteredMouseListener extends MouseAdapter {		
		public void mouseEntered(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			b.setText("객체지향프로그래밍");
		}
	}
	
	//가운데 마우스를 내리면 문자열이 변경되는 이벤트 리스너
		class ExitedMouseListener extends MouseAdapter {	
			public void mouseExited(MouseEvent e) {
				JButton b = (JButton)e.getSource();
				b.setText("전자공학과_김동현");
			}
		}
	
	
	//메인 함수
	public static void main(String[] args) {
		new RandomColorFx();	
	}
	
	//랜덤색 변경 사용자정의 메소드
	public Color randomColor() {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		
		return new Color(r, g, b);
	}

}
