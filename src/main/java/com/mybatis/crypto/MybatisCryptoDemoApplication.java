package com.mybatis.crypto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.mybatis.crypto.mapper")
public class MybatisCryptoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisCryptoDemoApplication.class, args);
    }

}
