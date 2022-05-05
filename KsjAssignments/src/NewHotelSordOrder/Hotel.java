package NewHotelSordOrder;

import java.sql.Date;

public class Hotel {
	private String oid;
	private String ostate;
	private Date date;
	
	public Hotel(String oid, String ostate,Date date) {
		super();
		this.oid = oid;
		this.ostate = ostate;
		this.date = date;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOstate() {
		return ostate;
	}
	public void setOstate(String ostate) {
		this.ostate = ostate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Hotel [oid=" + oid + ", ostate=" + ostate + ", date=" + date + "]";
	}
	
	
	

	
	
	
}
