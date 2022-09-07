import java.util.Scanner;

public class DemoHCN {

	public static void main(String[] args) {
		// Khởi tạo đối tượng 
		/**HinhChuNhat hcn = new HinhChuNhat();
		Scanner sc = new Scanner(System.in);
		hcn.nhap(sc);
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều dài : ");
		float chieuDai=Float.parseFloat(sc.nextLine());
		
		System.out.print("Nhập chiều rộng : ");
		float chieuRong=Float.parseFloat(sc.nextLine());
		
		HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
		
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.xuat();
		

	}

}
