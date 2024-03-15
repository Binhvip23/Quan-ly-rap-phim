package Class.model;

public class DoanhThu {
	protected float tongdoanhthu;
	DoanhThu()
	{
		this.tongdoanhthu=-1;
	}
	DoanhThu(float doanhthu)
	{
		this.tongdoanhthu=doanhthu;
	}
	public float getTongdoanhthu() {
		return tongdoanhthu;
	}

	public void setTongdoanhthu(float tongdoanhthu) {
		this.tongdoanhthu = tongdoanhthu;
	}
}
