package ManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	@Column(name="student_id")
	private int sid;
	@Column(name="Student_name")
	private String sname;
	@ManyToOne
	private Division div;
	public Student() {}

	public Student(int sid, String sname,Division d) {
		this.sid = sid;
		this.sname = sname;
		this.div=d;
	}
	
	
	public Division getDiv() {
		return div;
	}

	public void setDiv(Division div) {
		this.div = div;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + " Divison "+div;
	}
	
	
	
	

}
