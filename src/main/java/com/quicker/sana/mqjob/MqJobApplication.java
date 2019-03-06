package com.quicker.sana.mqjob;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.quicker.sana.mqjob.mapper")
public class MqJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqJobApplication.class, args);
    }

}
