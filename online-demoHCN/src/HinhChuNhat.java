import java.util.Scanner;

/**
 * Mục đích: Quản lý nghiệp vụ hình chữ nhật
 * @author Demi
 * Ngày tạo: 07/09/22
 * Version 1.0
 *
 */
public class HinhChuNhat {
	
	//1.thuộc tính
	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;
	
	//2.phương thức get set	
	public float getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}
	public float getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}
	public float getChuVi() {
		return chuVi;
	}
//	public void setChuVi(float chuVi) {
//		this.chuVi = chuVi;
//	}
	public float getDienTich() {
		return dienTich;
	}
//	public void setDienTich(float dienTich) {
//		this.dienTich = dienTich;
//	}
	
	
	//3.phương thức khởi tạo 
	public HinhChuNhat() {}
	
	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai=chieuDai;
		this.chieuRong=chieuRong;
	}
	
	//4.phương thức xuất nhập
	public void nhap(Scanner sc) {
		System.out.println("Nhập chiều dài : ");
		this.chieuDai=Float.parseFloat(sc.nextLine());
		
		System.out.println("Nhập chiều rộng : ");
		this.chieuRong=Float.parseFloat(sc.nextLine());
		
	}
	
	public void xuat() {
		System.out.println("HCN ( " +chieuDai + ","+ chieuRong+ "). Diện tích : "
	+dienTich+"\t Chu vi : "+chuVi);
	}
	
	//5.phương thức xử lý nghiệp vụ liên quan lớp này 
	public void tinhChuVi() {
		this.chuVi=(chieuDai+chieuRong)*2;
		
	}
	
	public void tinhDienTich() {
		this.dienTich=chieuDai*chieuRong;
	}
	

}
