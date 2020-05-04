package randomRSP;

import java.util.Scanner;

//2015108223 ���ڰ��а� �赿��

public class RandomRSP {

	public static void compare(int user, int comp) {
		String rsp[] = {" ", "����", "����", "��"};				//����� ����ȭ�� ���� ���� ���� ���� ������ String �迭
		
		if (user == comp) {
			System.out.println("�����  " + rsp[user] + " : ��ǻ�� " + rsp[comp] + "\n�����ϴ�.");

		} else if ((comp == 1 ? 3 : comp - 1) == user) {
					
			System.out.println("�����  " + rsp[user] + " : ��ǻ�� " + rsp[comp] + "\n����ڰ� �����ϴ�.");
			
		} else if ((comp == 3 ? 1 : comp + 1) == user) {
					
			System.out.println("�����  " + rsp[user] + " : ��ǻ�� " + rsp[comp] + "\n����ڰ� �̰���ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int user;														//���� �Է� ����
		int comp;														//��ǻ�� ���� ����
		
		for (;;) {
			System.out.print("����(1), ����(2), ��(3), ������(4)>>");
			comp = (int)(Math.random()*3) + 1;							//1, 2, 3 �� �ϳ��� ���� �� ����
			user = scanner.nextInt();
			
			if (user == 4)												//���ѷ��� Ż������
			{
				System.out.println("������ �����մϴ�.");
				scanner.close();
				break;
			}
			
		compare(user, comp);											//�� �� �� �Ͽ� ���������� ��� ���
			
		}
 
	}

}
