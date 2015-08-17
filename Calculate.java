public class Calculate {
	static int stepen = 1; // тут еклипс попросил статический метод

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
		if (second != 0) { // если второе число не равно нулю то делим как
							// обычно
			del = first / second;
			System.out.println("del " + del);
		} else {
			System.out.println("На ноль делить нельзя!");// иначе не делим
		}

		int stepen = first;
		for (int i = 0; i < second; i++)
			// не совсем понял как возводить в степень подсмотрел у других
			stepen = stepen * first;
		System.out.println("stepen " + stepen);
	}
}
