package box;

//2015108223 전자공학과 김동현

public class Box {
	private int width, height;
	private char fillchar;
	
	public Box() {			//10x1 박스
		this(10,1);
	}
	
	public Box(int width, int height) {		//너비, 높이 가진 생성자
		this.width = width;
		this.height = height;
	}
	
	public void draw() {		//박스를 그리는 메소드
		for (int i = 0; i < height; i++)
		{
				for (int j = 0; j < width; j++) {
					System.out.print(fillchar);
				}
				System.out.println("");
		}
	}
	
	
	public void fill(char c) {		//문자 설정
		fillchar = c;
	}
	
	public static void main(String[] args) {
		Box a = new Box();
		Box b = new Box(20,3);
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();

	}

}
