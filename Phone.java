package phone;
import java.util.Scanner;

//2015108223 ���ڰ��а� �赿��

public class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {return name;};
	public String getTel() {return tel;};
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String info[] = new String[2];		//�̸��� ��ȭ��ȣ ����
		Phone phone[] = new Phone[2];		//Phone Ŭ������ ��ü ������� 2��
		
		//---------------�� ��---------------		
		for (int i = 0; i < 2; i++) {
			System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
			
			for (int j = 0; j < 2; j++) {
				info[j] = scanner.next();	
			}
			
		phone[i] = new Phone(info[0], info[1]);
		}
		
		//---------------�� ��---------------
		for (int i = 0; i < 2; i++)  {
			System.out.println(phone[i].getName() + "�� ��ȣ " + phone[i].getTel());
		}
	}
}
