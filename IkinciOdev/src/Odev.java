
public class Odev {
public static void main(String[] args)
{
	System.out.println("Hello World");
	System.out.println("--------------------------------------");
	
	System.out.println("VARIBALES");
	
	int OgrenciSaysi=12;
	String Message="Ogrenci Sayisi";
	
	System.out.println(Message + "OgrenciSayisi");
	System.out.println(Message + "OgrenciSayisi");
	
	System.out.println("Ogrenci Sayisi: " + OgrenciSaysi);
	System.out.println("Ogrenci Sayisi: " + OgrenciSaysi);
	System.out.println("Ogrenci Sayisi: " + OgrenciSaysi);
	System.out.println("Ogrenci Sayisi: " + OgrenciSaysi);
	System.out.println("----------------------------------------");
	
	
	System.out.println("DATATYPES");
	
	double sayi=12.2;
	sayi=-123;
	
	char karakter='A';
	boolean dogruMu=false;
	System.out.println("---------------------------------------");
	
	
	
	System.out.println("CONDITIONAL");
	int number=20;
	   if(number<20)
	   {
		   System.out.println("Number 20 den Kucuktur");
	   }
	   else if(number==20) {
		   System.out.println("Number 20 ye Esititr");
	   }
	   else {
		   System.out.println("Number 20 den  Buyuktur");
	   }
	   System.out.println("-----------------------------------");
	   
	   
	   System.out.println("RECAMPDEMO1");
	   
	   int nmber1=24;
	   int nmber2=23;
	   int nmber3=22;
	   int enBuyuk=nmber1;
	   
	   if(enBuyuk<nmber2)
	   {
		   enBuyuk=nmber2;
	   }
	   else if(enBuyuk<nmber3)
	   {
		   enBuyuk=nmber3;
	   }
	   System.out.println("En Buyuk: "+enBuyuk);
	   System.out.println("-----------------------------------");
	   
	   System.out.println("SWITCH");
	   
	   char grade='D';
	   
	   switch(grade) {
	   case 'A':
		   System.out.println("Mukemel: Gectiniz: ");
		   break;
		   
	   case 'B':
		   System.out.println("Cok Guzel: Gectiniz");
		   break;
	   case 'C' :
		   System.out.println("Iyi: Gectiniz");
		   break;
	   case 'D' :
		   System.out.println("Fena Degil: Gectiniz");
		   break;
	   case 'E' :
		   System.out.println("Maalesef Kaldiniz");
		   break;
		   default:
			   System.out.println("Gecersiz Not Girdiniz");
	   }
	   System.out.println("--------------------------------------------");
	   
	   
	   System.out.println("LOOPDEMO");
	   
	   for(int i=2; i<10; i+=2)
	   {
		   System.out.println(i);
	   }
	   System.out.println("Dongu Bitti");
	   System.out.println("---------------------------------------------");
	   
	   
	   System.out.println("WHILE");
	   
	   int i=0;
	   while(i<10) {
		   System.out.println(i);
		   i+=2; 
	   }
	   System.out.println("While Dongusu Bitti");
	   System.out.println("----------------------------------------------");
	   
	   System.out.println("DO-WHILE");
	   int j=100;
	   do {
		   System.out.println(j);
		   j+=2;
	   }while(j<10);
		   System.out.println("Do-While Dongusu Bitti.");
		System.out.println("-------------------------------------------");
		
		System.out.println("ARRAYS_DEMO");
		
		String ogrenci1="Sakina";
		String ogrenci2="Amena";
		String ogrenci3="Ruqia";
		String ogrenci4="Sabera";
		String ogrenci5="Rubaba";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println(ogrenci5);
		System.out.println("======================");
		String[] ogrenciler=new String[5];
		ogrenciler[0]="Sakina";
		ogrenciler[1]="Amena";
		ogrenciler[2]="Ruqia";
		ogrenciler[3]="Sabera";
		ogrenciler[4]="Rubaba";
		
		for(int f=0; f<ogrenciler.length; f++)
		{
			System.out.println(ogrenciler[f]);
		}
		System.out.println("-----------------------------------");
		
		System.out.println("RECAMP_2_DEMO");
		double[] myList= {1.2, 2.3, 3.4, 4.5};
		double total=0;
		double max=myList[0];
		for(double Numberr:myList) {
			if(max<Numberr) {
			max=Numberr;
		}
		total = total + Numberr;
		System.out.println(Numberr);
}
	System.out.println("Toplam: " + total);
	System.out.println("En Buyuk: " + max);
	System.out.println("-------------------------------------------------");
	
	System.out.println("MULTI_DIMEONSIAL_ARRYS");
    
	String[][] sehirler = new String[3][3];
	sehirler[0][0]="Istanbul";
	sehirler[0][1]="Ankara";
	sehirler[0][2]="Izmir";
	sehirler[1][0]="Kayseri";
	sehirler[1][1]="Adana";
	sehirler[1][2]="Konya";
	sehirler[2][0]="Nevsehir";
	sehirler[2][1]="Bursa";
	sehirler[2][2]="Trabzon";
	
	for(int k=0; k<=2; k++) {
		System.out.println("==============");
		for(int l=0; l<=2; l++) {
			System.out.println(sehirler[k][l]);
		}
	}
	System.out.println("-----------------------------------------------");
	
	System.out.println("STRING_DEMO");
	String mesaj="Bugun hava cok guzel. ";
	System.out.println(mesaj);
	
	/*System.out.println("Eleman Sayisi:"+mesaj.length());
	System.out.println("5.Eleman "+mesaj.charAt(4));
	System.out.println(mesaj.concat("Yasasin!"));
	System.out.println(mesaj.startsWith("B"));
	System.out.println(mesaj.endsWith("n"));
	
	char[] karakterler=new char[5];
	mesaj.getChars(0, 5, karakterler, 0);
	System.out.println(karakterler);
	System.out.println(mesaj.indexOf("av"));
	System.out.println(mesaj.lastIndexOf("a"));*/
	System.out.println("------------------------------------------------");
	
	System.out.println("IKINCI_ORNEK");
	
	String yeniMesaj=mesaj.replace(' ','-');
	System.out.println(yeniMesaj);
	System.out.println(mesaj.substring(2, 5));
	
	for(String kelime: mesaj.split(" ")) {
		System.out.println(kelime);
	}
	System.out.println(mesaj.toLowerCase());
	System.out.println(mesaj.toUpperCase());
	System.out.println(mesaj.trim());
	System.out.println("-----------------------------------------------");
	
	System.out.println("MINI_PROJE_ASAL_SAYI");
	
	int num=-2;
	int reminder=num%2;
	System.out.println(reminder);
	boolean isPrime=true;
	if(num==1) {
		System.out.println("Sayi Asal Degildir.");
		return;
	}
	if(num<1) {
		System.out.println("Gecersiz Sayi");
	}
	for(int H=2; H<num; H++)
	{
		if(num%H==0) {
			isPrime=false;
		}
	}
	if(isPrime) {
		System.out.println("Sayi Asaldir.");
     
	}
	else {
		System.out.println("Sayi Asal Degildir.");
	}
	System.out.println("----------------------------------");
	
	System.out.println("SESLI_HARFLER");
	char Harf='B';
	switch(Harf) {
	case 'A':
	case 'I':
	case 'O':
	case 'U':
		System.out.println("Kalin Sesli Harfler.");
		break;
		default:
		System.out.println("Ince Sesli Harfler");
			
	}
	
	System.out.println("--------------------------------------------------");
	
	
	System.out.println("MUKEMMEL_SAYI");
	
	
	
	int numm=6;
	int totall=0;
	for(int p=1; p<numm; p++) {
		if(numm%p==0) {
			totall=totall+p;
		}
		
	}
	if(totall==numm) {
		System.out.println("Mukkemel Sayidir.");
	}
	else
	{
		System.out.println("Mukemmel Sayi Degildir.");
	}
	
	System.out.println("-----------------------------------");
	
	System.out.println("ARKADAS_SAYI");
	
	int sayii1=220;
	int sayii2=284;
	int toplamm1=0;
	int toplamm2=0;
	
	for(int y=1; y<sayii1; y++) {
		if(sayii1%y==0) {
			toplamm1=toplamm1+y;
		}
	}
	
	for(int x=1; x<sayii2; x++) {
		if(sayii2%x==0) {
			toplamm2=toplamm2+x;
		}
	}
	if(sayii1==toplamm2 && sayii2==toplamm1) {
		System.out.println("Bu Iki Sayi Arkadasdir.");
	}
	else
	{
		System.out.println("Bu Iki Sayi Arkadas Degildir.");
	}
	
	System.out.println("-----------------------------------");
	
	System.out.println("SAYI_BULMA");
	
	int[] sayiilar=new int[] {1,2,4,5,6};
	int aranacak=9;
	boolean varMii=false;
	for(int sayyi:sayiilar) {
		if(sayyi==aranacak) {
			varMii=true;
			break;
			
		}
	}
	if(varMii) {
		System.out.println("Sayi Mevcuttur.");
	}
	else {
		System.out.println("Sayi Mevcut Degildir.");
	}
	
	
	
	
	   
	   
	   
	   
	   
	   
	   
	
	
	
	
	
}
	
	
}
