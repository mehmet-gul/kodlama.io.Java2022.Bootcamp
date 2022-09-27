package javaHelloWorld;

public class recapdDemo1 {

	public static void main(String[] args) {
		int sayi1 = 26;
		int sayi2 = 29;
		int sayi3 = 28;
		int enBuyuk = sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
				}
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En Büyük Sayı: "+ enBuyuk);
	}

}
