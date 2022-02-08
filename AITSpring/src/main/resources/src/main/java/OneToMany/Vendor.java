package OneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vendor {
	
	@Id
	@Column(name="vendor_id")
	private int vid;
	
	@Column(name="vendor_name")
	private String vname;
	
	@OneToMany(mappedBy = "ven")
	private List<Customer>cust;
	
	public Vendor() {}
	public Vendor(int vid, String vname, List<Customer> cust) {
		this.vid = vid;
		this.vname = vname;
		this.cust = cust;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public List<Customer> getCust() {
		return cust;
	}
	public void setCust(List<Customer> cust) {
		this.cust = cust;
	}

	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + ", cust=" + cust + "]";
	}
	
	
	


}
