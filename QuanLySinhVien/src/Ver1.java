
import java.util.Scanner;

public class Ver1 {

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		Scanner sc = new Scanner(System.in);
		sv.nhap(sc);
		sv.tinhDTB();
		sv.xepLoai();
		sv.xuat();

	}

}
