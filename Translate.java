package translate;
import java.util.Scanner;

public class Translate {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String eng[] = {"student", "love", "java", "happy", "future" };
		String kor[] = {"�л�", "���", "�ڹ�", "�ູ��", "�̷�"};
		String user;
		
		for(;;)	{
			
			System.out.print("���� �ܾ �Է��ϼ���>>");
			user = scanner.next();
			
			for (int i = 0; i < 5; i++) {
				if (eng[i].contentEquals(user))
					System.out.println(kor[i]);
			}
			
			if (user.contentEquals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
		}
	}
}
