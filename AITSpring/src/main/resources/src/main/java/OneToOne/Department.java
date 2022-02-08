package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int did;
	private String dname;

	public Department() {}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}


	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	
	

}
