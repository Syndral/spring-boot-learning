package com.scmath.springbootweb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * @author yt
 */

@SpringBootApplication
public class WebApplication {

    //@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        System.out.println("bean----->commandLineRunner(ctx)");
        // 目的是
        return args -> {
            System.out.println("来看看 SpringBoot 默认为我们提供的 Bean：");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            Arrays.stream(beanNames).forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
