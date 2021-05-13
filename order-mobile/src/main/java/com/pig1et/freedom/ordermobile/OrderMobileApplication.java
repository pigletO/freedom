package com.pig1et.freedom.ordermobile;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: pig1etO
 * @create: 2021-05-13 20:13
 **/
@MapperScan("com.pig1et.freedom.*.mapper")
@SpringBootApplication
public class OrderMobileApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMobileApplication.class, args);
    }
}
