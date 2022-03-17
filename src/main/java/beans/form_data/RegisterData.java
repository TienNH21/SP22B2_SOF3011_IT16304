package beans.form_data;

public class RegisterData {
	private String hoTen;
	private String diaChi;
	private String sdt;
	private String email;
	private String password;
	private int gioiTinh;
	private int loaiKH;
	
	public RegisterData() {
		//
	}
	
	public RegisterData(String hoTen, String diaChi,
		String sdt, String email, String password,
		int gioiTinh, int loaiKH) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.email = email;
		this.password = password;
		this.gioiTinh = gioiTinh;
		this.loaiKH = loaiKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getLoaiKH() {
		return loaiKH;
	}
	public void setLoaiKH(int loaiKH) {
		this.loaiKH = loaiKH;
	}
	

}
