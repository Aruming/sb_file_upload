package com.ll.exam.sb_file_upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SbFileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbFileUploadApplication.class, args);
	}

}
