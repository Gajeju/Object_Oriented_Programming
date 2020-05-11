package statureVector;

//2015108223 전자공학과 김동현

import java.util.*;

class Stature {				//년도, 키, 증가량을 모두 포함하는 클래스
	double height;
	double diff;
	int year;
	
	public Stature(double height, int year)	{		//생성자
		this.height = height;
		this.year = year;
	}
}

public class statureVector {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double height;									//사용자 입력변수
		
		//벡터생성
		Vector<Stature> v = new Vector<Stature>();
		
		//사용자 입력
		System.out.print("2000~2009년까지 1년 단위로 키(cm)를 입력 \n>>");
		for (int i = 0; i < 10; i++) {					
			height = scanner.nextDouble();
			v.add(new Stature(height, i+2000));			//year와 height 초기화
		}
		
		for (int i = 0; i < 9; i++) {					//diff(증가량) 초기화
			v.get(i).diff = (v.get(i+1).height - v.get(i).height);
		}
		
		//결과 출력
		Stature max = v.get(0);							//diff값 중 가장 큰 값을 찾습니다
		for (int i = 1; i < 9; i++) {
			max = (max.diff > v.get(i).diff) ? max : v.get(i);
			
		}
		
		System.out.println("가장 키가 많이 자란 년도는 " + max.year + "년 " + max.diff + "cm");
	}
}
