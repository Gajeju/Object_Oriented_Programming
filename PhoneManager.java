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
			System.out.println(name+"�� ��ȣ�� "+tel+" �Դϴ�.");
			return 1;
		} else return 0;
		
	}
	
}

public class PhoneManager {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		int people;
		String searchName;
		
		System.out.print("�ο���>>");
		people = scanner.nextInt();
		
		Phone phone[] = new Phone[people];
		String phoneObject[] = new String[2];
		
		for (int i = 0; i < people; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>");
			for (int j = 0; j < 2; j++) {
				phoneObject[j] = scanner.next();
			}
			phone[i] = new Phone(phoneObject[0], phoneObject[1]);
		}
		
		System.out.println("����Ǿ����ϴ�...");
		for (;;) {
			System.out.print("�˻��� �̸�>>");
			searchName = scanner.next();
			int result = 0;
			
			for (int i = 0; i < people; i++) {
				result = phone[i].findTel(searchName);
				if (result == 1) break;
			}
			
			if (searchName.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			} else if (result == 0) {
				System.out.println(searchName + " �� �����ϴ�.");
			}
		}

	}

}
