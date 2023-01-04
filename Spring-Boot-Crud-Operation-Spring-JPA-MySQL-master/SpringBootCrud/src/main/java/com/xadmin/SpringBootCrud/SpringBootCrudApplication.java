package com.xadmin.SpringBootCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xadmin.SpringBootCrud.controller"})
//@ComponentScan(basePackages = {"com.xadmin.SpringBootCrud.service"})
//@ComponentScan(basePackages = {"com.xadmin.SpringBootCrud.repository"})
@ComponentScan(basePackages = {"com.xadmin.SpringBootCrud.bean"})


public class SpringBootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

}
