package blank;

//2015108223 ���ڰ��а� �赿��

import java.util.*;		//Scanner �� StringToken Ŭ������ �ʿ��մϴ�

public class Blank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String st;										//������ �Է��� ���ڿ� �������
		
		for (;;) {
			st = scanner.nextLine();					//���ڿ� �б�
			
			if (st.equals("exit")) {					//���� ������ Ż������
				System.out.println("�����մϴ�...");
				break;
			}
			
			StringTokenizer sToken = new StringTokenizer(st, " ");		//������ �������� ��ū�� �����ϴ�
			System.out.println("���� ������ " + sToken.countTokens());		//��ū ���� ���
			
		}

	}

}
