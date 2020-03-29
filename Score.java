package score;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String score;
		
		System.out.print("학점을 입력하세요>>");
		score = scanner.next();
		
		switch(score) {	
			case "A" :
				System.out.println("Excellent");
				break;
			case "B" :
				System.out.println("Excellent");
				break;
			case "C" :
				System.out.println("Good");
				break;
			case "D" :
				System.out.println("Good");
				break;
			case "F" :
				System.out.println("Bye");
				break;
		
		}
	}

}
