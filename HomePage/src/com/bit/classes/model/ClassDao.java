package com.bit.classes.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.sugang.model.SugangListDto;

public class ClassDao {
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
	
	public java.util.List<ClassDto> classList(){
		java.util.List<ClassDto> list =new ArrayList<>();
		
		String sql="select * from class where `delete`=0 order by num desc";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ClassDto bean=new ClassDto();
				bean.setNum(rs.getInt("num"));
				bean.setId(rs.getString("id"));
				bean.setName(rs.getString("name"));
				bean.setPosition(rs.getString("position"));
				bean.setGroup(rs.getString("group"));
				bean.setGangsa(rs.getString("gangsa"));
				bean.setPeriod(rs.getString("period"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setDelete(rs.getInt("delete"));
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
	
	public ClassDto classDetail(int num){
		ClassDto dto=new ClassDto();
		
		String sql="select * from class where `num`=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setPosition(rs.getString("position"));
				dto.setGroup(rs.getString("group"));
				dto.setGangsa(rs.getString("gangsa"));
				dto.setPeriod(rs.getString("period"));
				dto.setNalja(rs.getDate("nalja"));
				dto.setDelete(rs.getInt("delete"));
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
	
	public void insertList(String id,String name,String position,String group,String gangsa,String period) {
		String sql="INSERT INTO `lmsdb`.`class` (`ID`, `NAME`, `POSITION`, `group`, `gangsa`, `period`, `nalja`) values(?,?,?,?,?,?,now())";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, position);
			pstmt.setString(4, group);
			pstmt.setString(5, gangsa);
			pstmt.setString(6, period);
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
	
	public void updateClass(int num,String group,String gangsa,String period) {
		String sql="UPDATE `class` SET `group`=?,`gangsa`=?,`period`=? WHERE `num`=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, group);
			pstmt.setString(2, gangsa);
			pstmt.setString(3, period);
			pstmt.setInt(4, num);
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
	
	public void deleteClass(int num) {
		String sql="UPDATE `class` SET `DELETE`=1 WHERE `num`=?";
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
}