package phoneManager;
import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	int findTel (String name) {
		if (this.name.contentEquals(name)) {
			System.out.println(name+"의 번호는 "+tel+" 입니다.");
			return 1;
		} else return 0;
		
	}
	
}

public class PhoneManager {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		int people;
		String searchName;
		
		System.out.print("인원수>>");
		people = scanner.nextInt();
		
		Phone phone[] = new Phone[people];
		String phoneObject[] = new String[2];
		
		for (int i = 0; i < people; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			for (int j = 0; j < 2; j++) {
				phoneObject[j] = scanner.next();
			}
			phone[i] = new Phone(phoneObject[0], phoneObject[1]);
		}
		
		System.out.println("저장되었습니다...");
		for (;;) {
			System.out.print("검색할 이름>>");
			searchName = scanner.next();
			int result = 0;
			
			for (int i = 0; i < people; i++) {
				result = phone[i].findTel(searchName);
				if (result == 1) break;
			}
			
			if (searchName.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			} else if (result == 0) {
				System.out.println(searchName + " 이 없습니다.");
			}
		}

	}

}
