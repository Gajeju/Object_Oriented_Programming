package even_odd;
import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String user_input;
		
		System.out.print("정수를 입력하세요>>");
		user_input = scanner.nextLine();
		int number;
		
		try {
			number = Integer.parseInt(user_input);
			if (number % 2 == 0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
			
		} catch (NumberFormatException e) {
			System.out.println("수를 입력하지 않아 프로그램 종료합니다");	
		}
	}
}
