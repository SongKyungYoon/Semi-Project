package com.bi.gradelist.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class GradelistDao {
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
	
	public java.util.List<GradelistDto> gradeList(){
		java.util.List<GradelistDto> list =new ArrayList<>();
		
		String sql="select * from gradelist where `delete`=0 order by num desc";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				GradelistDto bean=new GradelistDto();
				bean.setNum(rs.getInt("num"));
				bean.setID(rs.getString("ID"));
				bean.setNAME(rs.getString("NAME"));
				bean.setPOSITION(rs.getString("POSITION"));
				bean.setGroup(rs.getString("group"));
				bean.setStuname(rs.getString("stuname"));
				bean.setJava(rs.getInt("java"));
				bean.setDatabase(rs.getInt("database"));
				bean.setFramework(rs.getInt("framework"));
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
	
	public java.util.List<GradelistDto> gradeDetail(String group){
		java.util.List<GradelistDto> list =new ArrayList<>();
		
		String sql="select * from gradelist where `delete`=0 and `group`=? order by num";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, group);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				GradelistDto bean=new GradelistDto();
				bean.setNum(rs.getInt("num"));
				bean.setID(rs.getString("ID"));
				bean.setNAME(rs.getString("NAME"));
				bean.setPOSITION(rs.getString("POSITION"));
				bean.setGroup(rs.getString("group"));
				bean.setStuname(rs.getString("stuname"));
				bean.setJava(rs.getInt("java"));
				bean.setDatabase(rs.getInt("database"));
				bean.setFramework(rs.getInt("framework"));
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
	
	
	public GradelistDto gradeDetail(int num){
		GradelistDto dto=new GradelistDto();
		
		String sql="select * from gradelist where `num`=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setID(rs.getString("ID"));
				dto.setNAME(rs.getString("NAME"));
				dto.setPOSITION(rs.getString("POSITION"));
				dto.setGroup(rs.getString("group"));
				dto.setStuname(rs.getString("stuname"));
				dto.setJava(rs.getInt("java"));
				dto.setDatabase(rs.getInt("database"));
				dto.setFramework(rs.getInt("framework"));
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
	
	public void insertList(String ID,String NAME,String POSITION,String group,String stuname,int java,int database,int framework) {
		String sql="INSERT INTO `lmsdb`.`gradelist` (`ID`, `NAME`, `POSITION`, `group`, `stuname`, `java`, `database`, `framework`) values(?,?,?,?,?,?,?,?)";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, ID);
			pstmt.setString(2, NAME);
			pstmt.setString(3, POSITION);
			pstmt.setString(4, group);
			pstmt.setString(5,stuname);
			pstmt.setInt(6, java);
			pstmt.setInt(7, database);
			pstmt.setInt(8, framework);
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
	
	public void updateGrade(int num,String group,String stuname,int java, int database, int framework) {
		String sql="UPDATE `gradelist` SET `group`=?,`stuname`=?,`java`=?,`database`=?,`framework`=? WHERE `num`=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, group);
			pstmt.setString(2, stuname);
			pstmt.setInt(3, java);
			pstmt.setInt(4, database);
			pstmt.setInt(5, framework);
			pstmt.setInt(6, num);
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
	
	public void deleteGrade(int num) {
		String sql="UPDATE `gradelist` SET `DELETE`=1 WHERE `num`=?";
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