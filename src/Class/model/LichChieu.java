package Class.model;

import java.util.Date;

public class LichChieu {
	int ID;
	String thoigian;
	PhongChieu phongchieu;
	NVQL nvql;
	Phim phim;
	LichChieu(int ID,PhongChieu phongchieu, NVQL nvql,Phim phim){
		this.ID=ID;
		this.phim=phim;
		this.phongchieu=phongchieu;
		this.nvql=nvql;
	}
}
