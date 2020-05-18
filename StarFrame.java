package starFrame;

import javax.swing.*;
import java.awt.*;

//2015108223 전자공학과 김동현

public class StarFrame extends JFrame{
	public StarFrame() {
		setTitle("3개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		//3개의 패널 생성 및 프레임에 추가 
		JPanel buttonPanel = new JPanel();
		JPanel starPanel = new JPanel();
		JPanel textPanel = new JPanel();
		
		contentPane.add(buttonPanel, BorderLayout.NORTH);
		contentPane.add(starPanel, BorderLayout.CENTER);
		contentPane.add(textPanel, BorderLayout.SOUTH);
		
		//첫 번째 패널 설정 및 버튼 2개 추가
		buttonPanel.setBackground(Color.YELLOW);
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(new JButton("새로 배치"));
		buttonPanel.add(new JButton("종료"));
		
		//두 번째 패널 설정 및 JLabel을 사용하여 랜덤위치 별 추가
		starPanel.setLayout(null);
		starPanel.setBackground(Color.WHITE);
		for (int i = 0; i < 10; i++) {
			int x = (int)(Math.random()*400 + 50);	//프레임의 크기 500 * 400 내에 존재하도록 설정
			int y = (int)(Math.random()*200 + 50);
			JLabel star[] = new JLabel[10];			//별을 출력할 JLabel 10개 생성
			star[i] = new JLabel("*");
			star[i].setSize(20, 20);
			star[i].setLocation(x,y);
			star[i].setForeground(Color.RED);
			starPanel.add(star[i]);
		}
		//소속 & 이름 출력
		JLabel name = new JLabel("전자공학과 김동현");
		name.setSize(200,20);
		name.setLocation(5,5);
		starPanel.add(name);
		
		//세 번째 패널 설정 및 버튼과 텍스트바 추가
		textPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		textPanel.add(new JButton("별 개수 수정"));
		textPanel.add(new JTextField(20));
		textPanel.setBackground(Color.GRAY);
		
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new StarFrame();
	}

}
