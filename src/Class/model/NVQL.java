package Class.model;

public class NVQL extends NhanVien{
	static int size=0;
	private int id;
	NVQL(String Sodt, String Email,String Vaitro){
		super(Sodt,Email,Vaitro);
		id=++size;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
