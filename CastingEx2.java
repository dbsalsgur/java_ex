class CastingEx2 {
	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i;
		System.out.println("[int -> byte] "+"i="+i+" -> b="+b);

		i = 300;
		b = (byte)i;
		System.out.println("[int -> byte] "+"i="+i+" -> b="+b);

		b = 10;
		i = (int)i;
		System.out.println("[int -> byte] "+"b="+b+" -> i="+i);
		
		b = -2;
		i = (int)i;
		System.out.println("[int -> byte] "+"b="+b+" -> i="+i);

		System.out.println("i = "+Integer.toBinaryString(i));
	}	
}