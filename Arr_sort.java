package arr_sort;
import java.util.Scanner;

public class Arr_sort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
		int temp;
		
		System.out.print("정수 10개 입력>>");
		for (int i = 0; i < 10; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}
