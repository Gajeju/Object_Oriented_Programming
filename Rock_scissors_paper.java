package rock_scissors_paper;
import java.util.Scanner;

//2015108223 전자공학과 김동현

public class Rock_scissors_paper {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		String user;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.print("가위 바위 보!>>");
			user = scanner.next();
			
			if (str[n].equals(user)) {
			
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[n] + ", 비겼습니다.");

			} else if ((n-1 == -1 ? str[n+2] : str[n-1]).equals(user)) {
						
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
				
			} else if ((n+1 == 3 ? str[n-2] : str[n+1]).equals(user)) {
						
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[n] + ", 유저가 이겼습니다.");
				
			}

			if (user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
		}

	}
	
}


