class FlowEx13 {
	public static void main(String[] args){
		int sum = 0;
		int i = 1;

		for(i= 1; i <= 10; i++){
			sum += i;
			//System.out.println("1부터 "+i+" 까지의 합 : "+sum);
		}
		i--;
		System.out.println("1부터 "+i+" 까지의 합 : "+sum);
	}
}