package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.noticeDto;

public class noticeDao {
	private noticeDao() {
	}
	private static noticeDao instance = new noticeDao();
	public static noticeDao getInstance(){
		if(instance == null){
			instance = new noticeDao();
		}
		return instance;
	}
//		전체 조회
public List<noticeDto> selectAllNotices(){
		String sql = "select * from notice order by notno desc";
		
		List<noticeDto> list = new ArrayList<noticeDto>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				noticeDto nDto = new noticeDto();
				nDto.setNotno(rs.getInt("notno"));
				nDto.setEmpno(rs.getString("empno"));
				nDto.setNotname(rs.getString("notname"));
				nDto.setNotdate(rs.getString("notdate"));
				nDto.setNothits(rs.getInt("nothits"));
				nDto.setNotcon(rs.getString("notcon"));
				nDto.setNotde(rs.getString("notdel"));
				list.add(nDto);
			} 
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DbManager.close(conn, stmt, rs);
			}
			return list;
		}
//	한명 조회
public noticeDto selectOneBynotno(String notno){
	String sql ="select * from notice where notno =?";
	noticeDto nDto = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		conn = DbManager.getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, notno);
		rs=pstmt.executeQuery();
		if(rs.next()){
			nDto = new noticeDto();
			nDto.setNotno(rs.getInt("notno"));
			nDto.setEmpno(rs.getString("empno"));
			nDto.setNotname(rs.getString("notname"));
			nDto.setNotdate(rs.getString("notdate"));
			nDto.setNothits(rs.getInt("nothits"));
			nDto.setNotcon(rs.getString("notcon"));
			nDto.setNotde(rs.getString("notdel"));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DbManager.close(conn, pstmt, rs);
	}
	return nDto;
}
//		입력
public void insertNotice(noticeDto nDto){
	String sql = "insert into notice(" 
				 +"notno,notname,notcon)"
				 +"values(notice_notno_seq.nextval,?,?)";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try {
		conn = DbManager.getConnection();
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, nDto.getNotname());
		pstmt.setString(2, nDto.getNotcon());
		
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DbManager.close(conn, pstmt);
	}
	
	}
//		조회수
public void updateReadCount(String notno){
	String sql = "update notice set nothits=nothits +1 where notno=? ";
	
	Connection conn=null;
	PreparedStatement pstmt = null;
	try {
		conn = DbManager.getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, notno);
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DbManager.close(conn, pstmt);
	}
}
public void updateNotice(noticeDto nDto){
	String sql = "update notice set notname=? ,notcon=? where notno =?";
	Connection conn =null;
	PreparedStatement pstmt = null;
	
	try {
		conn=DbManager.getConnection();
		pstmt=conn.prepareStatement(sql);
		
		pstmt.setString(1, nDto.getNotname());
		pstmt.setString(2, nDto.getNotcon());
		pstmt.setInt(3, nDto.getNotno());
		
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		DbManager.close(conn, pstmt);
	}
}
public void deleteNotice(String notno){
	String sql = "delete notice where notno=?";
	Connection conn = null;
	PreparedStatement pstmt = null;
	try {
		conn = DbManager.getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, notno);
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}

}
}
