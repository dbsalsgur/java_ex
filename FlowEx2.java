import java.util.Scanner;
class FlowEx2 {
	public static void main(String[] args) {
		int input;

		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		input = Integer.parseInt(tmp);

		if(input == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
	} 
}