import java.util.Scanner;

class LottoSimulator{
	public static void main(String[] args){
		int num = 0;
		int[] drawNum = new int[5];
		int tmp;

		//num = (int)(Math.random()*50+1);
		do {
			System.out.print("�����Ϸ��� \"0\"�� �Է����ּ���.>");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			tmp = Integer.parseInt(input);
	
			if(tmp == 0){
				System.out.println("��÷�� �����մϴ�.");
				int i = 0;
				for(i = 0; i<drawNum.length; i++)
					num = (int)(Math.random()*45) +1;
					drawNum[i] = num;
					System.out.print(drawNum[i]+" ");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} while (tmp == 0);
	}
}