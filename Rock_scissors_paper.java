package rock_scissors_paper;
import java.util.Scanner;

//2015108223 ���ڰ��а� �赿��

public class Rock_scissors_paper {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		String user;
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.print("���� ���� ��!>>");
			user = scanner.next();
			
			if (str[n].equals(user)) {
			
				System.out.println("����� = " + user + " , ��ǻ�� = " + str[n] + ", �����ϴ�.");

			} else if ((n-1 == -1 ? str[n+2] : str[n-1]).equals(user)) {
						
				System.out.println("����� = " + user + " , ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				
			} else if ((n+1 == 3 ? str[n-2] : str[n+1]).equals(user)) {
						
				System.out.println("����� = " + user + " , ��ǻ�� = " + str[n] + ", ������ �̰���ϴ�.");
				
			}

			if (user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
		}

	}
	
}


