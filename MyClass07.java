import java.util.Scanner;

class MyClass07 {
	public static void main(String[] args){
		String input;
		System.out.print("아무거나 입력하세요.>");

		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		/*for(int i = 0; i<2 ; i++){
			System.out.println("입력하신 문자는 \""+input+"\" 입니다.");
		}*/

		//입력 문자를 세로로 출력
		for(int i = 0; i<input.length(); i++){
			System.out.println(input.charAt(i));
		}
	}
}