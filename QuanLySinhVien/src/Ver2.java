
import java.util.Scanner;

public class Ver2 {

	public Ver2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien ds = new DanhSachSinhVien();
		doMenu(ds);

	}

	private static void inMenu() {
		System.out.println("Vui lòng chọn hành động : ");
		System.out.println("1. Thêm sinh viên");
		System.out.println("2. Xuất danh sách sinh viên");
		System.out.println("0. Nhảy ra");
	}

	private static void doMenu(DanhSachSinhVien ds) {
		boolean flag = true;

		Scanner sc = new Scanner(System.in);
		do {
			inMenu();
			System.out.println("Mời chọn : ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(sc);
				ds.themSinhVien(sv);
				break;
			case 2:
				ds.tinhDTB();
				ds.xepLoai();
				ds.xuat();
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);

	}

}
