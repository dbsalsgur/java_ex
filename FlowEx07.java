import java.util.Scanner;
class FlowEx07 {
	public static void main(String[] args){
		int user, com;

		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		user = Integer.parseInt(input);

		com = (int)(Math.random()*3) +1;

		System.out.println("����� "+user+"�Դϴ�.");
		System.out.println("���� "+com+"�Դϴ�.");

		switch(user-com){
			case 2: case-1:
				System.out.println("����� �����ϴ�.");
				break;
			case 1: case-2:
				System.out.println("����� �̰���ϴ�.");
				break;
			case 0:
				System.out.println("�����ϴ�.");
				break;
		}
	}
}