import java.util.Scanner;

class MyClass07 {
	public static void main(String[] args){
		String input;
		System.out.print("�ƹ��ų� �Է��ϼ���.>");

		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		/*for(int i = 0; i<2 ; i++){
			System.out.println("�Է��Ͻ� ���ڴ� \""+input+"\" �Դϴ�.");
		}*/

		//�Է� ���ڸ� ���η� ���
		for(int i = 0; i<input.length(); i++){
			System.out.println(input.charAt(i));
		}
	}
}