package javaHelloWorld;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "	Bugün hava çok güzel.	";
		System.out.println(mesaj);

//		System.out.println("Eleman Sayısı:" + mesaj.length());
//		System.out.println("5. Eleman:" + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Yaşasın!")); // geçici değişiklik yaratır
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("a"));
//		System.out.println(mesaj.lastIndexOf("a"));
		System.out.println(mesaj.replace(" ", "-"));
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(' ', '_');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 9));
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);

		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
System.out.println(mesaj.trim());
	}

}


