import java.util.Scanner;

class LottoSimulator{
	public static void main(String[] args){
		int num = 0;
		int[] drawNum = new int[5];
		int tmp;

		//num = (int)(Math.random()*50+1);
		do {
			System.out.print("시작하려면 \"0\"을 입력해주세요.>");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			tmp = Integer.parseInt(input);
	
			if(tmp == 0){
				System.out.println("추첨을 시작합니다.");
				int i = 0;
				for(i = 0; i<drawNum.length; i++)
					num = (int)(Math.random()*45) +1;
					drawNum[i] = num;
					System.out.print(drawNum[i]+" ");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} while (tmp == 0);
	}
}