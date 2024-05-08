package com.nt;

import java.io.PrintStream;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication

public class BootProj01DependencyInjectionApplication {
	
	
	@Bean(name="dt")
	public  LocalDate  createDate() {
		System.out.println("BootProj01DependencyInjectionApplication.createDate()");
		return LocalDate.now();
	}

	public static void main(String[] args) {
		//get IOC cointainer
		   ApplicationContext ctx=SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
		    //get Spring bean class obj ref (Target)
		   SeasonFinder  finder=ctx.getBean("sf",SeasonFinder.class);
		   //invoke the b.method
		   String resultMsg=finder.findSeason();
		   System.out.println("output is "+resultMsg);
		   
		   //close container
		   ((ConfigurableApplicationContext) ctx).close();
	}

}
