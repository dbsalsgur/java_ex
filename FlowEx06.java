import java.util.Scanner;

class FlowEx06 {
	public static void main(String[] args){
		int month = 0;

		System.out.println("���� ���� �Է��ϼ���.>");

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		month = Integer.parseInt(input);

		switch (month){
			case 3: 
			case 4:
			case 5:
				System.out.println("������ ������ ���Դϴ�");
				break;
			case 6: case 7: case 8:
				System.out.println("������ ������ �����Դϴ�");
				break;
			case 9: case 10: case 11:
				System.out.println("������ ������ �����Դϴ�");
				break;
			default:
//			case 12: case 1: case 2
				System.out.println("������ ������ �ܿ��Դϴ�");			
		}
	}
}