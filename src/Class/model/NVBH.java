package Class.model;

public class NVBH extends NhanVien{
	static int size=0;
	private int id;
	private int KPI;
	NVBH(String Sodt, String Email,String Vaitro,int KPI){
		super(Sodt,Email,Vaitro);
		id=++size;
		this.KPI=KPI;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKPI() {
		return KPI;
	}
	public void setKPI(int kPI) {
		KPI = kPI;
	}
	
}
