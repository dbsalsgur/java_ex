import java.util.Scanner;
class MyClass03 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���.>");
		String input = sc.nextLine();
		//System.out.println("�Էµ� ���� : "+input);

		char ch = input.charAt(0);
		if(ch>='A' && ch <= 'Z'){
			System.out.println("Upper case");
		} else {
			System.out.println("Lower case");
		}
	}
}