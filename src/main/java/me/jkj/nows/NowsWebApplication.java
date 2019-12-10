package me.jkj.nows;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("me.jkj.nows.dao")
public class NowsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NowsWebApplication.class, args);
	}

}
