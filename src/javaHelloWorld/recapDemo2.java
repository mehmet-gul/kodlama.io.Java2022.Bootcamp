package javaHelloWorld;

public class recapDemo2 {

	public static void main(String[] args) {
		double[] myList = { 9.1, 1.3, 5.4, 6.9, 7.9 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);

		}
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük : " + max);
		
	}

}
