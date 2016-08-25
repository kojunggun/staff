package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.employeeDto;

public class employeeDao {
	private employeeDao() {
	}
	private static employeeDao instance = new employeeDao();
	public static employeeDao getInstance(){
		if(instance == null){
			instance = new employeeDao();
		}
		return instance;
	}
	public List<employeeDto> selectAllemployees(){
		String sql = "select * from emp order by empno desc";
		
		List<employeeDto> list = new ArrayList<employeeDto>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				employeeDto eDto = new employeeDto();
				eDto.setEmpno(rs.getString("empno"));
				eDto.setEmpnum(rs.getInt("empnum"));
				eDto.setDeptno(rs.getString("deptno"));
				eDto.setJobno(rs.getString("jobno"));
				eDto.setId(rs.getString("id"));
				eDto.setPswd(rs.getString("pswd"));
				eDto.setEname(rs.getString("ename"));
				eDto.setFjumin(rs.getString("fjumin"));
				eDto.setBjumin(rs.getString("bjumin"));
				eDto.setHiredate(rs.getString("hiredate"));
				eDto.setResigndate(rs.getString("resigndate"));
				eDto.setEmail(rs.getString("email"));
				eDto.setZipcode(rs.getString("zipcode"));
				eDto.setAddr(rs.getString("addr"));
				eDto.setDeaddr(rs.getString("deaddr"));
				eDto.setSal(rs.getInt("sal"));
				eDto.setEtc(rs.getString("etc"));
				eDto.setEregdate(rs.getString("eregdate"));
				eDto.setEpic(rs.getString("epic"));
				eDto.setOrn_epic(rs.getString("orn_epic"));
				eDto.setAdmin(rs.getString("admin"));
				
				list.add(eDto);
			} 
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DbManager.close(conn, stmt, rs);
			}
			return list;
		}
	
	//	한명 조회
public employeeDto selectOneBynotno(String empno){
	String sql ="select * from emp where empno =?";
	employeeDto eDto = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		conn = DbManager.getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, empno);
		rs=pstmt.executeQuery();
		if(rs.next()){
			eDto = new employeeDto();
			eDto.setEmpno(rs.getString("empno"));
			eDto.setEmpnum(rs.getInt("empnum"));
			eDto.setDeptno(rs.getString("deptno"));
			eDto.setJobno(rs.getString("jobno"));
			eDto.setId(rs.getString("id"));
			eDto.setPswd(rs.getString("pswd"));
			eDto.setEname(rs.getString("ename"));
			eDto.setFjumin(rs.getString("fjumin"));
			eDto.setBjumin(rs.getString("bjumin"));
			eDto.setHiredate(rs.getString("hiredate"));
			eDto.setResigndate(rs.getString("resigndate"));
			eDto.setEmail(rs.getString("email"));
			eDto.setZipcode(rs.getString("zipcode"));
			eDto.setAddr(rs.getString("addr"));
			eDto.setDeaddr(rs.getString("deaddr"));
			eDto.setSal(rs.getInt("sal"));
			eDto.setEtc(rs.getString("etc"));
			eDto.setEregdate(rs.getString("eregdate"));
			eDto.setEpic(rs.getString("epic"));
			eDto.setOrn_epic(rs.getString("orn_epic"));
			eDto.setAdmin(rs.getString("admin"));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DbManager.close(conn, pstmt, rs);
	}
	return eDto;
}

public void insertEmployee(employeeDto eDto){
	String sql = "insert into emp("
				 +"empno,empnum,deptno,jobno,id,pswd,ename,fjumin,bjumin,hiredate,resigndate,email,zipcode,addr,deaddr,sal,etc,eregdate,epic,orn_epic,admin)"
				 +"values(emp_seq,emp_empnum_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try {
		conn = DbManager.getConnection();
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, eDto.getDeptno());
		pstmt.setString(2, eDto.getJobno());
		pstmt.setString(3, eDto.getId());
		pstmt.setString(4, eDto.getPswd());
		pstmt.setString(5, eDto.getEname());
		pstmt.setString(6, eDto.getFjumin());
		pstmt.setString(7, eDto.getBjumin());
		pstmt.setString(8, eDto.getHiredate());
		pstmt.setString(9, eDto.getResigndate());
		pstmt.setString(10,eDto.getEmail());
		pstmt.setString(11, eDto.getZipcode());
		pstmt.setString(12, eDto.getAddr());
		pstmt.setString(13, eDto.getDeaddr());
		pstmt.setInt   (14, eDto.getSal());
		pstmt.setString(15, eDto.getEtc());
		pstmt.setString(16, eDto.getEregdate());
		pstmt.setString(17, eDto.getEpic());
		pstmt.setString(18, eDto.getOrn_epic());
		pstmt.setString(19, eDto.getAdmin());
		
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DbManager.close(conn, pstmt);
	}
}
	public int userCheck(String id, String pswd){
		int result = -1;
		String sql = "select pswd from emp where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DbManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				if(rs.getString("pswd") !=null && rs.getString("pswd").equals(pswd)){
					result = 1;
				}else {
					result=0;
				}
			}else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DbManager.close(conn, pstmt, rs);
		}
		return result;
	}
	public employeeDto getEmployee(String id){
		employeeDto eDto = null;
		String sql = "select * from emp where id =?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn=DbManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				eDto= new employeeDto();
				eDto.setEmpno(rs.getString("empno"));
				eDto.setEmpnum(rs.getInt("emonum"));
				eDto.setEname(rs.getString("ename"));
				eDto.setId(rs.getString("id"));
				eDto.setPswd(rs.getString("pswd"));
				eDto.setHiredate(rs.getString("hiredate"));
				eDto.setEregdate(rs.getString("eregdate"));
				eDto.setSal(rs.getInt("sal"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DbManager.close(conn, pstmt, rs);
		}
		return eDto;
	}
}
