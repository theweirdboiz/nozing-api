package com.kienthuc.songService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
@ComponentScan({ "com.kienthuc.songService" })
public class SongServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongServiceApplication.class, args);
	}

}
