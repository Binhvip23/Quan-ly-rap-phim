package Class.model;

public class PhongChieu {
	private static int Succhua=80;
	private int ID;
	private String TenPhong;
	private String MoTa;
	PhongChieu(int ID,String TenPhong,int SucChua,String Mota){
		this.ID=ID;
		this.TenPhong=TenPhong;
		this.MoTa=Mota;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTenPhong() {
		return TenPhong;
	}
	public void setTenPhong(String tenPhong) {
		TenPhong = tenPhong;
	}
	public String getMoTa() {
		return MoTa;
	}
	public void setMoTa(String moTa) {
		MoTa = moTa;
	}
}
