package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by 54110 on 2020/6/8.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DangdangEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DangdangEsApplication.class,args);
    }
}
