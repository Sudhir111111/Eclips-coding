package p1;

public class Emp  {                 //implements  Comparable<Emp>
	private String Name;
	private String phone;
	private int empid;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public Emp(String name2, String phone2, int empid2) {
		
		this.Name=name2;
		this.phone=phone2;
		this.empid=empid2;
	}
	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", phone=" + phone + ", empid=" + empid + "]";
	}
	
//	@Override
//	public int compareTo(Emp o) {
//		return this.empid - o.empid;
//	}
//	
	

}
