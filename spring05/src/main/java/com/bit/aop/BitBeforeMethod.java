package com.bit.aop;

import java.lang.reflect.Method;

import org.mariadb.jdbc.internal.logging.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class BitBeforeMethod implements MethodBeforeAdvice {
	Logger log=Logger.getLogger(this.getClass());

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		log.debug("before...");
		System.out.println("before...");
	}

}
