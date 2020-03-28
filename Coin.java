package coin;
import java.util.Scanner;

//2015108223 전자공학과 김동현

public class Coin {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//--------------사용 변수--------------
		int user_input_money;
		int coinArr[] = {0,0,0,0,0,0,0};
		int coinValue[] = {50000, 10000, 1000, 500 ,100 ,10 ,1};
		String coinValueStr[] = {"오만", "만", "천", "500", "100", "10", "1"};
			
		//--------------입  력--------------
		System.out.print("돈의 액수를 입력하세요>>");
		user_input_money = scanner.nextInt();
		
		//--------------계  산--------------
		for (int i = 0; i < 7; i++) {
			coinArr[i] = user_input_money / coinValue[i];
			user_input_money = user_input_money - (coinArr[i] * coinValue[i]);
			
		}
		
		//--------------출  력--------------
		for (int i = 0; i < 7; i++) {
			System.out.print(coinValueStr[i] + "원" + coinArr[i] + "개");
			
			if (i != 6) {
				System.out.print(", ");
			}
		}
	}

}
