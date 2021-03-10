package com.bit.curr.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.sugang.model.SugangListDto;

public class CbbDao {
	String driver ="org.mariadb.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/lmsdb";
	String user = "scott";
	String password = "tiger";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void close() throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	
	public java.util.List<com.bit.curr.model.CbbDto> currList(){
		java.util.List<com.bit.curr.model.CbbDto> list =new ArrayList<>();
		
		String sql="select * from cbb where `delete`=0 order by num desc";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				com.bit.curr.model.CbbDto bean=new CbbDto();
				bean.setNum(rs.getInt("num"));
				bean.setID(rs.getString("ID"));
				bean.setNAME(rs.getString("NAME"));
				bean.setPOSITION(rs.getString("POSITION"));
				bean.setSub(rs.getString("sub"));
				bean.setOpen(rs.getDate("open"));
				bean.setPeriod(rs.getString("period"));
				list.add(bean);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public CbbDto currDetail(int num){
		CbbDto dto=new CbbDto();
		
		String sql="select * from cbb where `num`=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto.setSub(rs.getString("sub"));
				dto.setOpen(rs.getDate("open"));
				dto.setPeriod(rs.getString("period"));
				dto.setQual(rs.getString("qual"));
				dto.setContent(rs.getString("content"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return dto;
	}
	
	public void insertList(String ID,String NAME,String POSITION,String sub,Date open,String period,String qual,String content) {
		String sql="insert into cbb (ID,NAME,POSITION,sub,open,period,qual,content,nalja) values(?,?,?,?,?,?,?,?,now())";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, ID);
			pstmt.setString(2, NAME);
			pstmt.setString(3, POSITION);
			pstmt.setString(4, sub);
			pstmt.setDate(5, open);
			pstmt.setString(6, period);
			pstmt.setString(7, qual);
			pstmt.setString(8, content);
			pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
	
}
