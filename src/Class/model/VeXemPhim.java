package Class.model;

public class VeXemPhim {
	private int id;
	protected String mota;
	protected String loaive;
	protected LichChieu lichchieu;
	protected GheNgoi ghengoi;
	Phim phim;// ??? 
	VeXemPhim(int id, String mota,String loaive,GheNgoi ghe,LichChieu lichchieu,Phim phim){
		this.setId(id);
		this.mota=mota;
		this.loaive=loaive;
		this.ghengoi=ghe;
		this.lichchieu=lichchieu;
		this.phim=phim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
