package com.example.springconcept;

import com.example.springconcept.component.DemoBean;
import com.example.springconcept.component.EmployeeBean;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringconceptApplication {
 	public static final Logger logger = LoggerFactory.getLogger(SpringconceptApplication.class);
	public static void main(String[] args) {
		logger.info("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(SpringconceptApplication.class, args);
		logger.info("Checking Context: {}",context.getBean(DemoBean.class));
		logger.info("\n*** Example Using @Autowire annotaion on property ***");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Steve");
		employeeBean.showEmployeeDetails();
	}

}
