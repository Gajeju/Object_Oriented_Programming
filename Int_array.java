package int_array;
import java.util.Scanner;

public class Int_array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		System.out.print("���� 10�� �Է�>>");
		
		for (int i = 0; i < 10; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			if (arr[i] % 3 == 0)
				System.out.print(arr[i] + " ");
		}
		
	}

}
