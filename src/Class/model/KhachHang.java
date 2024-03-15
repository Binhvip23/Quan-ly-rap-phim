package Class.model;

public class KhachHang extends NguoiDung{
	static int size =0;
	int id;
	KhachHang(String sodt,String email,String vaitro)
	{
		super(sodt,email,vaitro);
		id=++size;
	}
}
