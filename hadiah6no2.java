import java.util.Scanner;

class Siswaa{
	String nama;
	String jurusan;
	String nim;	
			void setnama(String namasiswa)
		{
			nama=namasiswa;
		}
			void setjurusan(String jurusansiswa)
		{
			jurusan=jurusansiswa;
		}
			void setnim(String nimsiswa)
		{
			nim=nimsiswa;
		}
			void cetak()
		{
			System.out.println("nama saya adalah " + nama + ", "+
			"jurusan saya adalah"+", " +jurusan+" "+"dan nim saya "+ nim);
		}
}

public class hadiah6no2{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			Siswa s;
			s= new Siswa();
			
		System.out.println("masukkan nama anda : ");
		s.nama = input.nextLine();
		System.out.println("masukkan jurusan anda : ");
		s.jurusan = input.nextLine();
		System.out.println("masukkan nim anda : ");
		s.nim = input.nextLine();
		
		s.setnama(s.nama);
		s.setjurusan(s.jurusan);
		s.setnim(s.nim);
		s.cetak();
		
		
	}
	
}
