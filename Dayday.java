package dayday;
import java.util.Scanner;

public class Dayday {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		char day[] = {'일', '월', '화', '수', '목', '금', '토'};
		String user_input;
		int number;
		
		for (;;)
		{
			System.out.print("정수를 입력하세요>>");
			user_input = scanner.nextLine();	
		
			try {
				number = Integer.parseInt(user_input);
				
				if (number < 0) {
					System.out.println("프로그램을 종료합니다...");
					break;
				}
				else {
					number = number % 7;
					System.out.println(day[number]);
					break;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
			}
		}
	}

}
