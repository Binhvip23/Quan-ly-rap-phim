package Class.model;

public class GheNgoi {
	private int ID;
	private boolean trangthai;
	GheNgoi(int ID,boolean trangthai){
		this.ID =ID;
		this.trangthai=trangthai;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public boolean isTrangthai() {
		return trangthai;
	}
	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}
}
