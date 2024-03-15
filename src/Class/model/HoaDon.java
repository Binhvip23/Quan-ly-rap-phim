package Class.model;

public class HoaDon extends DoanhThu{
	private int id;
	private float tongtien;
	private String ghichu;
	private NVBH nhanvien;
	private KhachHang khach;
	private VeDuocDat[] ve;
	HoaDon(NVBH nhanvien,KhachHang khach,VeDuocDat[] ve,String ghichu)
	{
		this.nhanvien=nhanvien;
		this.khach=khach;
		this.ve=ve;
		this.ghichu=ghichu;
		int i=0;
		VeDuocDat check;
		while((check=ve[i])!=null)
		{
			this.tongtien+=ve[i].tongtien;
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
