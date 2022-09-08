import java.util.ArrayList;
import java.util.Scanner;

/**
 * Mục đích: Quản lý toàn bộ nghiệp vụ cho trường học
 * @author Demi
 * Ngày tạo: 08/09/22
 * Version : 1.0
 *
 */
public class TruongHoc {
	
	//1. Attributes
	private DanhSachSinhVien dssvToanTruong;
	
	
	//2. Getter setter
	/**
	 * @return the dssvToanTruong
	 */
	public DanhSachSinhVien getDssvToanTruong() {
		return dssvToanTruong;
	}


	/**
	 * @param dssvToanTruong the dssvToanTruong to set
	 */
	public void setDssvToanTruong(DanhSachSinhVien dssvToanTruong) {
		this.dssvToanTruong = dssvToanTruong;
	}
	
	
	//3. Constructors
	public TruongHoc() {
		this.dssvToanTruong= new DanhSachSinhVien();
	}
	
	
	//4. Input output
	//Tạo dumies data: 
	public void nhap() {
		SinhVien sv = new SinhVien("Demi","1713032", 9.2f, 9, 9);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Giang","1", 4.2f, 4, 5.3f);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Nhat","2", 4, 7.2f, 9);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Tâm","3", 10, 10, 10);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Tuấn","4", 4, 7.2f, 9);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Lâm","5", 9.2f, 9.2f, 10);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Quốc","6", 7, 7.2f, 6);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Khang","7", 3.2f, 3, 5.3f);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Trung","8", 10, 9.2f, 10);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Công","9", 7.2f, 7, 8);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Sói","10", 10, 10, 10);
		this.dssvToanTruong.themSinhVien(sv);
	}
	
	
	public void xuat() {
		this.dssvToanTruong.xuat();
	}
	
	
	//5. Buisness methods
	public void themSinhVien(SinhVien sv) {
		this.dssvToanTruong.themSinhVien(sv);
	}
	public void tinhDTB() {
		this.dssvToanTruong.tinhDTB();
	}
	
	public void xepLoai() {
		this.dssvToanTruong.xepLoai();
	}
	
	
	//Tìm danh sách sinh viên có điểm trung bình cao nhất
	//Viết hàm bên DanhSachSinhVien: do tìm trên từng danh sách.
	
	public ArrayList<SinhVien> timDSSVCoDTBCaoNhat() {
		return this.dssvToanTruong.timDSSVCoDTBCaoNhatToiUu();
	}

}
