public class Calculate {
	static int stepen = 1; // ��� ������ �������� ����������� �����

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
		if (second != 0) { // ���� ������ ����� �� ����� ���� �� ����� ���
							// ������
			del = first / second;
			System.out.println("del " + del);
		} else {
			System.out.println("�� ���� ������ ������!");// ����� �� �����
		}

		int stepen = first;
		for (int i = 0; i < second; i++)
			// �� ������ ����� ��� ��������� � ������� ���������� � ������
			stepen = stepen * first;
		System.out.println("stepen " + stepen);
	}
}
