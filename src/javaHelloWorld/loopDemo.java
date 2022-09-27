package javaHelloWorld;

public class loopDemo {

	public static void main(String[] args) {
		//For
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("Döngü Bitti");
		
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("For Döngüsü sonu");
		
		int i=0;
		//While loop
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While döngüsü sonu");
		// do-while döngüsü
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10); 
		System.out.println("Do-While döngüsü sonu");
			
	}

}
