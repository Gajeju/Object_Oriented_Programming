package coffeeHash;

import java.util.*;

//2015108223 전자공학과 김동현

public class CoffeeHash {

	public static void main(String[] args) {
		//HashMap 생성 및 데이터 저장
		HashMap<String, Integer> coffee = new HashMap<String, Integer>();
		coffee.put("에스프레소", 2000);
		coffee.put("아메리카노", 2500);
		coffee.put("카푸치노", 3000);
		coffee.put("카페라떼", 3500);
		
		//사용자 입력에 따른 동작
		Scanner scanner = new Scanner(System.in);
		String order;
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다");
		for (;;){
			System.out.print("주문 >> ");
			order = scanner.next();
			if (coffee.containsKey(order))
				System.out.println(order + "는 " + coffee.get(order) + "입니다.");
			else if(order.equals("그만"))
				break;
			else
				System.out.println("제공하지 않는 메뉴입니다.");			//예외처리
		}	

	}

}
