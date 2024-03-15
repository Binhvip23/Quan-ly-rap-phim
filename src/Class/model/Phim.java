package Class.model;

import java.util.Date;

public class Phim {
	private int ID;
	private String theloai;
	private String mota;
	private Date thoiluong;
	private String tenphim;
	protected Phim(String theloai, String mota,Date thoiluong, String tenphim){
		this.theloai=theloai;
		this.mota=mota;
		this.thoiluong=thoiluong;
		this.tenphim=tenphim;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTheloai() {
		return theloai;
	}
	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public Date getThoiluong() {
		return thoiluong;
	}
	public void setThoiluong(Date thoiluong) {
		this.thoiluong = thoiluong;
	}
	public String getTenphim() {
		return tenphim;
	}
	public void setTenphim(String tenphim) {
		this.tenphim = tenphim;
	}
}
