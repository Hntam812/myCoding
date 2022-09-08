
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTruongHoc {

	public QuanLyTruongHoc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		doMenu(truong);

	}

	private static void inMenu() {
		System.out.println("Vui lòng chọn hành động : ");
		System.out.println("1. Thêm sinh viên");
		System.out.println("2. Xuất danh sách sinh viên");
		System.out.println("3. Liệt kê danh sách sinh viên có điểm trung bình cao nhẩt");
		System.out.println("0. Nhảy ra");
	}

	private static void doMenu(TruongHoc truong) {
		boolean flag = true;

		Scanner sc = new Scanner(System.in);
		do {
			inMenu();
			System.out.print("Mời chọn : ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(sc);
				truong.themSinhVien(sv);
				break;
			case 2:
				truong.tinhDTB();
				truong.xepLoai();
				truong.xuat();
				break;
			case 3:
				ArrayList<SinhVien> list = truong.timDSSVCoDTBCaoNhat();
				for(SinhVien sv1 : list) {
					sv1.xuat();
				}
				// list : chứa danh sách sinh viên có điểm trung bình cao nhất
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);

	}

}
