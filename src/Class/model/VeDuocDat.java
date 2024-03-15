package Class.model;

public class VeDuocDat extends VeXemPhim{
	int id;
	int sove;
	float tongtien;
	String trangthai;//boolean ?
	String hinhthuc;
	VeDuocDat(int id, String mota,String loaive,GheNgoi ghe,LichChieu lichchieu,Phim phim,int sove,float tongtien,String hinhthuc){
		super(id,mota,loaive,ghe,lichchieu,phim);
		this.id=id;
		this.tongtien=tongtien;
		this.sove=sove;
		this.tongtien=tongtien;
		this.hinhthuc=hinhthuc;
		this.trangthai="Chuan bi chieu";
	}
	VeDuocDat(VeDuocDat ve)
	{
		super(ve.id,ve.mota,ve.loaive,ve.ghengoi,ve.lichchieu,ve.phim);
		this.id=ve.id;
		this.tongtien=ve.tongtien;
		this.sove=ve.id;
		this.tongtien=ve.tongtien;
		this.hinhthuc=ve.hinhthuc;
		this.trangthai=ve.trangthai;
	}
}
