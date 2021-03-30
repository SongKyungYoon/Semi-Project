package com.bit.emp.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.emp.model.EbbDto;
public class EbbDao {
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
	
	public java.util.List<EbbDto> ebbList(){
		java.util.List<EbbDto> list =new ArrayList<>();
		
		String sql="select * from ebb where `delete`=0 order by num desc";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EbbDto bean=new EbbDto();
				bean.setNum(rs.getInt("num"));
				bean.setId(rs.getString("id"));
				bean.setName(rs.getString("name"));
				bean.setPosition(rs.getString("position"));
				bean.setConame(rs.getString("coname"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setDeadline(rs.getString("deadline"));
				bean.setCoposition("coposition");
				bean.setCount(rs.getInt("count"));
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
	
	public EbbDto ebbDetail(int num){
		EbbDto dto=new EbbDto();
		
		String sql="select * from ebb where `num`=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto.setConame(rs.getString("coname"));
				dto.setNalja(rs.getDate("nalja"));
				dto.setDeadline(rs.getString("deadline"));
				dto.setCoposition(rs.getString("coposition"));
				dto.setCount(rs.getInt("count"));
				dto.setPosition(rs.getString("position"));
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
	
	
	public void insertList(String id,String name,String position,String coname,String content,String deadline,String coposition) {
		String sql="insert into ebb (id,name,position,coname,content,deadline,coposition,nalja) values(?,?,?,?,?,?,?,now())";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, position);
			pstmt.setString(4, coname);
			pstmt.setString(5, content);
			pstmt.setString(6, deadline);
			pstmt.setString(7, coposition);
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
	
	public void deleteEmp(int num) {
		String sql="UPDATE `ebb` SET `DELETE`=1 WHERE `num`=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
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
	
	public void countEmp(int num,int count) {
		count++;
		String sql="UPDATE `ebb` SET `COUNT`=? WHERE `num`=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, count);
			pstmt.setInt(2, num);
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