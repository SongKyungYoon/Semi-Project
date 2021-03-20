package com.bit.dept.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.bit.dept.model.entity.DeptVo;

public class DeptDaoTest {
	DeptDao deptDao;
	static DeptVo target;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		target=new DeptVo(0,"test1","test2");
	}
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context;
		context=new GenericXmpApplicationContext("")
		deptDao=(DeptDao) context.getBean("deptDao");
	}
	@Test
	public void test1SelectAll() {
		assertNotNull(deptDao);
		try {
			assertNotNull(deptDao.selectAll());
			assertFalse(deptDao.selectAll().size()==0);
		}catch (SQLException e) {
		fail("Not yet implemented");
		}
	}
	@Test
	public void test3SelectOne() {
		try {
			assertEquals(target,deptDao.selectOne(target.getDeptno()));
		} catch(SQLException e) {
		fail("Not yet implemented");
		}
	}
	@Test
	public void test4UpdateOne() {
		target.setDname("edit1");
		target.setLoc("edit2");
		try {
			assertSame(1, deptDao.updateOne(target));
		}catch(SQLException e) {
			fail("Not yet implemented");
		}
		
	}
	@Test
	public void test5DeleteOne() {
		target.setDname("edit1");
		target.setLoc("edit2");
		try {
			assertSame(1, deptDao.updateOne(target));
		}catch(SQLException e) {
			fail("Not yet implemented");
		}
		
	}
}
