package even_odd;
import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String user_input;
		
		System.out.print("������ �Է��ϼ���>>");
		user_input = scanner.nextLine();
		int number;
		
		try {
			number = Integer.parseInt(user_input);
			if (number % 2 == 0)
				System.out.println("¦��");
			else
				System.out.println("Ȧ��");
			
		} catch (NumberFormatException e) {
			System.out.println("���� �Է����� �ʾ� ���α׷� �����մϴ�");	
		}
	}
}
