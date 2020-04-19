package box;

public class Box {
	private int width, height;
	private char fillchar;
	
	public Box() {			//10x1 �ڽ�
		this(10,1);
	}
	
	public Box(int width, int height) {		//�ʺ�, ���� ���� ������
		this.width = width;
		this.height = height;
	}
	
	public void draw() {		//�ڽ��� �׸��� �޼ҵ�
		for (int i = 0; i < height; i++)
		{
				for (int j = 0; j < width; j++) {
					System.out.print(fillchar);
				}
				System.out.println("");
		}
	}
	
	public void fill(char c) {		//���� ����
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
