package rectArray;
import java.util.Scanner;

class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() { return width * height; }
}

public class RectArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Rect[] rect = new Rect[4];
		int input[] = new int[2];
		int tot = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print(i+1 + " 너비와 높이 >>");
			for (int j = 0; j < 2; j++) { input[j] = scanner.nextInt(); }
			rect[i] = new Rect(input[0], input[1]); 
		}
		System.out.println("저장하였습니다...");
		
		for (int i = 0; i < 4; i++) {
			tot += rect[i].getArea();
		}
		System.out.println("사각형의 전체 합은 " + tot);
	}

}
