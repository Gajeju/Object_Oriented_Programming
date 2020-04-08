package phone;
import java.util.Scanner;

//2015108223 전자공학과 김동현

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
		String info[] = new String[2];		//이름과 전화번호 저장
		Phone phone[] = new Phone[2];		//Phone 클래스의 객체 저장공간 2개
		
		//---------------입 력---------------		
		for (int i = 0; i < 2; i++) {
			System.out.print("이름과 전화번호 입력 >>");
			
			for (int j = 0; j < 2; j++) {
				info[j] = scanner.next();	
			}
			
		phone[i] = new Phone(info[0], info[1]);
		}
		
		//---------------출 력---------------
		for (int i = 0; i < 2; i++)  {
			System.out.println(phone[i].getName() + "의 번호 " + phone[i].getTel());
		}
	}
}
