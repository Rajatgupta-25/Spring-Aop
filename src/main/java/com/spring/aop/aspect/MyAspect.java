package com.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	//only for makePayment method
	@Before("execution(* com.spring.aop.service.PaymentServiceImpl.makePayment())")
//	for all methods
//	@Before("execution(* com.spring.aop.service.PaymentServiceImpl.*)")
	public void printBefore() {
		System.out.println("Payment started");
	}
	
	
	//If we have a parameter inside makePayment method like makePayment(int amount)
	//Then we have to change our expression as
//	@Before("execution(* com.spring.aop.service.PaymentServiceImpl.makePayment(..))")
//	public void printBefore() {
//		System.out.println("Payment started");
//	}
	
	
	@After("execution(* com.spring.aop.service.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("Payment done");
	}
	
}
