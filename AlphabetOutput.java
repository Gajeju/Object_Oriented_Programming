package alphabetOutput;
import java.util.Scanner; 

public class AlphabetOutput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char user_input;
		
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>>");
		user_input = scanner.next().charAt(0);
		
		for (char i = 97; i <= user_input; i++)	{
			
			for (char j = i; j <= user_input; j++ )	{
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
