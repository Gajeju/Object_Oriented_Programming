package int_array;
import java.util.Scanner;

public class Int_array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		System.out.print("정수 10개 입력>>");
		
		for (int i = 0; i < 10; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			if (arr[i] % 3 == 0)
				System.out.print(arr[i] + " ");
		}
		
	}

}
