class OperatorEx5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;

		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.println(a+" * "+b+" = "+a*b);
		System.out.println(a+" / "+b+" = "+a/b);
		System.out.printf("%d / %f = %f%n", a , (float)b, a / (float)b);
	}
}