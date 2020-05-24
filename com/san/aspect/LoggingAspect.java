package com.san.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

//	@After("@annotation(com.san.aspect.Logging)")
	public void beforeExe1() {
		System.out.println("After Execution");
	}

//	@Before("common()")
//	public void beforeExe2() {
//		System.out.println("Before Execution 2");
//	}

//	@Pointcut("execution(* set*(..))")
	public void common1() {}
	
//	@Pointcut("execution( * getCircle())")
	public void common2() {}
	
}
