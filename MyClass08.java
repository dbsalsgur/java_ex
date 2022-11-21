import java.util.Scanner;
import java.util.Arrays;
class MyClass08 {
	public static void main(String[] args){
		char[] alpha = new char[26];
		int [] count = new int[26];

		for(int i = 0; i<alpha.length; i++){
			alpha[i] = (char)(i+65);
		}

		System.out.print("대문자 알파벳을 아무거나 입력하세요(복수 기입 가능).>");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		for(int i = 0; i<input.length(); i++){
			for(int j = 0; j<alpha.length; j++){
				if(input.charAt(i)==alpha[j]){
					count[j]++;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(alpha));
		System.out.println(Arrays.toString(count));
	}
}

	