import java.util.Scanner;
class FlowEx05 {
	public static void main(String[] args){
		int score = '0';
		char grade = ' ';
		char opt = '0';

		System.out.print("������ �Է����ּ���.>");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);

		System.out.println("����� ������ "+score+"�Դϴ�.");

		if(score >= 90){
			grade = 'A';
			if(score >=98){
				opt = '+';
			} else if(score<94) {
				opt = '-';
			}
		} else if(score >= 80){
			grade = 'B';
			if(score >=88){
				opt = '+';
			} else if(score<84) {
				opt = '-';
			}
		} else {
			grade = 'C';
			opt = ' ';
		}
		System.out.println("����� ������ "+grade+opt+"�Դϴ�.");
	}
}