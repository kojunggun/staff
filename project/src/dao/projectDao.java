package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.projectDto;


public class projectDao {
	private projectDao() {
	}
	private static projectDao instance = new projectDao();
	public static projectDao getInstance(){
		if(instance == null){
			instance = new projectDao();
		}
		return instance;
	}
//	전체 조회
public List<projectDto> selectAllProjects(){
		String sql = "select * from cproject order by prono desc";
		
		List<projectDto> list = new ArrayList<projectDto>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				projectDto pDto = new projectDto();
				pDto.setProno(rs.getInt("prono"));
				pDto.setPname(rs.getString("pname"));
				pDto.setProsta(rs.getString("prosta"));
				pDto.setPenddate(rs.getString("penddate"));
				pDto.setPcontent(rs.getString("pcontent"));
				pDto.setPselect(rs.getString("pselect"));
				
				list.add(pDto);
			} 
			
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DbManager.close(conn, stmt, rs);
			}
			return list;
		}
//	프로젝트 등록
public void insertProject(projectDto pDto){
		String sql =  "insert into cproject(" 
					 +"prono,pname,prosta,penddate,pcontent,pselect)"
					 +"values(project_prono_seq.nextval,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DbManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, pDto.getPname());
			pstmt.setString(2, pDto.getProsta());
			pstmt.setString(3, pDto.getPenddate());
			pstmt.setString(4,pDto.getPcontent());
			pstmt.setString(5, pDto.getPselect());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbManager.close(conn, pstmt);
		}
		
	}
public projectDto selectOneByprono(String prono){
	String sql ="select * from cproject where prono =?";
	
	projectDto pDto = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		conn = DbManager.getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, prono);
		rs=pstmt.executeQuery();
		if(rs.next()){
			pDto = new projectDto();
			pDto.setProno(rs.getInt("prono"));
			pDto.setPname(rs.getString("pname"));
			pDto.setProsta(rs.getString("prosta"));
			pDto.setPenddate(rs.getString("penddate"));
			pDto.setPcontent(rs.getString("pcontent"));
			pDto.setPselect(rs.getString("pselect"));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DbManager.close(conn, pstmt, rs);
	}
	return pDto;
}
public void updateProject(projectDto pDto){
	String sql = "update cproject set pname=?, prosta=?,penddate=?,pcontent=?,pselect=?"
				 +"where prono=?";
	Connection conn =null;
	PreparedStatement pstmt =null;
	
	try {
		conn = DbManager.getConnection();
		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, pDto.getPname());
		pstmt.setString(2, pDto.getProsta());
		pstmt.setString(3, pDto.getPenddate());
		pstmt.setString(4, pDto.getPcontent());
		pstmt.setString(5, pDto.getPselect());
		pstmt.setInt(6, pDto.getProno());
		
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DbManager.close(conn, pstmt);
	}
 }
public void deleteProject(String prono){
	 String sql ="delete cproject where prono=?";
	 
	 Connection conn = null;
	 PreparedStatement pstmt =null;
	 try {
		conn = DbManager.getConnection();
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, prono);
		
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
}
