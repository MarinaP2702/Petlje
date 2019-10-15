package whileLoop;

 import java.util.Scanner;

public class LoopPetlja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int zbir = 0;
		
		int brojac = 0;
		int ukupnoBrojeva = 0;
		int brojacNeparnih = 0;
		
		Scanner skener = new Scanner(System.in);
		
		// int pocetnaVrednost = 13;
		// int krajnjaVrednost = 567;
		
		System.out.println ("Unesite pocetnu vrednost: ");
		int pocetnaVrednost = skener.nextInt();
		System.out.println ("Unesite krajnju vrednost: ");
		int krajnjaVrednost = skener.nextInt();
		
		skener.close();
		
	for(int i=0; i<567; i++)	{
	//	System.out.println(i);
		
	//	zbir  = zbir * i;          // moze ovo i sa "proizvod"
		 
	//	System.out.println("Proizvod je: " + zbir );
		
		if (i%2 == 0) {
			
			brojac ++;
		} else {
			brojacNeparnih++;
		}
		
	}
		
	System.out.print("Parnih brojeva ima: + brojac");
	System.out.println("Ukupno brojeva: " + ukupnoBrojeva);
	System.out.println("Neparnih brojeva ima" + brojacNeparnih);	
		
		
		
	}

}
