import java.util.Scanner;
class MyClass04 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요.>");
		String str = sc.nextLine();

		int jumsu = Integer.parseInt(str);
		if (jumsu>=90){
			System.out.println("A");
		} else if (jumsu>=80){
			System.out.println("B");
		} else if (jumsu>=70){
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}