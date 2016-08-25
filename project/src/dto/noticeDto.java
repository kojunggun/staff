package dto;

public class noticeDto {
	private int notno;
	private String empno;
	private String notname;
	private String notdate;
	private int nothits;
	private String notcon;
	private String notde;
	
	public int getNotno() {
		return notno;
	}
	public void setNotno(int notno) {
		this.notno = notno;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getNotname() {
		return notname;
	}
	public void setNotname(String notname) {
		this.notname = notname;
	}
	public String getNotdate() {
		return notdate;
	}
	public void setNotdate(String notdate) {
		this.notdate = notdate;
	}
	public int getNothits() {
		return nothits;
	}
	public void setNothits(int nothits) {
		this.nothits = nothits;
	}
	public String getNotcon() {
		return notcon;
	}
	public void setNotcon(String notcon) {
		this.notcon = notcon;
	}
	public String getNotde() {
		return notde;
	}
	public void setNotde(String notde) {
		this.notde = notde;
	}
	@Override
	public String toString() {
		return "noticeDto [notno=" + notno + ", empno=" + empno + ", notname=" + notname + ", notdate=" + notdate
				+ ", nothits=" + nothits + ", notcon=" + notcon + ", notde=" + notde + "]";
	}
	
	
	
	
}
