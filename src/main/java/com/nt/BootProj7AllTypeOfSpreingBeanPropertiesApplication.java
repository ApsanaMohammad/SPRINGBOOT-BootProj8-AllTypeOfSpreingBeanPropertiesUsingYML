package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.CompanyDetails;

@SpringBootApplication
public class BootProj7AllTypeOfSpreingBeanPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj7AllTypeOfSpreingBeanPropertiesApplication.class, args);

		CompanyDetails com=ctx.getBean("company",CompanyDetails.class);
		System.out.println(com);
	}

}
