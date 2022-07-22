package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.service.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/config.xml");
        PaymentService paymentObj = context.getBean("payment", PaymentService.class);
        
        paymentObj.makePayment();
    }
}
