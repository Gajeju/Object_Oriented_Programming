package translate;
import java.util.Scanner;

public class Translate {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String eng[] = {"student", "love", "java", "happy", "future" };
		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
		String user;
		
		for(;;)	{
			
			System.out.print("영어 단어를 입력하세요>>");
			user = scanner.next();
			
			for (int i = 0; i < 5; i++) {
				if (eng[i].contentEquals(user))
					System.out.println(kor[i]);
			}
			
			if (user.contentEquals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
		}
	}
}
