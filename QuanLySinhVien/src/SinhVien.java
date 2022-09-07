
import java.util.Scanner;

/**
 * Mục đích: Quản lý các nghiệp vụ liên quan đến sinh viên
 * 
 * @author Demi Ngày tạo : 07/09/22 Version : 1.0
 *
 */

public class SinhVien {

	// 1. thuộc tính
	private String tenSV;
	private String maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;

	// 2. getter và setter : tạo auto
	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	// 3. constructor : tạo auto
	public SinhVien() {

	}

	public SinhVien(String tenSV, String maSV, float diemToan, float diemLy, float diemHoa) {
		super();
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	// 4. input, output
	public void nhap(Scanner sc) {
		System.out.println("Nhập tên : ");
		this.tenSV = sc.nextLine();

		System.out.println("Nhập mã SV : ");
		this.maSV = sc.nextLine();

		System.out.println("Nhập điểm toán : ");
		this.diemToan = Float.parseFloat(sc.nextLine());

		System.out.println("Nhập điểm lý : ");
		this.diemLy = Float.parseFloat(sc.nextLine());

		System.out.println("Nhập điểm hóa : ");
		this.diemHoa = Float.parseFloat(sc.nextLine());
	}

	public void xuat() {
		System.out.println("Sinh viên -Mã: " + this.maSV + "\tTên: " + this.tenSV + "\tĐiểm Toán: " + this.diemToan
				+ "\tĐiểm Lý: " + this.diemLy + "\tĐiểm Hóa: " + this.diemHoa + "\tĐiểm Trung bình: " + this.diemTB
				+ "\tXếp loại: " + this.xepLoai);
	}

	// 5.Business methods
	public void tinhDTB() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa) / 3;
	}

	public void xepLoai() {
		if (this.diemTB >= 9) {
			this.xepLoai = "Xuất sắc";
		} else if (this.diemTB >= 8) {
			this.xepLoai = "Giỏi";
		} else if (this.diemTB >= 7) {
			this.xepLoai = "Khá";
		} else if (this.diemTB >= 6) {
			this.xepLoai = "Trung Bình Khá";
		} else if (this.diemTB >= 5) {
			this.xepLoai = "Trung Bình";
		} else {
			this.xepLoai = "Học ngu 8 năm khỏi tốt nghiệp Bách Khoa rồi.";
		}
	}

}
