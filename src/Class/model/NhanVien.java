package Class.model;

public class NhanVien extends NguoiDung{
	public static int size=0;
	private int id;
	protected boolean active;
	NhanVien(){
		super();
		id=-1;
		active = false;
	}
	NhanVien(String Sodt, String Email,String Vaitro){
		super(Sodt,Email,Vaitro);
		id=++size;
		active = true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
