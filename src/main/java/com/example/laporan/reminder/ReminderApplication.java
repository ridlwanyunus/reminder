package com.example.laporan.reminder;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ReminderApplication implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(ReminderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
