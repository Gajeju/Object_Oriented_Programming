package shpaeApp;

//2015108223 ���ڰ��а� �赿��
interface Shape {										//�־��� Shape �������̽� �Դϴ�
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("--- �ٽ� �׸��ϴ�. ---");
		draw();
	}
}

class Circle implements Shape {							//�������̽� ��� Circle Ŭ�����Դϴ�
														//�������̽��� �߻�޼ҵ� draw(), getArea() �� ������ �ʿ��մϴ�
	private int radius;

	public Circle(int radius) {							//radius�� �ʱ�ȭ�ϴ� ������
		this.radius = radius;
	}
	public void draw() {								//�������̽� �޼ҵ�
		System.out.print("������ " + radius + " ");
	}
	public double getArea() {
		return radius * radius * PI;
	}
}

class Rectangle implements Shape {						//���簢���� ��Ÿ���� Rectangle Ŭ�����Դϴ�
	private int width;									//����
	private int height;									//����
	
	public Rectangle(int width, int height) {			//����, ���� ������ �Է¹޾Ƽ� �ʵ忡 �Է��ϴ� ������
		this.width = width;
		this.height = height;
	}
	public void draw() {								//draw �������̵�
		System.out.print("���� " + width + " ���� " + height + " ");
	}
	//�Է¹��� �����Ͱ� �����̱� ������ ����Ÿ�Ե� �������� �ٶ��������� Circle�� draw�� �׻� �Ǽ����� ���ϰ��� ����Ƿ� double���ϰ� ���
	public double getArea() {							
		return width * height;
	}	
}

public class ShpaeApp {

	public static void main(String[] args) {
		Shape coin = new Circle(10);
		coin.redraw();
		System.out.println("������ ������ " + coin.getArea());
		
		System.out.println("");							//����
		//Rectangle Ŭ���� ��� �κ� �߰�
		Shape book = new Rectangle(10, 20);
		book.redraw();
		System.out.println("å�� ������ " + book.getArea());
	}
}
