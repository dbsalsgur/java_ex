import java.util.Scanner;
class OperatorEx25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';

		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");

		String input = sc.nextLine();
		ch = input.charAt(0);

		if('0'<=ch && ch<='9'){
			System.out.print("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}

		if(('a'<=ch && ch<= 'z') || ('A'<=ch && ch<= 'Z')){
			System.out.print("�Է��Ͻ� ���ڴ� �������Դϴ�.");
		}
	}	
}