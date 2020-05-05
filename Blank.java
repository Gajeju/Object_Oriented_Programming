package blank;

//2015108223 전자공학과 김동현

import java.util.*;		//Scanner 와 StringToken 클래스가 필요합니다

public class Blank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String st;										//유저가 입력한 문자열 저장공간
		
		for (;;) {
			st = scanner.nextLine();					//문자열 읽기
			
			if (st.equals("exit")) {					//무한 루프문 탈출조건
				System.out.println("종료합니다...");
				break;
			}
			
			StringTokenizer sToken = new StringTokenizer(st, " ");		//공백을 기준으로 토큰을 나눕니다
			System.out.println("어절 개수는 " + sToken.countTokens());		//토큰 개수 출력
			
		}

	}

}
