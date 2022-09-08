
import java.util.Scanner;

public class QuanLySinhVien {

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		Scanner sc = new Scanner(System.in);
		sv.nhap(sc);
		sv.tinhDTB();
		sv.xepLoai();
		sv.xuat();

	}

}
