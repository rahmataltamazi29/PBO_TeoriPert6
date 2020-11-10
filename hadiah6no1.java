import java.util.Scanner;

class Lingkaran{
	
	final double PI = 3.14;
	int jari2;


		void cetak()
		{
			
			System.out.println("Nilai luas lingkaran adalah :"+(PI * jari2 *jari2));
			
		}
}
class Kubus{
		int sisi;
		
		void cetak(){
			System.out.println("Nilai volume kubus adalah : " 
			+(sisi*sisi*sisi));
			
		}
	
}
	
public class hadiah6no1{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Lingkaran l = new Lingkaran();
		Kubus k = new Kubus();
		
		System.out.println("masukkan nilai jari2 : ");
		l.jari2 = input.nextInt();
		System.out.println("masukkan nilai sisi : ");
		k.sisi = input.nextInt();
		
		l.cetak();
		System.out.println("=======================");
		k.cetak();
	
		
	
	}
	
}