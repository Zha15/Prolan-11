public class perhitungan

{

int A=3;

int B=6;

int tambah;

int kurang;

int kali;

int bagi;

public static void main (String [] args)

{

perhitungan nilai = new perhitungan();

nilai.tambah=nilai.A + nilai.B;

nilai.kurang=nilai.A - nilai.B;

nilai.kali=nilai.A * nilai.B;

nilai.bagi=nilai.A / nilai.B;

System.out.println("Nilai A = " + nilai.A);

System.out.println("Nilai B = " + nilai.B);

System.out.println("A + B=" + nilai.tambah);

System.out.println("A - B=" + nilai.kurang);

System.out.println("A x B=" + nilai.kali);

System.out.println("A / B=" + nilai.bagi);

}

}