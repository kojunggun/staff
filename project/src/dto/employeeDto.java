package dto;

public class employeeDto {
	
	private String empno;
	private int	empnum;
	private String deptno;
	private String jobno;
	private String id;
	private String pswd;
	private String ename;
	private String fjumin;
	private String bjumin;
	private String hiredate;
	private String resigndate;
	private String email;
	private String zipcode;
	private String addr;
	private String deaddr;
	private int sal;
	private String etc;
	private String eregdate;
	private String epic;
	private String orn_epic;
	private String admin;
	
	public int getEmpnum() {
		return empnum;
	}
	public void setEmpnum(int empnum) {
		this.empnum = empnum;
	}	
	public String getOrn_epic() {
		return orn_epic;
	}
	public void setOrn_epic(String orn_epic) {
		this.orn_epic = orn_epic;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getJobno() {
		return jobno;
	}
	public void setJobno(String jobno) {
		this.jobno = jobno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getFjumin() {
		return fjumin;
	}
	public void setFjumin(String fjumin) {
		this.fjumin = fjumin;
	}
	public String getBjumin() {
		return bjumin;
	}
	public void setBjumin(String bjumin) {
		this.bjumin = bjumin;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getResigndate() {
		return resigndate;
	}
	public void setResigndate(String resigndate) {
		this.resigndate = resigndate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDeaddr() {
		return deaddr;
	}
	public void setDeaddr(String deaddr) {
		this.deaddr = deaddr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getEregdate() {
		return eregdate;
	}
	public void setEregdate(String eregdate) {
		this.eregdate = eregdate;
	}
	public String getEpic() {
		return epic;
	}
	public void setEpic(String epic) {
		this.epic = epic;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "employeeDto [empno=" + empno + ", empnum=" + empnum + ", deptno=" + deptno + ", jobno=" + jobno
				+ ", id=" + id + ", pswd=" + pswd + ", ename=" + ename + ", fjumin=" + fjumin + ", bjumin=" + bjumin
				+ ", hiredate=" + hiredate + ", resigndate=" + resigndate + ", email=" + email + ", zipcode=" + zipcode
				+ ", addr=" + addr + ", deaddr=" + deaddr + ", sal=" + sal + ", etc=" + etc + ", eregdate=" + eregdate
				+ ", epic=" + epic + ", orn_epic=" + orn_epic + ", admin=" + admin + "]";
	}
	
	
	

}
