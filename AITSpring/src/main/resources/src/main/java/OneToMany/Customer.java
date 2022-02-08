package OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {

	@Id
	private int cid;
	private String cname;
	@ManyToOne
	private Vendor ven;
	
	public Customer() {}
	
	
	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
		
	}
	public Customer(int cid, String cname,Vendor ven) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ven=ven;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	public Vendor getVendor() {
		return ven;
	}
	public void setVendor(Vendor ven) {
		this.ven = ven;
	}
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + "vendor "+ven;
	}

		
}
