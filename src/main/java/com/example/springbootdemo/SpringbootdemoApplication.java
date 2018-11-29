package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、@EnableAutoConfiguration 默认扫描当前类中的Controller，如要扫描其他包下的Controller
 *    需配合注解@ComponentScan("com.example.springboodtemo")来使用
 *    @ComponentScan扫多个包 ：@ComponentScan(basePaPackages={"","",""})
 *    缺点：当大量Controller包时写太多麻烦。
 * 2、@SpringBootApplication自动扫描当前包和当前包的同级包，包括统计包下的子包。
 *   缺点：影响性能
 */
@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }
}
