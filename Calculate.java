public class Calculate {
	static int stepen = 1; //tut eclipse poprosil static metod(ne zmaiu pochemu)

	public static void main(String[] args) {
		System.out.println("Calculate ...");

		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);

		int summ = first + second;
		System.out.println("Sum " + summ);

		int minus = first - second;
		System.out.println("minus " + minus);

		int umn = first * second;
		System.out.println("umn " + umn);

		int del;
		if (second != 0) { //esli vtoroe chislo ne ravno nol to delim kak obychno
							
			del = first / second;
			System.out.println("del " + del);
		} else {
			System.out.println("Na nol' delit nelzia!");//inache ne delim
		}

		int stepen = first;
		for (int i = 0; i < second; i++)
			//ne sovsem ponial kak vozvodit v stepen(podsmotrel u drugih)
			stepen = stepen * first;
		System.out.println("stepen " + stepen);
	}
}
