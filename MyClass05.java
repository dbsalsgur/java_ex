import java.util.Scanner;
class MyClass05 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���.>");
		String str1 = sc.nextLine();

		System.out.print("������ �Է��ϼ���.>");
		String str2 = sc.nextLine();

		int jumsu1 = Integer.parseInt(str1);
		int jumsu2 = Integer.parseInt(str2);
		if (jumsu1>=90 && jumsu2>=90){
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}