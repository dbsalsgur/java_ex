class A{}

class MyClass09{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		A ap = new A();
		A aq = new A();
		printData(ap, aq);		
	}

	static void printData(A ap, A aq){
		System.out.println("Result : "+ap);
		System.out.println("Result : "+aq);
	}
}
