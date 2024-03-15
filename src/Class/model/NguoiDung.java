package Class.model;

public class NguoiDung {
	public static int size=0;
	private int id;
	protected String sodt;
	protected String email;
	protected String vaitro;
	public NguoiDung(String sodt,String email,String vaitro){
		this.id=++size;
		this.sodt=sodt;
		this.vaitro=vaitro;
		this.email=email;
	}
	public NguoiDung() {
		this.id=-1;
		this.sodt=null;
		this.email=null;
		this.vaitro=null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSodt() {
		return sodt;
	}
	public void setSodt(String sodt) {
		this.sodt = sodt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVaitro() {
		return vaitro;
	}
	public void setVaitro(String vaitro) {
		this.vaitro = vaitro;
	}
}
