package dto;

import java.sql.Date;

public class projectDto {
	private int prono;
	private String pname;
	private String prosta;
	private String penddate;
	private String pcontent;
	private String pselect;
	
	public String getPselect() {
		return pselect;
	}
	public void setPselect(String pselect) {
		this.pselect = pselect;
	}
	public int getProno() {
		return prono;
	}
	public void setProno(int prono) {
		this.prono = prono;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getProsta() {
		return prosta;
	}
	public void setProsta(String prosta) {
		this.prosta = prosta;
	}
	public String getPenddate() {
		return penddate;
	}
	public void setPenddate(String penddate) {
		this.penddate = penddate;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}
	@Override
	public String toString() {
		return "projectDto [prono=" + prono + ", pname=" + pname + ", prosta=" + prosta + ", penddate=" + penddate
				+ ", pcontent=" + pcontent + ", pselect=" + pselect + "]";
	}
	
	
}
