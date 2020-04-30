package shpaeApp;

//2015108223 전자공학과 김동현
interface Shape {										//주어진 Shape 인터페이스 입니다
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("--- 다시 그립니다. ---");
		draw();
	}
}

class Circle implements Shape {							//인터페이스 기반 Circle 클래스입니다
														//인터페이스의 추상메소드 draw(), getArea() 의 구현이 필요합니다
	private int radius;

	public Circle(int radius) {							//radius를 초기화하는 생성자
		this.radius = radius;
	}
	public void draw() {								//인터페이스 메소드
		System.out.print("반지름 " + radius + " ");
	}
	public double getArea() {
		return radius * radius * PI;
	}
}

class Rectangle implements Shape {						//직사각형을 나타내는 Rectangle 클래스입니다
	private int width;									//가로
	private int height;									//세로
	
	public Rectangle(int width, int height) {			//가로, 세로 정보를 입력받아서 필드에 입력하는 생성자
		this.width = width;
		this.height = height;
	}
	public void draw() {								//draw 오버라이드
		System.out.print("가로 " + width + " 세로 " + height + " ");
	}
	//입력받은 데이터가 정수이기 때문에 리터타입도 정수임이 바람직하지만 Circle의 draw는 항상 실수형이 리턴값이 생기므로 double리턴값 사용
	public double getArea() {							
		return width * height;
	}	
}

public class ShpaeApp {

	public static void main(String[] args) {
		Shape coin = new Circle(10);
		coin.redraw();
		System.out.println("코인의 면적은 " + coin.getArea());
		
		System.out.println("");							//개행
		//Rectangle 클래스 사용 부분 추가
		Shape book = new Rectangle(10, 20);
		book.redraw();
		System.out.println("책의 면적은 " + book.getArea());
	}
}
