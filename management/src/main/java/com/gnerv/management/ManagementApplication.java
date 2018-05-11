package com.gnerv.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 神经元基础平台
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
@SpringBootApplication
@MapperScan("com.gnerv.**.mapper")
public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}
}
