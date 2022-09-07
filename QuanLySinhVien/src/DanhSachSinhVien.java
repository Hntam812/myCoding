
/**
 * Mục đích: Tạo ra để quản lý danh sách nhiều sinh viên
 * 
 * @author Demi Ngày tạo: 08/09/22 Version : 1.0
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {

	// 1. Attributes/ Data members /Fields
	private ArrayList<SinhVien> listSV; // = new ArrayList<SinhVien>() : ảnh hưởng performent của dự án

	// 2. Getter & Setter

	/**
	 * @return the listSV
	 */
	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	/**
	 * @param listSV the listSV to set
	 */
	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

	// 3. Constructors method
	public DanhSachSinhVien() {
		// this.listSV = new ArrayList<SinhVien>();
		setDefault();
	}

	// Nếu có nhiều list : Thiết lập hàm
	// Hàm này dùng để khởi động các list và các giá trị mặc định cho lớp
	private void setDefault() {
		this.listSV = new ArrayList<SinhVien>();
		// code here
		// code here
	}

	// 4. Input, Output
	public void nhap(Scanner sc) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(sc);
		}
	}

	public void themSinhVien(SinhVien sv) {
		this.listSV.add(sv);
	}

	public void xuat() {
		for (SinhVien sv : this.listSV) {
			sv.xuat();
		}
	}

	// 5.Business methods
	public void tinhDTB() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDTB();
		}
	}

	public void xepLoai() {
		for (SinhVien sv : this.listSV) {
			sv.xepLoai();
		}
	}

}
