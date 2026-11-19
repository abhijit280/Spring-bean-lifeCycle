package com.banking.bean.life.cycle.magmt;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.banking.bean.life.cycle.pojo.Employee;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
public class EmployeeMagmt implements InitializingBean, DisposableBean  {
	@Autowired
	private Employee employee; //prototype
	
	
	public void displayEmp() {
		
		String result = employee.display();
		System.out.println(result);
	}
	@PostConstruct
	public void postConstuct() {
		System.out.println("2. EmployeeMagmt.postConstuct()::::::::::: intialization ");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("3. EmployeeMagmt.afterPropertiesSet()::::::::: to ckeck the init it ready to use or not");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("6. EmployeeMagmt.destroy():::::::::::: destroy");
		// TODO Auto-generated method stub
		
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("5. EmployeeMagmt.cleanUp():::::::::::::::: cleanup the memory");
	}
	
	
}
