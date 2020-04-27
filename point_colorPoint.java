//2015108223 ���ڰ��а� �赿��

class Point  {												//�־��� Ŭ����
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y;}
}

class ColorPoint extends Point {							//����Ŭ����
	
	private String color;
	
	public ColorPoint(int x, int y, String color) {			//������ x, y , color �ʱ�ȭ
		super(x, y);
		this.color = color;
	}
	public void setPoint(int x, int  y) {					//x, y�� ���� ��ӹ��� move() �޼ҵ� ����մϴ�
		move(x, y);
	}
	public void setColor(String color)						//color �ɹ��� ����
	{
		this.color = color;
	}
	public String getColor() {								//private �ɹ��� ������ ���� get �޼ҵ�
		return color;
	}
	
	public void show() {									//�־��� ������� ����ϴ� �޼ҵ�
		System.out.println(getColor() + "������" + "(" + getX() + "," + getY() + ")");
	}
}

public class point_colorPoint {								//�־��� ������ main�޼ҵ� �Դϴ�

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();

	}

}
