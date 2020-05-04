package randomRSP;

import java.util.Scanner;

//2015108223 전자공학과 김동현

public class RandomRSP {

	public static void compare(int user, int comp) {
		String rsp[] = {" ", "가위", "바위", "보"};				//출력의 간소화를 위한 가위 바위 보를 저장한 String 배열
		
		if (user == comp) {
			System.out.println("사용자  " + rsp[user] + " : 컴퓨터 " + rsp[comp] + "\n비겼습니다.");

		} else if ((comp == 1 ? 3 : comp - 1) == user) {
					
			System.out.println("사용자  " + rsp[user] + " : 컴퓨터 " + rsp[comp] + "\n사용자가 졌습니다.");
			
		} else if ((comp == 3 ? 1 : comp + 1) == user) {
					
			System.out.println("사용자  " + rsp[user] + " : 컴퓨터 " + rsp[comp] + "\n사용자가 이겼습니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int user;														//유저 입력 변수
		int comp;														//컴퓨터 랜덤 변수
		
		for (;;) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			comp = (int)(Math.random()*3) + 1;							//1, 2, 3 중 하나의 랜덤 수 생성
			user = scanner.nextInt();
			
			if (user == 4)												//무한루프 탈출조건
			{
				System.out.println("게임을 종료합니다.");
				scanner.close();
				break;
			}
			
		compare(user, comp);											//두 수 비교 하여 가위바위보 결과 출력
			
		}
 
	}

}
