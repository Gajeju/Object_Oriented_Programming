//2015108223 전자공학과 김동현

class Point  {												//주어진 클래스
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y;}
}

class ColorPoint extends Point {							//서브클래스
	
	private String color;
	
	public ColorPoint(int x, int y, String color) {			//생성자 x, y , color 초기화
		super(x, y);
		this.color = color;
	}
	public void setPoint(int x, int  y) {					//x, y의 수정 상속받은 move() 메소드 사용합니다
		move(x, y);
	}
	public void setColor(String color)						//color 맴버의 수정
	{
		this.color = color;
	}
	public String getColor() {								//private 맴버의 접근을 위한 get 메소드
		return color;
	}
	
	public void show() {									//주어진 방법으로 출력하는 메소드
		System.out.println(getColor() + "색으로" + "(" + getX() + "," + getY() + ")");
	}
}

public class point_colorPoint {								//주어진 형식의 main메소드 입니다

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();

	}

}
