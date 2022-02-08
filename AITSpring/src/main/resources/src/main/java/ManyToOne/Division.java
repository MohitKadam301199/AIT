package ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Division {
	
	@Id
	private int divid;
	private String dname;
	public Division() {}

	public Division(String dname, int divid) {
		super();
		this.dname = dname;
		this.divid = divid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDivid() {
		return divid;
	}

	public void setDivid(int divid) {
		this.divid = divid;
	}

	
	public String toString() {
		return "Division [dname=" + dname + ", divid=" + divid + "]";
	}
	
	

}
