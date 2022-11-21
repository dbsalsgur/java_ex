class Tv{
	String color;
	boolean power;
	int channel;

	void power() {power = !power;}
	void channel1Up () { ++ channel;}
	void channel1Down() { --channel;}
}
