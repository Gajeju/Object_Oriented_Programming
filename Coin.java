package coin;
import java.util.Scanner;

//2015108223 ���ڰ��а� �赿��

public class Coin {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//--------------��� ����--------------
		int user_input_money;
		int coinArr[] = {0,0,0,0,0,0,0};
		int coinValue[] = {50000, 10000, 1000, 500 ,100 ,10 ,1};
		String coinValueStr[] = {"����", "��", "õ", "500", "100", "10", "1"};
			
		//--------------��  ��--------------
		System.out.print("���� �׼��� �Է��ϼ���>>");
		user_input_money = scanner.nextInt();
		
		//--------------��  ��--------------
		for (int i = 0; i < 7; i++) {
			coinArr[i] = user_input_money / coinValue[i];
			user_input_money = user_input_money - (coinArr[i] * coinValue[i]);
			
		}
		
		//--------------��  ��--------------
		for (int i = 0; i < 7; i++) {
			System.out.print(coinValueStr[i] + "��" + coinArr[i] + "��");
			
			if (i != 6) {
				System.out.print(", ");
			}
		}
	}

}
