package dayday;
import java.util.Scanner;

public class Dayday {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		char day[] = {'��', '��', 'ȭ', '��', '��', '��', '��'};
		String user_input;
		int number;
		
		for (;;)
		{
			System.out.print("������ �Է��ϼ���>>");
			user_input = scanner.nextLine();	
		
			try {
				number = Integer.parseInt(user_input);
				
				if (number < 0) {
					System.out.println("���α׷��� �����մϴ�...");
					break;
				}
				else {
					number = number % 7;
					System.out.println(day[number]);
					break;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
			}
		}
	}

}
